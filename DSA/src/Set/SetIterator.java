package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object o) {
		Student oth=(Student) o;
		return this.id==oth.id && Objects.equals(name, oth.name);
		
	}
	@Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
	
}

public class SetIterator {

	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<>();
		hs.add(new Student(3,"bdc"));
		hs.add(new Student(1,"jhc"));
		hs.add(new Student(6,"bdc"));
		hs.add(new Student(3,"bdc"));
		Iterator<Student> it=hs.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s.id+" "+s.name);
		}

	}

}
