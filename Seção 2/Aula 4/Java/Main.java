
public class Main {

    public static void main(String[] args) {
        String packageName = "Placa de Vídeo";
        String packageStatus = "Aguardando Pagamento";
        System.out.printf("O pacote %s está %s%n", packageName, packageStatus);
        packageStatus = "Em Trânsito";
        System.out.printf("O pacote %s está %s%n", packageName, packageStatus);
    }
}
