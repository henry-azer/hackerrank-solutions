package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        scan.close();

        System.out.println(a.add(b) + "\n" + a.multiply(b));

    }
}