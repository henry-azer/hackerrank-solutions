package HackerRank.WarmUp;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long[] sum = new long[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            long current = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) current += arr[j];
            }
            sum[i] = Math.abs(current);
        }

        long min = sum[0] , max = sum[0];
        for (long current : sum) {
            if (current >= max) max = current;

            if (current <= min) min = current;
        }

        System.out.println(min + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
