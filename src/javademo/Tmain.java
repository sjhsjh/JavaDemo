package javademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
		


public class Tmain {

	public static class SupplementalAdminAreas {
		public String LocalizedName;
		public String EnglishName;

		public SupplementalAdminAreas(String localizedName, String englishName) {
			super();
			LocalizedName = localizedName;
			EnglishName = englishName;
		}

		@Override
		public String toString() {
			return "SupplementalAdminAreas [LocalizedName=" + LocalizedName
					+ ", EnglishName=" + EnglishName + "]";
		}
	}

	static int num = 5;
	static String str1 = "str1";

	public static void main(String[] args) {

		// new Text2();
		// Text2.b++;
		

		
	}


		  
		



	public static void debug() {
		// Arrays.toString(array)根list.toString得出的结果是一样的 。格式：[xx, xx, xx]
		SupplementalAdminAreas supplementalAdminAreas[] = new SupplementalAdminAreas[2];
		supplementalAdminAreas[0] = new SupplementalAdminAreas("name1", "name11");
		supplementalAdminAreas[1] = new SupplementalAdminAreas("name2", "name22");
		System.out.println(Arrays.toString(supplementalAdminAreas));

		List<SupplementalAdminAreas> tempList = Arrays.asList(supplementalAdminAreas); // 数组转List！

		List<SupplementalAdminAreas> myList = new ArrayList<Tmain.SupplementalAdminAreas>();
		myList.add(new SupplementalAdminAreas("name1", "name11"));
		myList.add(new SupplementalAdminAreas("name2", "name22"));
		SupplementalAdminAreas[] array = myList.toArray(new SupplementalAdminAreas[0]);// List转数组！new出的数组不够大api会创建一个新的空间够大的数组。
		System.out.println(Arrays.toString(array));

		
		// 基本类型的赋值是值传递
		// hashCode()返回的是JVM中地址的哈希码,即str在java虚拟机中的内存地址
		int num2 = num;
		num2++;
		String str2 = str1;
		// str2 += "QWE";
		System.out.println("num = " + num + " num2 = " + num2 + " str1 = " + str1.hashCode() + " str2 = " + str2.hashCode());

		
		// 将int转成16进制的字符串(无0x)
		int mTCTColor = 0xffffff;
		String hexdim = Integer.toHexString(mTCTColor | 0xcc000000);
		System.out.println("toHexString " + Integer.toHexString(10) + "  " + hexdim);

		
		// hashMap.putAll(map) map复制到hashMap并覆盖hashMap中相同的key
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");

		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("key2", "value1");
		if (map != null) {
			hashMap.putAll(map); // map会覆盖hashMap中相同的key
		}
		System.out.println(hashMap.toString());

		
		// 对象被赋值后两者指向同一个对象的，内容也一起改变
		Text3 t1 = new Text3();
		Text3 t2 = new Text3();
		t1.i = 100;
		t2 = t1;
		t2.i = 9999;
		System.out.println(t1.i);

		
		ArrayList list = new ArrayList();
		for (int i = 0; i < 5; i++) {
			String str = i + "";
			list.add(str);
		}
		Iterator it = list.iterator(); // 执行it.next()才会指向第一个元素
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				it.remove();
			}
			System.out.println((String) it.next());
		}
		System.out.println("**********************************");
		it = list.iterator(); // 重置指针到初始位置
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}

		// System.out.println( (null instanceof Text3));// false

		
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println("Before change, sb = " + sb);
		changeData(sb);
		System.out.println("After changeData sb = " + sb);

		
		// 去尾与四舍五入
		double d = 34.5678;
		System.out.println((int) (d * 100) / 100.0 + " " + String.format("%.2f", d));
	}

	
	public static void changeData(StringBuffer sb) {
		StringBuffer sb2 = new StringBuffer("sb2 ");
		sb = sb2;
		// sb = new StringBuffer("new sb ");
		sb.append("append!"); // 当sb与sb2指向同一对象时，其中任何一个执行append时并不会生成新对象，因此会同时改变sb和sb2的内容！！本质是只有生成了新对象才new出新的内存区域。
		System.out.println(sb);
		System.out.println(sb2);

	}
	
	
}  
	



		  







