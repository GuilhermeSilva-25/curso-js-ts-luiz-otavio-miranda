
public class Main {

    public static void main(String[] args) {
        double randomNumber = Math.random();
        int cashback = Math.max(1, (int) Math.ceil(randomNumber * 100));

        System.out.printf("Parabéns! Você ganhou R$ %d de cashback!%n", cashback);
    }
}
