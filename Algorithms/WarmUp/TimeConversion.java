package HackerRank.WarmUp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String time = s.substring(8, 10);
        s = s.substring(0, 8);

        String converted;
        if (time.equals("AM") && hour != 12 || time.equals("PM") && hour == 12) converted = s.substring(0, 8);

        else if (hour == 12) converted = "00" + s.substring(2, 8);
        else converted = (hour + 12) + s.substring(2, 8);

        return converted;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
