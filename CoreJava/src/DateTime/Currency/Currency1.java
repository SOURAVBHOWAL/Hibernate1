package Currency;

import java.util.Currency;

public class Currency1 {
	public static void main(String[] args) {
		Currency inr=Currency.getInstance("INR");
		Currency usd=Currency.getInstance("USD");
		System.out.println(inr.getCurrencyCode());
		
	}
}
