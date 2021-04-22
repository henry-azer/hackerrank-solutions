package Java.Strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(biggerString(A, B));
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));

    }

    private static String biggerString(String a, String b) {
        return a.compareTo(b) > 0 ? "Yes" : "No";
    }

    public static String capitalizeFirstLetter(String a) {
        return a.substring(0, 1).toUpperCase() + a.substring(1);
    }
}



