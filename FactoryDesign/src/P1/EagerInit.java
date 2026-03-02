package P1;

public class EagerInit {
	private static EagerInit eager=new EagerInit();
	private EagerInit() {
	}
	public static EagerInit eagerFactory() {// public static mandatory
		return eager;
	}
}
