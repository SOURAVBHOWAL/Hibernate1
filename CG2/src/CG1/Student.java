package CG1;

public class Student{
	public String name;
	public int roll;
	public long mobile;
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public Student(String name, int roll, long mobile) {
		
		this(name, roll);
		
		this.mobile = mobile;
	}
	public Student(Student obj) {
		super();
		this.name=obj.name;
		this.roll=obj.roll;
		this.mobile=obj.mobile;
		// TODO Auto-generated constructor stub
	}
	
	

}

