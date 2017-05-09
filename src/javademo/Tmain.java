package javademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
		

public class Tmain {

	
	public static class SupplementalAdminAreas{
        public String LocalizedName;
        public String EnglishName;

        public SupplementalAdminAreas(String localizedName, String englishName) {
			super();
			LocalizedName = localizedName;
			EnglishName = englishName;
		}

		@Override
        public String toString() {
            return "SupplementalAdminAreas [LocalizedName=" + LocalizedName + ", EnglishName=" + EnglishName + "]";
        }
    }
	
	
		  String[] str = new String[7];
		  int i=999;   
		  static int num = 5;
		  static String str1 = "asd";
		  static int a[] = new int[6];

		    
		  public static void main(String[] args) { 
			  // Arrays.toString(array)根list.toString得出的结果是一样的 。格式：[xx, xx, xx]
			  SupplementalAdminAreas supplementalAdminAreas[] = new SupplementalAdminAreas[2];
			  supplementalAdminAreas[0] = new SupplementalAdminAreas("name1", "name11");
			  supplementalAdminAreas[1] = new SupplementalAdminAreas("name2", "name22");
			  System.out.println(Arrays.toString(supplementalAdminAreas));
			  
			  List<SupplementalAdminAreas> tempList = Arrays.asList(supplementalAdminAreas);	// 数组转List！
			  
			  List<SupplementalAdminAreas> list = new ArrayList<Tmain.SupplementalAdminAreas>();
			  list.add(new SupplementalAdminAreas("name1", "name11"));
			  list.add(new SupplementalAdminAreas("name2", "name22"));
			  SupplementalAdminAreas[] array = list.toArray(new SupplementalAdminAreas[0]);// List转数组！new出的数组不够大api会创建一个新的空间够大的数组。
			  System.out.println(Arrays.toString(array));

			  
		// 基本类型的赋值是值传递
		// hashCode()返回的是JVM中地址的哈希码,即str在java虚拟机中的内存地址
		int num2 = num;
		num2++;
		String str2 = str1;
		// str2 += "QWE";
		System.out.println("num = " + num + " num2 = " + num2 + " str1 = "
				+ str1.hashCode() + " str2 = " + str2.hashCode());

		
		// 将int转成16进制的字符串(无0x)
		int mTCTColor = 0xffffff;
		String hexdim = Integer.toHexString(mTCTColor | 0xcc000000);
		System.out.println("toHexString " + Integer.toHexString(10) + "  "
				+ hexdim);

		
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


			  
			  ArrayList al = new ArrayList();
			  for (int i = 0; i < 5; i++) {
			   String str = i + "";
			   al.add(str);
			  }
			  Iterator it = al.iterator();
			  for (int i = 0; i < 3; i++) {
			   if(i==1){
			    it.remove();	//it.next(); it.remove();
			   }
			   System.out.println((String) it.next());
			  }
			 // it.remove();
			  System.out.println("**********************************");
			  it = al.iterator(); // 关键的！！重置？
			  while (it.hasNext()) {
			   System.out.println((String) it.next());
			  }
			  
			  // System.out.println( (null instanceof Text3));// false
			  
			  
  
		  StringBuffer sb = new StringBuffer("Hello ");
		  System.out.println("Before change, sb = " + sb);
		  changeData(sb);
		  System.out.println("After changeData(n), sb = " + sb);
		  
			  //Text3.asd();
//		 		 new Text3();
//				  new Text3();
//		    	for(int i = 0; i < mIgnoredCalls.size(); i++){
//		    		if(receiveTime == mIgnoredCalls.get(i)) return true;
//		    	}
//		    	return false;
			  double d = 22.5678;
			  System.out.println( getFormatString(d));
			  
			  d = Double.parseDouble(String.format("%.2f",d));  
			  System.out.println( d);
			  

 

			  String[] strBuf = {"asdw"};
			  threePoint(strBuf);
			  threePoint("1323");
		  }

//		  static int b = 999;
//		  
//		  static Tmain t = new Tmain();
//		  static{
//			  System.out.println("1");
//		  }
//		  {
//			  System.out.println("2");
//		  }
//		  Tmain()
//		  {
//			  System.out.println("3");
//			  System.out.println(a + "--" + b);
//		  }
//		  
//		  public static void asd(){
//			  System.out.println("4");
//		  }
//		  int a= 111;
		  

		  
	
		  
	private static double getFormatString(double tude) {
		int inte = (int) (tude * 100);
		double res = inte * 1.0 / 100;
		return res;
	}

	public static void changeData(StringBuffer strBuf) {
		StringBuffer sb2 = new StringBuffer("Hi ");
		strBuf = sb2;
		sb2.append("World!");
		System.out.println(strBuf);
		System.out.println(sb2);
		String s = "  ";
		System.out.println(s.length());
		System.out.println((int) 'f');
		String a[] = new String[5];
		String b[] = { "1", "2" };
	}

	public static void threePoint(String... strBuf) { // String... strBuf
		System.out.println("strBuf = " + strBuf.length);
	}

}  
	
//	public static void main(String[] args) {
//	int[] a = new int[6];
//		int[]b = new int[]{1,3,4};
//		
//		Text3 text3 = new Text3();
//		text3.textabstract();
//		
//		Text1[] str = new Text1[5];
//		
//		str[0] = new Text3();
//		str[0].normal();
//		
//		Text3 t3 = new Text3();
//		System.out.println(Text2.class.);
//		
//	}


		  







