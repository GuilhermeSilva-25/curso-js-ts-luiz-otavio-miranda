
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        double productPrice = 100;
        double discount = 20;
        double finalPrice = productPrice - discount;

        NumberFormat realFormatter
                = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        System.out.printf("O preço final é: %s%n",
                realFormatter.format(finalPrice));
    }
}
