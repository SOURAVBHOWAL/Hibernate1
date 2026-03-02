package Currency;
//import java.util.Locale;
//public class Demo {
//
//	public static void main(String[] args) {
//		
//
//		Locale india = new Locale("en", "IN");
//		Locale us = Locale.US;
//		Locale france = new Locale("en","FR");
//
//		System.out.println(india);
//		System.out.println(us);
//		System.out.println(france);
//
//	}
//
//}

//
//import java.text.NumberFormat;
//import java.util.Locale;
//
//public class Demo {
//    public static void main(String[] args) {
//    	
//        double amount = 1234567.89;
//        //NumberFormat
//        NumberFormat usFormat =
//            NumberFormat.getNumberInstance(Locale.US);
//
//        NumberFormat germanyFormat =
//            NumberFormat.getNumberInstance(Locale.GERMANY);
//        
//        System.out.println(usFormat.format(amount));
//        System.out.println(germanyFormat.format(amount));
//        
//        //currencyFormat
//        NumberFormat ukCurrFormat=NumberFormat.getCurrencyInstance(Locale.UK);
//        System.out.println(ukCurrFormat.format(amount));
//        
//    }
//}

import java.util.Currency;
import java.util.Locale;
public class Demo{
	public static void main(String[] args) {
		Currency inr = Currency.getInstance(new Locale("en", "IN"));
		Currency usd = Currency.getInstance(Locale.US);

		System.out.println(inr.getCurrencyCode());
		System.out.println(inr.getSymbol());

		System.out.println(usd.getCurrencyCode());
		System.out.println(usd.getSymbol());
	}
}