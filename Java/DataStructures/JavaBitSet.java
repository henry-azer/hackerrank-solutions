package Java.DataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        int M = scan.nextInt();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        while (M-- > 0) {
            String operation = scan.next();
            int pos = scan.nextInt();
            int index = scan.nextInt();

            switch (operation) {
                case "AND":
                    if (pos == 1) B1.and(B2);
                    else B2.and(B1);
                    break;
                case "OR":
                    if (pos == 1) B1.or(B2);
                    else B2.or(B1);
                    break;
                case "XOR":
                    if (pos == 1) B1.xor(B2);
                    else B2.xor(B1);
                    break;
                case "FLIP":
                    if (pos == 1) B1.flip(index);
                    else B2.flip(index);
                    break;
                case "SET":
                    if (pos == 1) B1.set(index);
                    else B2.set(index);
                    break;
                default:
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        scan.close();
    }
}