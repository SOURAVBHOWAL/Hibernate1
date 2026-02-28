import java.util.ArrayList;
import java.util.List;

abstract class FoodItem{
	private int id;
	private String name;
	private double price;
	
	public FoodItem(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	abstract double calculateDiscount();
}

class VegItem extends FoodItem{
	
	public VegItem(int id, String name, double price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateDiscount() {
		// TODO Auto-generated method stub
		return getPrice()*0.9;
	}
	
}

class NonVegItem extends FoodItem{
	
	public NonVegItem(int id, String name, double price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateDiscount() {
		// TODO Auto-generated method stub
		return getPrice()*0.95;
	}
	
}
class Order{
	List<FoodItem> list=new ArrayList<>();
	double bill=0.0;
	double calculateTotalBill() {
		for(FoodItem i:list) {
			bill+=i.calculateDiscount();
		}
		return bill;
	}
	
}
public class Food {
	public static void main(String[] args) {
		Order o=new Order();
		o.list.add(new VegItem(1,"veg biriyani",100.0));
		o.list.add(new NonVegItem(2,"mutton biriyani", 100.0));
		System.out.println(o.calculateTotalBill());
	}
}
