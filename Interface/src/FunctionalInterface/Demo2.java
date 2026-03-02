package FunctionalInterface;

import java.util.function.Function;

class C2 implements Function<String,Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		C2 c=new C2();
		System.out.println(c.apply("sexy"));

	}

}
