package Compete.CodeWhiz.javaOctober2015;

import java.util.Scanner;

public class WeirdNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scanner.nextInt();
        System.out.println(weirdo(num));
    }

    private static String weirdo(int num) {
        return (num % 2 == 0) ?
                ((num >= 2 && num <= 6) || num > 20) ? "Not Weird" : "Weird"
                : "Weird";
    }
}