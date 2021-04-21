package Java.BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class JavaBigDecimal {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String []args){
        // Input
        int n = scan.nextInt();
        String []s = new String[n+2];
        for (int i = 0; i < n; i++)
            s[i] = scan.next();
      	scan.close();

      	// JavaPriorityQueue
        Comparator<String> comparator = (o1, o2) -> {
            BigDecimal a = new BigDecimal(o1);
            BigDecimal b = new BigDecimal(o2);

            return b.compareTo(a);
        };

        Arrays.sort(s, 0, n, comparator);

        //Output
        for(int i=0;i<n;i++)
            System.out.println(s[i]);
    }

}