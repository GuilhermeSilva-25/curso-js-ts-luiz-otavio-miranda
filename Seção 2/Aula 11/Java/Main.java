
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        BigDecimal deposit = new BigDecimal("0.1");
        BigDecimal performance = new BigDecimal("0.2");
        BigDecimal total = deposit.add(performance);
        NumberFormat realFormatter
                = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        System.out.printf("O total em sua conta é : %s%n", realFormatter.format(total));
    }
}
