package Typecasting.NonPrimitiveTypecasting;

public class DriverClass {

	public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println(p.p);
		p.pm();
		//with parent variable p we can access only parent members and not child's
		
		Child c = new Child();
		System.out.println(c.p);
		c.pm();
		System.out.println(c.c);
		c.cm();
		//child can access both parent and child members
		
		//upcasting
		Parent p1=new Child();
		System.out.println(p1.p);
		p1.pm();
		//System.out.println(p1.c);
		//p1.cm();				p1 cannot access child members
		
		//downcasting
		Parent p2 = new Child();//upcasted p2(generalization)
		Child c2=(Child)p2;//upcasted var can be downcasted (specialization)
		System.out.println(c2.p);
		c2.pm();
		System.out.println(c2.c);
		c2.cm();
		System.out.println(c2+" "+p2);
		
	}

}
