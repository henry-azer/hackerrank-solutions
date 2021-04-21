package Java.DataStructures;

import java.util.*;

public class JavaDeque {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int max = 0;
        int n = scan.nextInt();
        int m = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();

            deque.add(num);
            set.add(num);

            if (deque.size() == m) {
                if (set.size() > max) max = set.size();

                int top = deque.remove();
                if (!deque.contains(top)) set.remove(top);
            }
        }

        System.out.println(max);
    }
}



