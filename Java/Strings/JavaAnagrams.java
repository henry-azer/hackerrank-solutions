package Java.Strings;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        boolean result = false;
        StringBuilder c = new StringBuilder(b);

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < c.length(); j++) {
                    if (a.charAt(i) == c.charAt(j)) {
                        c.deleteCharAt(j);
                        if (i == a.length() - 1 && c.length() == 0) result = true;
                        break;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}