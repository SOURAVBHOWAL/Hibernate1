package CodeTest.InterfaceConcrete;

public class Child implements Parent{
	public static void main(String[] args) {
		System.out.println(var);
		
		//m1();//not allowed
		Parent.m1();//allowed
	}
}
