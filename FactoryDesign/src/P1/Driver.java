package P1;

public class Driver {

	public static void main(String[] args) {
		
		LazyInit l3=LazyInit.lazyFactory();
		EagerInit l4=EagerInit.eagerFactory();
		System.out.println(l3);
		System.out.println(l4);
	}

}
