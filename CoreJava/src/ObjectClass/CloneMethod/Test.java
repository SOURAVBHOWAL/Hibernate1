package ObjectClass.CloneMethod;

public class Test{
	public static void main(String[] args) throws Exception
	{
		CloneEmployee e1=new CloneEmployee(101);
		CloneEmployee e2=(CloneEmployee) e1.clone();
		System.out.println(e1.hashCode()+" "+e2.hashCode());
	}
}
