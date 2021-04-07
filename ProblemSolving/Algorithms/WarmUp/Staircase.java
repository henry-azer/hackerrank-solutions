package Algorithms.WarmUp;

import java.util.Scanner;

public class Staircase {

    static void staircase(int n) {
        int spaces = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
            spaces--;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }

}
