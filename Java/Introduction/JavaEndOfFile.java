package Java.Introduction;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        while (scanner.hasNext())
            System.out.println(counter++ + " " + scanner.nextLine());
    }
}