package Algorithms.Strings;

import java.io.*;
import java.util.Stack;

public class SuperReducedString {

    static String superReducedString(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();

        for (char ch: arr) {
            if (stack.isEmpty()) stack.push(ch);
            else if (stack.peek() == ch) stack.pop();
            else stack.push(ch);
        }

        while(!stack.isEmpty()) builder.append(stack.pop());
        String result = builder.reverse().toString();
        if (result.equals("")) result = "Empty String";

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
