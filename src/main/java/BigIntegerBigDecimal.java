import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("24565940658464968496846757");

        double x = 0.02;
        double y = 0.03;

        System.out.println(x - y);

        BigDecimal xx = new BigDecimal("0.02"); //niepoprawne
        BigDecimal yy = new BigDecimal("0.03");

        BigDecimal xxx = BigDecimal.valueOf(0.02); //poprawne
        BigDecimal yyy = BigDecimal.valueOf(0.03);

        System.out.println(xxx.subtract(yyy));
        System.out.println(xx.subtract(yy));

    }
}
