package HAS_A.BiDirectional;

public class Driver {
	public static void main(String[] args) {
		
		Engine en=new Engine();
		Car c=new Car();
		
		System.out.println(c.col);
		c.en=en;//assign engine to car
		System.out.println(c.en.nCylinder);
		System.out.println(en.nCylinder);
		en.c=c;//assign car to engine
		System.out.println(en.c.col);
		
		
		

	}
}
