public class Main {
    public static void main(String[] args) {
        String productName = "Teclado Mecânico";
        int quantityPurchased = 3;
        double unitValue = 150.50;

        System.out.printf("[LOG INFO] Compra aprovada: Produto: %s | Qtd: %d | Total: R$ %.2f%n", productName,
                quantityPurchased, quantityPurchased * unitValue);
    }
}