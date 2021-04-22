package Java.Strings;

import java.util.Scanner;
import java.util.Stack;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();

        for (char ch : A.toCharArray())
            stack.push(ch);

        while (!stack.isEmpty())
            builder.append(stack.pop());

        String B = builder.toString();
        System.out.println(A.equals(B) ? "Yes" : "No");

    }
}



