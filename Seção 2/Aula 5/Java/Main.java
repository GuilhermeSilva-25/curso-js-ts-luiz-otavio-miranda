
import java.util.Locale;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        final String PRODUCT_PRICE_1 = "50";
        final int PRODUCT_PRICE_2 = 20;
        final int DELIVERY_FEE = 15;
        final int FINAL_VALUE = Integer.parseInt(PRODUCT_PRICE_1) + PRODUCT_PRICE_2 + DELIVERY_FEE;

        System.out.printf("O valor final é R$ %.2f e o seu tipo é %s%n", (double) FINAL_VALUE, ((Object) FINAL_VALUE).getClass().getSimpleName());
    }
}
