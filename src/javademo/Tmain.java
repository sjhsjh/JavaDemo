package javademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
		
		
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
		  static int kk = 5;
		  static String str1 = "asd";
		  static int a[] = new int[6];
		  
		  public static void main(String[] args) { 
//			  SupplementalAdminAreas supplementalAdminAreas[] = new SupplementalAdminAreas[2];
//			  supplementalAdminAreas[0] = new SupplementalAdminAreas("name1", "name11");
//			  supplementalAdminAreas[1] = new SupplementalAdminAreas("name2", "name22");
//			  System.out.println(Arrays.toString(supplementalAdminAreas));
//			  
//			  List<SupplementalAdminAreas> list = new ArrayList<Tmain.SupplementalAdminAreas>();
//			  list.add(new SupplementalAdminAreas("name1", "name11"));
//			  list.add(new SupplementalAdminAreas("name3", "name33"));
//			  System.out.println(Arrays.toString(list.toArray()));
			   List<String> hasMsgViewItems = new ArrayList<String>();
			   hasMsgViewItems.add("asd");
			   hasMsgViewItems.add("asd2");
			   hasMsgViewItems.removeAll(hasMsgViewItems);
			   
		        Map paramsMap = new HashMap<String, String>();
		        paramsMap.put("details", "true");
		        paramsMap.put("language", "lang");   
		        paramsMap.put("language", "lang222");
		        
		        final double s1= 4.4;
		        double s2 = s1;
		        s2 += 5;
		        System.out.println("**********************************" + s2 + hasMsgViewItems);
		        String str1 = "913,12,826";
		        if(str1.contains(","))
		        str1 = str1.replace(",", ".");
		        System.out.println(str1);
		        
//			  Tmain b=new Tmain();   
//		  	  b.printI();   
//			  Text3 t3 = new Text3();
//			  Text3 t33 = new Text3();
//			  t3.i = 100;
//			  t33 = t3;
//			  t33.i = 9999;
			  
//			  long[] mIgnoredMsg;
//			  long[] mIgnoredCall;
			  Set set = new HashSet<Integer>();
			  set.add(Integer.valueOf(5));
			  set.add(Integer.valueOf(51));
			  set.add(Integer.valueOf(51));
			  set.remove(Integer.valueOf(34));
			  
//			  java.util.Collection c = null;
//			  java.util.ArrayList al = new java.util.ArrayList();
//			  for (int i = 0; i < 5; i++) {
//			   String str = i + "";
//			   al.add(str);
//			  }
//			  c = al;
//			  java.util.Iterator it = c.iterator();
//			  for (int i = 0; i < 3; i++) {
//			   if(i==1){
//			    it.remove();	it.next(); it.remove();
//			   }
//			   System.out.println((String) it.next());
//			  }
//			 // it.remove();
//			  System.out.println("**********************************");
//			  it = c.iterator(); // 关键的！！！
//			  while (it.hasNext()) {
//			   System.out.println((String) it.next());
//			  }
			  
			//  System.out.println( (null instanceof Text3));
			  
			  
				Map<String, String> map = new HashMap<String, String>();
				map.put("key1", "value1");
				map.put("key2", "value2");
		
				HashMap<String, String> hashMap = new HashMap<String, String>();
				hashMap.put("key2", "value1");
				if (map != null) {
					hashMap.putAll(map); // map会覆盖hashMap中相同的key
				}
				System.out.println(hashMap.toString());
			  
			     List<Long> mIgnoredMsgs = new ArrayList<Long>();
			     List<Long> mIgnoredCalls = new ArrayList<Long>();
			  
			  mIgnoredMsgs.add(465454646l);
			  mIgnoredMsgs.add(1146545464622l);
			     
		if (mIgnoredMsgs != null) {
			mIgnoredMsgs.removeAll(mIgnoredMsgs);

			System.out.println(mIgnoredMsgs.size() +"wwwqe");
		}
			     
			     
			  for(int i = 0; i < mIgnoredMsgs.size(); i++){
				  System.out.println(mIgnoredMsgs.get(i));
			  }
//			  System.out.println( "=======" + t3.i);
//			  new Text2().add(t3);
//			  System.out.println( "=" + t3.i);
//  
//		  StringBuffer sb = new StringBuffer("Hello ");
//		  System.out.println("Before change, sb = " + sb);
//		  changeData(sb);
//		  System.out.println("After changeData(n), sb = " + sb);
		  
			  //Text3.asd();
//		  new Text3();
//		  new Text3();
//		    	for(int i = 0; i < mIgnoredCalls.size(); i++){
//		    		if(receiveTime == mIgnoredCalls.get(i)) return true;
//		    	}
//		    	return false;
			  double d = 22.5678;
			  System.out.println( getFormatString(d));
			  
			  d = Double.parseDouble(String.format("%.2f",d));  
			  System.out.println( d);
			  
			  
			  int kk2 = kk;
			  kk2 ++;
			  String ss = str1;
			  ss += "123";
			  System.out.println(kk2);
			  
			  
			  System.out.println("compareVersionName = " + compareVersionName());
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
		  
		  private static final int EMPTY_STR = -999;
		  private static final int UNKNOWN_STR = -99;
		  private static final int MAYBE_SAME_STR = 0;
		  
		  public static int compareVersionName( ) {
		        String newVersionName = "11.1906.029_88";//2 6
		        String oldVersionName = "11.19-06.11_925";//1 6
		        System.out.println("compare : " + newVersionName.compareTo(oldVersionName) 
		        		+ "  " + newVersionName.substring(0, 3)
		        		+ "  " + newVersionName.indexOf('.', 2));
		        
		        
		        int startIndexNew = 0, endstartIndexNew = 0, verNew = 0;
		        int startIndexOld = 0, endstartIndexOld = 0, verOld = 0;
		        do{
		        	// 得到新版本号的某个子字符串
		        	endstartIndexNew = newVersionName.indexOf('.', startIndexNew);
		        	if(endstartIndexNew != -1){
						try {
							verNew = Integer.parseInt(newVersionName.substring(startIndexNew, endstartIndexNew));
							startIndexNew = endstartIndexNew + 1;
						} catch (NumberFormatException e) {
							verNew = UNKNOWN_STR;
							startIndexNew = newVersionName.length();
							//e.printStackTrace();
						}
		        	}
		        	else{
		        		if(startIndexNew != newVersionName.length()){
							try {
								verNew = Integer.parseInt(newVersionName.substring(startIndexNew, newVersionName.length()));
							} catch (NumberFormatException e) {
								verNew = UNKNOWN_STR;
								// e.printStackTrace();
							}
		        			startIndexNew = newVersionName.length();
		        		}
		        		else{
		        			verNew = EMPTY_STR;
		        		}
		        	}

		        	
		        	// 得到旧版本号的某个子字符串
		        	endstartIndexOld = oldVersionName.indexOf('.', startIndexOld);
		        	if(endstartIndexOld != -1){
						try {
							verOld = Integer.parseInt(oldVersionName.substring(startIndexOld, endstartIndexOld));
							startIndexOld = endstartIndexOld + 1;
						} catch (NumberFormatException e) {
							verOld = UNKNOWN_STR;
							startIndexOld = oldVersionName.length();
							// e.printStackTrace();
						}
		        	}
		        	else{
		        		if(startIndexOld != oldVersionName.length()){
							try {
								verOld = Integer.parseInt(oldVersionName.substring(startIndexOld, oldVersionName.length()));
							} catch (NumberFormatException e) {
								verOld = UNKNOWN_STR;
								//e.printStackTrace();
							}
							startIndexOld = oldVersionName.length();
		        		}
		        		else{
		        			verOld = EMPTY_STR;
		        		}
		        	}
		        	
		        	if(verNew != verOld){
		        		if(verNew == UNKNOWN_STR){
		        			verNew = 0;	//tudo
		        		}
		        		else if(verOld == UNKNOWN_STR){
		        			verOld = 0;
		        		}
		        		System.out.println("verNew = " + verNew + " verOld = " + verOld);
		        		return verNew - verOld;
		        	}
		        	else if(verNew == EMPTY_STR && verOld == EMPTY_STR){
		        		System.out.println(" Both version are EMPTY_STR. ");
		        		return 0;
		        	}
		        	else if(verNew == UNKNOWN_STR && verOld == UNKNOWN_STR){
		        		System.out.println(" Both version are UNKNOWN_STR. ");
		        		return MAYBE_SAME_STR;
		        	}
		        }
		        while(verNew == verOld);
		        
		        return MAYBE_SAME_STR; 
		  }
		  
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
		  System.out.println((int)'f');
		  String a[] = new String[5];
		  String b[] = {"1", "2"};
		  }

		  public static void threePoint(String... strBuf) {	// String... strBuf
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


		  







