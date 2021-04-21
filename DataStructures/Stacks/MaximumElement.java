package DataStructures.Stacks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> getMax(List<String> operations) {
        List<Integer> list = new ArrayList<>();

        for (String operation: operations) {
            int listSize = list.size();

            if (operation.startsWith("1")) list.add(listSize, Integer.parseInt(operation.substring(2)));
            else if (operation.startsWith("2")) list.remove(listSize - 1);
            else {
                int max = 0;
                for (int element : list) if (element > max) max = element;
                System.out.println(max);
            }
        }
        return list;
    }

    public static List<Integer> getMax2(List<String> operations) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        for (String operation: operations) {
            switch (operation.substring(0,1)) {
                case "1":
                    int num = Integer.parseInt(operation.substring(2));
                    stack.push(num);
                    if(maxStack.isEmpty() || num >= maxStack.peek()) maxStack.push(num);
                    break;
                case "2":
                    int num2 = stack.pop();
                    if(num2 == maxStack.peek()) maxStack.pop();
                    break;
                case "3":
                    System.out.println(maxStack.peek());
                    break;

                default: break;
            }
        }

        return new ArrayList(maxStack);
    }

}

public class MaximumElement {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
