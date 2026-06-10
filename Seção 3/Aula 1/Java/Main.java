
public class Main {

    public static void main(String[] args) {
        int age = 17;
        verifyAge(age);

        age = 30;
        verifyAge(age);
    }

    public static void verifyAge(int age) {
        final int MINIMUM_AGE = 18;
        final int AGE_FOR_VIP = 30;

        boolean isAuthorized = age >= MINIMUM_AGE;
        boolean isVip = age == AGE_FOR_VIP;

        printVerificationResult(isAuthorized, isVip);
    }

    public static void printVerificationResult(boolean authorization, boolean vip) {
        System.out.printf(
                "Acesso liberado: %b%nAcesso VIP: %b%n%n",
                authorization,
                vip
        );
    }
}
