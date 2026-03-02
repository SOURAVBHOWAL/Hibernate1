package OOPS.Polymorphism.MethodOverriding;

public class Child extends Parent{
	@Override //informative to developer(optional), recommended
	public void show() {
		System.out.println("child");
	}
}
