package OOPS1;

public class AaAcc {
	private double bal=6000;
	private short pin=1234;
	public double getBal(short pin) {//if access modifier is public it is still accessible by
		if(this.pin==pin)			//unwanted classes.
			return this.bal;	   //Authorization
		return -1;
	}
	public void setBal(double amt) {
		this.bal+=amt; 
	}
}
