
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            double number1 = input.nextDouble();
            System.out.println("Digite o segundo número: ");
            double number2 = input.nextDouble();
            double numbersAddedTogether = number1 + number2;

            System.out.printf("A soma do número %.1f com o número %.1f é: %.1f%n", number1, number2, numbersAddedTogether);
        }
    }
}
