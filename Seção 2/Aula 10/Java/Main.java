
public class Main {

    public static void main(String[] args) {
        String emailReceived = "   Luiz.Otavio@EMPRESA.com.br ";
        String emailProcessed = handleEmail(emailReceived);
        String emailProvider = separateProvider(emailProcessed);

        System.out.printf(
                "O e-mail tratado é: %s. O provedor utilizado é: %s%n",
                emailProcessed,
                emailProvider
        );
    }

    public static String handleEmail(String emailReceived) {
        return emailReceived.trim().toLowerCase();
    }

    public static String separateProvider(String emailProcessed) {
        return emailProcessed.split("@")[1];
    }
}
