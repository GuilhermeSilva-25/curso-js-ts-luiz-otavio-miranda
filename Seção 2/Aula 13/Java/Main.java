
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> customers = new ArrayList<>();

        customers.add("Luiz");
        customers.add("Maria");
        customers.add("João");

        customers.add(0, "Helena");
        customers.add("Otávio");

        String attended = customers.remove(0);

        System.out.printf(
                "O cliente %s foi chamado. Fila restante: %s%n",
                attended,
                String.join(", ", customers)
        );
    }
}
