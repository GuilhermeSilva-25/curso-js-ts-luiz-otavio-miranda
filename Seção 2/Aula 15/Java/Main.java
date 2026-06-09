
public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart("Guilherme", 100.0);

        cart.addProduct(20);
        cart.addProduct(50);
    }
}

class Cart {

    String owner;
    double balance;

    public Cart(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void addProduct(double price) {
        this.balance -= price;

        System.out.printf(
                "Produto adicionado. Saldo restante: R$ %.2f%n",
                this.balance
        );
    }
}
