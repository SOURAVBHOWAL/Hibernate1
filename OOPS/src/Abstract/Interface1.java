package Abstract;

public interface Interface1 {
	// variable is constant and cannot be modified.
	static int i=0;// by default static and final, can be declared and initialized only and not only declaration.
	int j=0;
	static int x=9;
	final int abc=0;
   

}

public class A implements Interface1{
	public static void main(String[] args) {
		System.out.println(i);
	}
}
