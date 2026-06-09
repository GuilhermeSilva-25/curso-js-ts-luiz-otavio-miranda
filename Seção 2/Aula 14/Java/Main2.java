
public class Main2 {

    public static boolean isAdulthood(int yearOfBirth) {
        return java.time.Year.now().getValue() - yearOfBirth >= 18;
    }

    public static void main(String[] args) {
        int yearOfBirth = 2000;

        System.out.printf("A pessoa é adulta: %b%n", isAdulthood(yearOfBirth));

        yearOfBirth = 2015;

        System.out.printf("A pessoa é adulta: %b%n", isAdulthood(yearOfBirth));
    }
}
