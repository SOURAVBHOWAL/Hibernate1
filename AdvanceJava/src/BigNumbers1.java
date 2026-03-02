import java.math.*;

public class BigNumbers1 {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger("100000000000000000");
        BigInteger result = bigInt.multiply(BigInteger.TEN);

        System.out.println("BigInteger: " + result);

        BigDecimal bigDec = new BigDecimal("123.444");
        BigDecimal rounded = bigDec.setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("BigDecimal: " + rounded);
        
        BigDecimal a = new BigDecimal("10.4");
        BigDecimal b = new BigDecimal("3");

        BigDecimal res = a.divide(b, 2, RoundingMode.HALF_UP);
        System.out.println(res);
    }
}


