package HackerRank.WarmUp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        int positive = 0, negative = 0, zero = 0;
        for (int element: arr) {
            if (element > 0) positive++;
            else if (element < 0) negative++;
            else zero++;
        }

        int arrSize = arr.length;
        System.out.println(new DecimalFormat("#0.000000").format((double) positive / arrSize));
        System.out.println(new DecimalFormat("#0.000000").format((double) negative / arrSize));
        System.out.println(new DecimalFormat("#0.000000").format( (double) zero / arrSize));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
