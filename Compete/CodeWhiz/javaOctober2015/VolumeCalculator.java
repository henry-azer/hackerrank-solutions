package Compete.CodeWhiz.javaOctober2015;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

class Calculate {
    static class Output {
        public void display(double volume) {
            System.out.printf("%.3f\n", volume);
        }
    }

    Output output = new Output();
    Scanner scanner = new Scanner(System.in);

    public int getINTVal() {
        int a = scanner.nextInt();
        if (a <= 0)
            throw new NumberFormatException("All the values must be positive");
        return a;
    }

    public double getDoubleVal() {
        double a = scanner.nextDouble();
        if (a <= 0)
            throw new NumberFormatException("All the values must be positive");
        return a;
    }

    public static Get_Vol get_Vol() {
        return new Get_Vol();
    }
}

class Get_Vol extends Calculate {
    double main(int val) throws IOException {
        return (val * val * val);
    }

    double main(int val, int val2, int val3) throws IOException {
        return val * val2 * val3;
    }

    double main(double val) throws IOException {
        return Math.PI * (val * val * val) * (2.0 / 3.0);
    }

    double main(double val, double val2) throws IOException {
        return Math.PI * (val * val) * val2;
    }

}

public class VolumeCalculator {

    public static void main(String[] args) {
        Do_Not_Terminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.getINTVal();
            while (T-- > 0) {
                double volume = 0.0d;
                int ch = cal.getINTVal();
                if (ch == 1) {

                    int a = cal.getINTVal();
                    volume = Calculate.get_Vol().main(a);


                } else if (ch == 2) {

                    int l = cal.getINTVal();
                    int b = cal.getINTVal();
                    int h = cal.getINTVal();
                    volume = Calculate.get_Vol().main(l, b, h);

                } else if (ch == 3) {

                    double r = cal.getDoubleVal();
                    volume = Calculate.get_Vol().main(r);

                } else if (ch == 4) {

                    double r = cal.getDoubleVal();
                    double h = cal.getDoubleVal();
                    volume = Calculate.get_Vol().main(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    }
}

/**
 * This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate	
	