package javademo;

public class Text2 extends Text1 {
	public int re = 2;

	{
		re = 22;
		System.out.println("2");	// 对象初始化才会执行
	}
	static int b = 99;
	static {
		
		System.out.println("1");	// 类初始化时执行
	}

	public Text2() {		// 注意new对象时不是立即执行构造函数，而是先执行类的初始化工作！！
		System.out.println("3  Text2 construct");
		System.out.println( "b = " + b + " re = " + re);
	}

	public void add(Text3 t3) {
		t3.i = 99;
		System.out.println("add:" + t3.i);
	}

	@Override
	public void textabstract() {
		System.out.println("textabstract  text2");

	}

	
}






