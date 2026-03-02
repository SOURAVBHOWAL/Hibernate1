package P1;

public class LazyInit {
	private static LazyInit lazy;
	private LazyInit() {
	}
	public static LazyInit lazyFactory() {// public static mandatory
		if(lazy==null)
			lazy=new LazyInit();
		return lazy;
	}
}
