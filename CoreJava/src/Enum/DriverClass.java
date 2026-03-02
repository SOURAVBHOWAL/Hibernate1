package Enum;

public class DriverClass {

	public static void main(String[] args) {
		OrderStatus status = OrderStatus.SHIPPED;
		int i=status.getCode();
		
		switch(status) {
		case PLACED:
			System.out.println("placed");
			break;
		case SHIPPED:
			System.out.println("shipped");
			break;
		default:
			System.out.println("delivered");
		}
	}

}
