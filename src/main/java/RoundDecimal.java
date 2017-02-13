import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Created by Hanna_Zhahala on 13.02.2017.
 */
public class RoundDecimal {
    public static void main(String[] args) {

        double d = 345.412385;
            System.out.println(Math.round(d));

        DecimalFormat df = new DecimalFormat("0.00");
        String roundedNumber = df.format(d);
            System.out.println(roundedNumber);
    }
}
