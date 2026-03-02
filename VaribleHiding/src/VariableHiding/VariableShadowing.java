package VariableHiding;

class Demo{
	int x=10;
	static int y=30;
	void show() {
		int x=20;
		int y=40;
		System.out.println(y);
		System.out.println(this.y);// this is internally converted to Demo
		System.out.println(Demo.y);
	}
}
public class VariableShadowing {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.show();
	}

}
