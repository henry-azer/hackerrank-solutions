package Compete.CodeWhiz.javaOctober2015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static java.lang.System.in;

class Prime {

    public static void checkPrime(int... nums) {
        for (int num : nums)
            if (isPrime(num))
                System.out.print(num + " ");

        System.out.println();
    }

    private static boolean isPrime(int num) {
        BigInteger bigInteger = new BigInteger(String.valueOf(num));
        return bigInteger.isProbablePrime(10);
    }
}

public class CheckingPrime {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            Random rand = new Random();
            int n = rand.nextInt();
            Prime ob = new Prime();

            Prime.checkPrime(9, 10, 32, 89, 66);
            Prime.checkPrime(19, 78, 98, 100, 787, 8989, 12817, 11, 192);
            Prime.checkPrime(90, 2, 31, 890, 8278, 87892, 12, 10);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
