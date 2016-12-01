package javademo;

import java.util.*;
import java.lang.reflect.*;

/**
 * This program uses reflection to print all features of a class.
 * @version 1.1 2004-02-21
 * @author Cay Horstmann
 */
public class ReflectionMethods
{
   public static void main(String[] args)
   {
      // read class name from command line args or user input
      String name;
      if (args.length > 0) name = args[0];
      else
      {
         // Scanner in = new Scanner(System.in);
         Date date;
         System.out.println("Enter class name (e.g. java.util.Date): ");
         name = "java.util.Date";
         // name = in.next();
      }
      // System.out.print("name " + name);
      
      try
      {
         // print class name and superclass name (if != Object)
         Class cl = Class.forName(name);
         Class supercl = cl.getSuperclass();
         myReflection(name);
         
         
         String modifiers = Modifier.toString(cl.getModifiers());
         if (modifiers.length() > 0) System.out.print(modifiers + " ");
         System.out.print("class " + name);
         if (supercl != null && supercl != Object.class) 
        	 System.out.print(" extends " + supercl.getName());

         
         System.out.print("\n{\n");
         printConstructors(cl);
         System.out.println();
         printMethods(cl);
         System.out.println();
         printFields(cl);
         System.out.println("}");
      }
      catch (ClassNotFoundException e)
      {
         e.printStackTrace();
      }
      System.exit(0);
   }

   
   public static void myReflection(String classStr){
	   String str = "";
		try {
			Class objectClass = Class.forName(classStr);
			
			// ①反射类的声明
			Class superClass = objectClass.getSuperclass();
			Class interfaces[] = objectClass.getInterfaces();
			str = Modifier.toString(objectClass.getModifiers()) + " " + objectClass;
			if(superClass != null && superClass != Object.class){	// 继承
				str += " extends " + superClass.getName();		// Class有getSimpleName方法，interface也有class
			}
			if(interfaces.length > 0){	// 实现
				str += " implements ";
				for(int i = 0; i < interfaces.length; i++){
					if(i == 0){
						str += interfaces[i].getName();
						continue;
					}
					str += ", " + interfaces[i].getName();
				}
			}
			System.out.println("类的声明：" + str + "\n");
			
			// ②反射类的成员变量
			str = "";
			Field[] fields = objectClass.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);
			
			for(int i = 0; i < fields.length; i++){
				str = Modifier.toString(fields[i].getModifiers());
				Class fieldType = fields[i].getType();
				str += " " + fieldType.getName() + " " + fields[i].getName();
				Object fieldValue = fields[i].get(objectClass.newInstance());	// 需要递归才能显示值,是obj不是objectClass！
				if(fields[i].getType().isPrimitive()){////////////////
					str += "=" + fieldValue;
				}
				System.out.println("类的成员变量：" + str);
			}
			System.out.print("\n");
/*			类的成员变量：private static final [Ljava.lang.String; wtb
			类的成员变量：private static final [I ttb    ??? */
			
			
			// ③反射类的构造方法
			Constructor[] constructors = objectClass.getDeclaredConstructors();
			for(int i = 0; i < constructors.length; i++){
				str = Modifier.toString(constructors[i].getModifiers()) + " " + constructors[i].getName() + "(";	// Constructor无getSimpleName方法！
				Class paraClass[] = constructors[i].getParameterTypes();	// 注意这里竟然没有自动装箱,得出int.class，它无包名！
				for(int j = 0; j < paraClass.length; j++){ // 不定长参数？
					if(j != 0){
						str += ", ";
					}
					str += paraClass[j].getSimpleName();
					// if(paraClass[j] == int.class)	System.out.println("!!");// !!!!!!
				}
				str += ")";
				System.out.println("类的构造方法：" + str);
			}
			System.out.print("\n");
			
			
			// ④反射类的方法
			Method[] methods = objectClass.getDeclaredMethods();
			for(int i = 0; i < methods.length; i++){
				str = Modifier.toString(methods[i].getModifiers()) + " ";
				str += methods[i].getReturnType().getSimpleName() + " " + methods[i].getName() + "(";
				Class[] paraClass = methods[i].getParameterTypes();
				for(int j = 0; j < paraClass.length; j++){
					if(j != 0){
						str += ", ";
					}
					str += paraClass[j].getSimpleName();
				}
				str += ")";
				System.out.println("类的方法:" + str);
			}
			System.out.print("\n");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	   
   }
    
   
   /**
    * Prints all constructors of a class
    * @param cl a class
    */
   // public Double(Class cl)
   // getModifiers + getName + getParameterTypes & getName!!!!!
   public static void printConstructors(Class cl)
   {
      Constructor[] constructors = cl.getDeclaredConstructors();

      for (Constructor c : constructors)
      {
         String name = c.getName();				// onstructor.getName!!
         System.out.print("   ");
         String modifiers = Modifier.toString(c.getModifiers());	// Modifier.toString得到所有修饰关键字！
         if (modifiers.length() > 0) System.out.print(modifiers + " ");         
         System.out.print(name + "(");

         // print parameter types
         Class[] paramTypes = c.getParameterTypes();	// 实参
         for (int j = 0; j < paramTypes.length; j++)
         {
            if (j > 0) System.out.print(", ");
            System.out.print(paramTypes[j].getName());
         }
         System.out.println(");");
      }
   }

   /**
    * Prints all methods of a class
    * @param cl a class
    */
   // public static void printMethods(Class cl)
   // getModifiers + getReturnType + getName + getParameterTypes & getName!!!!!
   public static void printMethods(Class cl)
   {
      Method[] methods = cl.getDeclaredMethods();

      for (Method m : methods)
      {
         Class retType = m.getReturnType();		// 与Constructor不同之处！
         
         String name = m.getName();		// method.getName!!
         System.out.print("   ");
         // print modifiers, return type and method name
         String modifiers = Modifier.toString(m.getModifiers());
         if (modifiers.length() > 0) System.out.print(modifiers + " ");         
         System.out.print(retType.getName() + " " + name + "(");

         // print parameter types
         Class[] paramTypes = m.getParameterTypes();
         for (int j = 0; j < paramTypes.length; j++)
         {
            if (j > 0) System.out.print(", ");
            System.out.print(paramTypes[j].getName());
         }
         System.out.println(");");
      }
   }

   /**
    * Prints all fields of a class
    * @param cl a class
    */
   // private static int a;  
   // getModifiers + getType + getName !!!!!
   public static void printFields(Class cl)
   {
      Field[] fields = cl.getDeclaredFields();	// fields.length可为0，但fields不为null。

      for (Field f : fields)
      {
         Class type = f.getType();		// getType means get Class Type!!
         String name = f.getName();		// field.getName!!
         System.out.print("   ");
         String modifiers = Modifier.toString(f.getModifiers());
         if (modifiers.length() > 0) System.out.print(modifiers + " ");         
         System.out.println(type.getName() + " " + name + ";");
      }
   }
}
