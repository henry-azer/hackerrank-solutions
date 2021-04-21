package Java.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = scan.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>(n1);

        while (n1-- > 0) {
            int d = scan.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>(d);

            for (int j = 0; j < d; j++)
                arrayList.add(scan.nextInt());

            lists.add(arrayList);
        }

        int n2 = scan.nextInt();
        while (n2-- > 0) {
            int a = scan.nextInt() - 1;
            int b = scan.nextInt() - 1;

            try {
                if (lists.get(a).get(b) != null)
                    System.out.println(lists.get(a).get(b));
            } catch (Exception exception) {
                System.out.println("ERROR!");
            }
        }

    }
}