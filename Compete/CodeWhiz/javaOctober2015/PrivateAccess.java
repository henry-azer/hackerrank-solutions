package Compete.CodeWhiz.javaOctober2015;

import java.io.*;

public class PrivateAccess {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        Private o;
        o = new PrivateAccess(). new Private();
        System.out.println(num + " is " + o.powerof2(num));
    }

    class Private {
        private String powerof2(int num) {
            return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
        }
    }
}