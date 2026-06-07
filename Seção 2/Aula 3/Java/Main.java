
public class Main {

    public static void main(String[] args) {
        int dataReceived = 33;
        String validationResponse = validateValue(dataReceived);
        System.out.println(validationResponse);
    }

    public static String validateValue(int data) {
        if (data > 100) {
            return "[SUCESSO] Valor validado!";
        }

        return "[ERRO] Valor não validado!";
    }
}
