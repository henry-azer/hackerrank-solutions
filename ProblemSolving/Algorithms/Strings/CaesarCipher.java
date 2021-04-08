package Algorithms.Strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher {

    static String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();
        k %= 26;

        for (char ch: s.toCharArray()) {
            char letter = (char) (ch + k);

            if (ch > 64 && ch < 91) {
                if (letter > 90) letter = (char) ((letter % 90) + 64);
                result.append(letter);
            } else if (ch > 96 && ch < 123) {
                if ((ch + k) > 122) letter = (char) (((ch + k) % 122) + 96);
                result.append(letter);
            } else result.append(ch);
        }

        return result.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
