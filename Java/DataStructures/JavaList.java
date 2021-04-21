package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = scan.nextInt();
        List<Integer> list = new ArrayList<>(n1);

        while (n1-- > 0)
            list.add(scan.nextInt());

        int n2 = scan.nextInt();
        while (n2-- > 0) {
            switch (scan.next()) {
                case "Insert":
                    list.add(scan.nextInt(), scan.nextInt());
                    break;
                case "Delete":
                    list.remove(scan.nextInt());
                    break;
                default:
                    break;
            }
        }
        scan.close();

        for (int num : list) System.out.print(num + " ");

    }
}