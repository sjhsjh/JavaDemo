package javademo;

public interface ITest {
	public int IMember = 1;;
	public void test();
	
	public default void defaultMetod(){
		int a = 8;
	}
	
}
