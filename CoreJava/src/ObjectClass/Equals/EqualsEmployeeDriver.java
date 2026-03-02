package ObjectClass.Equals;

public class EqualsEmployeeDriver {

	public static void main(String[] args) {
		
		String s1="ja";
		String s4=s1+"va";
		String s2="java";
		String s3=new String("java");
//		System.out.println(s4.equals(s3));
//		System.out.println(s4==s2);
		
		EqualsEmployee e1 = new EqualsEmployee(1,"abc");
		EqualsEmployee e2 = new EqualsEmployee(1,"abc");
		EqualsEmployee e3 = e1;//same reference equals is true
	
		System.out.println(e1.equals(e3));
	}

}
