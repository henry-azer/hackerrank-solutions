package Compete.CodeWhiz.javaOctober2015;

import java.util.Scanner;

public class AreaOfAParallelogram {

    private static final Scanner scanner = new Scanner(System.in);
    private static boolean flag = false;
    private static final int B, H;

    static {
        B = scanner.nextInt();
        H = scanner.nextInt();

        if (B > 0 && H > 0)
            flag = true;
        else try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive\n");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

}