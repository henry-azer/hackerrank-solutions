package Java.Strings;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        String[] tokens = s.split("[^\\p{Alpha}]+");
        System.out.println(s.isEmpty() ? 0 : tokens.length);

        for (String token : tokens)
            System.out.println(token);

        scan.close();
    }
}

