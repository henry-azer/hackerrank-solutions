package Compete.CodeWhiz.javaOctober2015;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for (int i = testCases; i > 0; i--) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception ex) {
                System.out.println("Invalid");
            }
        }
    }
}