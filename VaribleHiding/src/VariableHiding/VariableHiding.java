package VariableHiding;


class Parent{
	int x=10;
}
class Child extends Parent{
	int x=20;
	void show() {
		
	}
}
public class VariableHiding {

	public static void main(String[] args) {
		Parent p=new Child();
		System.out.println(p.x); //10
		Child c=new Child();
		System.out.println(c.x); //20 // hides parent variable;
		System.out.println();
	}

}
