package javademo;

public  class Text2 extends Text1{

	public int re = 2; 

	

	  public void add(Text3 t3){
		  t3.i = 99;
		  System.out.println( "add:" + t3.i);
	  }


	@Override
	public void textabstract() {
		System.out.println("textabstract  text2");
		
	}

}

