package HAS_A.UniDirectional;

public class Driver {

	public static void main(String[] args) {
		Engine en=new Engine();
		System.out.println(en.nCylinder);
		
		Car c=new Car();
		System.out.println(c.col);
		System.out.println(c.en);
		c.en=en;
		System.out.println(c.en.nCylinder);
		

	}

}
