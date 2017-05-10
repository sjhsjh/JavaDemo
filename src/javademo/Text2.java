package javademo;

public class Text2 extends Text1 {
	public int re = 2;

	{
		int a = 1;
		System.out.println("2");	// 对象初始化才会执行
	}
	static int b = 999;
	static {
		
		System.out.println("1");	// 类初始化时执行
	}

	//static Tmain t = new Tmain();

	public Text2() {		// 注意new对象时不是立即执行构造函数，而是先执行类的初始化工作！！
		System.out.println("3  Text2 construct");
		System.out.println( "--" + b);
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


/*类初始化阶段,先执行最顶层父类的静态初始化块,依次向下,最后执行当前类静态初始化块,
对象初始化阶段,先执行最顶层父类的初始化块、构造器,依次向下,最后执行当前类初始化块、构造器。
所以这个执行的优先级为 : 所有类的静态初始化块(从父类自顶向下) -> 所有类的普通初始化块然后接着该类的构选器(从父类自顶向下)
==非静态初始化代码块是对象初始化时才会执行的。在每个对象生成时都会被执行一次。
==注意new对象时不是立即执行构造函数，而是先执行类的初始化工作！！
分析上面的例子,主程序两次执行new Leaf(); ,创建2个Leaf对象,第一次创建Leaf对象时,系统中还不存在Leaf类,因此需要先加载并初始化Leaf类,初始化Leaf类时会先执行其顶层父类的静态初始化块,最后才执行Leaf本身的静态初始化块.
 一旦Leaf类初始化成功后,Leaf类在该虚拟机里将一直存在,因此当第二次创建Leaf实例时无须再次对Leaf类进行初始化.
 如果实例化第二个对象,那么就没有类初始化这个步骤了,因为已经发生在第一次实例化了,类初始化只会发生一次!且在该类的所有对象实例化之前.

*/



