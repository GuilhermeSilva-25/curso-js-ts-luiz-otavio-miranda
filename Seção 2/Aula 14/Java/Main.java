
import java.time.Year;
import java.util.function.IntPredicate;

public class Main {

    public static void main(String[] args) {
        int yearOfBirth = 2000;

        IntPredicate isAdulthood
                = year -> Year.now().getValue() - year >= 18;

        System.out.printf("A pessoa é adulta: %b%n", isAdulthood.test(yearOfBirth));

        yearOfBirth = 2015;

        System.out.printf("A pessoa é adulta: %b%n", isAdulthood.test(yearOfBirth));
    }
}
