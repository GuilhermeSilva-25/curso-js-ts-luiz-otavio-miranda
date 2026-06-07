
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        double debt = 1_000.00;

        NumberFormat realFormatter
                = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        System.out.printf("A dívida é de: %s%n", realFormatter.format(debt));

        double installment = 200;
        double rate = 10;

        debt -= installment;
        debt += rate;

        System.out.printf("A dívida é de: %s%n", realFormatter.format(debt));
    }
}
