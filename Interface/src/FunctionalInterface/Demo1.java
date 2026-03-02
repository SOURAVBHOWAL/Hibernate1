package FunctionalInterface;

interface Draw{
	void circle();
}
class C1 implements Draw{
	public void circle() {
		System.out.println("draw");
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Draw d1=new Draw(){
			public void circle() {
				System.out.println("hi");
			}
		};
		Draw d2=()->{System.out.println("Lambda1");};
		d2.circle();
		Draw d3=()->{System.out.println("Lambda2");};
		d3.circle();
	}
}
