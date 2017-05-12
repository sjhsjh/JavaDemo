package javademo;

import java.lang.reflect.*;
import java.util.*;

/**
 * This program uses reflection to spy on objects.
 * 
 * @version 1.11 2004-02-21
 * @author Cay Horstmann
 */
public class ObjectReflectToString {
	public static void main(String[] args) {
		ArrayList<Integer> squares = new ArrayList<Integer>();
		for (int i = 1; i <= 4; i++)
			squares.add(i * i);
		System.out.println(new ObjectAnalyzer().toString(squares));
		System.out.println(squares.toString());	//	[1, 4, 9, 16]
	}
}

/**
 * java.util.ArrayList[elementData=class java.lang.Object[]{
	java.lang.Integer[value=1][][],
	java.lang.Integer[value=4][][],
	java.lang.Integer[value=9][][],
	java.lang.Integer[value=16][][],
	java.lang.Integer[value=25][][],null,null,null,null,null},size=5]
    [modCount=5][][]  外面总共4个中括号的内容是ArrayList及其父类的field.
 */
class ObjectAnalyzer {
	private ArrayList<Object> visited = new ArrayList<Object>();

	/**
	 * Converts an object to a string representation that lists all fields.
	 * 
	 * @param obj an object
	 * @return a string with the object's class name and all field names and
	 *         values
	 */
	public String toString(Object obj) {
		if (obj == null)
			return "null";
		if (visited.contains(obj))
			return "...";
		visited.add(obj);
		Class cl = obj.getClass();
		
		if (cl == String.class)
			return (String) obj;
		/**
		 * class.getComponentType.toString  + for循环遍历元素 + "[]{" + "}"
		 */
		if (cl.isArray()) {
			String r = cl.getComponentType() + "[]{";  // the array componet type!  class.toString()得到前缀为class的字符串！！
			for (int i = 0; i < Array.getLength(obj); i++) {	// 相当于强转obj成array再求size！！！
				if (i > 0)
					r += ",";
				Object val = Array.get(obj, i);  // 数组中的单个对象Integer
				if (cl.getComponentType().isPrimitive()) // 处理基本类型的数组.
					r += val;
				else
					r += toString(val);
			}
			return r + "}";
		}

		/**
		 * class.getName[field.getName=xxx]
		 */
		String r = cl.getName();	// java.util.ArrayList
		// inspect the fields of this class and all superclasses
		do {
			r += "[";
			Field[] fields = cl.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);
			// get the names and values of all fields
			int i = 0;
			for (; i < fields.length; i++) {
				Field f = fields[i];
				if (!Modifier.isStatic(f.getModifiers())) {
					if (!r.endsWith("["))
						r += ",";
					r += f.getName() + "=";	// Name = xxx
					try {
						Object val = f.get(obj); // 核心！field.get(theObjectContainsTheField)!! 奇怪地得到了大小为10的object数组
						Class t = f.getType();
						if (t.isPrimitive())
							r += val;
						else
							r += toString(val);  // 递归
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			r += "]";
			cl = cl.getSuperclass();
		} while (cl != null);

		return r;
	}

}
