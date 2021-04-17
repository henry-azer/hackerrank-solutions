package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger num = scanner.nextBigInteger();
        scanner.close();
        System.out.println(num.isProbablePrime(10) ? "prime" : "not prime");
    }

}
