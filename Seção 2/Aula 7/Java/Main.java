
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String customerNameA = "Luiz";
        String customerNameB = customerNameA;
        customerNameB = "Otávio";

        List<String> cartA = new ArrayList<>();
        cartA.add("Teclado");
        cartA.add("Monitor");

        List<String> cartB = new ArrayList<>(cartA);

        cartB.add("Mouse");

        System.out.printf("Cliente A: %s | Carrinho: %s%n",
                customerNameA, String.join(", ", cartA));

        System.out.printf("Cliente B: %s | Carrinho: %s%n",
                customerNameB, String.join(", ", cartB));
    }
}
