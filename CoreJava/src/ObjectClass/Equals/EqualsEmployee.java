package ObjectClass.Equals;

public class EqualsEmployee {
	int id;
	String name;
	EqualsEmployee(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			System.out.println("same object");
			return true;
		}
		if(obj==null||getClass()!=obj.getClass()) {
			System.out.println("different object or null object");
			return false;
		}
		EqualsEmployee e=(EqualsEmployee) obj;
		return this.id==e.id && this.name==e.name;
	}
}
