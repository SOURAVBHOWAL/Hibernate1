import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
interface I1{
	String func(String s1,String s2);
}
public class Demo1 {
	
	public static String pri(String s1,String s2) {
		return (s1+s2);
	}
	
	public static void main(String[] args) {
		Function<Integer,Double> f=(n)->Math.sqrt(n);
		System.out.println(f.apply(16));
		Function<Integer,Double> f2=Math::sqrt;
		System.out.println(f2.apply(25));
//		I1 i=Math::sqrt;
//		System.out.println(i.func(49.0));
		BiFunction<String,String,String> b=Demo1::pri;
		System.out.println(b.apply("hi","bye"));

		I1 i=Demo1::pri;
		System.out.println(i.func("hello","bye"));
		
		List<String> emp=new ArrayList<>();
		emp.add("a1");
		emp.add("a2");
		emp.add("a3");
		emp.add("a2");
		
		Function<List<String> ,Set<String>> f1=(emp1)->new HashSet<>(emp1);
		System.out.println(f1.apply(emp));
		Function<List<String> ,Set<String>> f3=HashSet::new;
		System.out.println(f3.apply(emp));
		
		// Consumer Functional interface
		Consumer<Integer> c=new Consumer<>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		Consumer<Integer> c1=t->System.out.println(t);
		Consumer<Integer> c3=System.out::println;
		c3.accept(10);
		emp.forEach(System.out::println);
		
	}

}
