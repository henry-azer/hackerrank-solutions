package Java.Advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String str = scan.next();
        scan.close();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());
        byte[] digest = md.digest();

        for (byte dig : digest)
            System.out.format("%02x", dig);
    }
}