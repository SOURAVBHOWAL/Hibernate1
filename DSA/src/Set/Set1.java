package Set;

import java.util.Collections;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		TreeSet<Integer> s1=new TreeSet<>((a,b)->a-b);
		s1.add(90);
		s1.add(10);
		s1.add(50);
		s1.add(60);
		s1.add(50);
		s1.add(100);
		s1.pollFirst();
		s1.forEach(System.out::println);;
		
	}
}
