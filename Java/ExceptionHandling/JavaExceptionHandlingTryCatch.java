package Java.ExceptionHandling;

import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();

            System.out.println(x / y);

        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        } catch (Exception exception) {
            System.out.println(exception.getClass().getName());
        }
    }
}
