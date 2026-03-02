package Set;

import java.util.*;

enum DAYS{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class TreeSet1 {
	
	static TreeSet<DAYS> ts=new TreeSet<>((a,b)->a.name().compareTo(b.name()));
	public static void main(String[] args) {
		ts.add(DAYS.FRIDAY);
		ts.add(DAYS.MONDAY);
		ts.add(DAYS.SUNDAY);
		ts.add(DAYS.TUESDAY);
		ts.add(DAYS.MONDAY);
		System.out.println(ts);
		System.out.println(DAYS.valueOf("MONDAY"));
	}
	

}
