package Java.Strings;

import java.util.Scanner;

class JavaRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    
    String part = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = part + "." +  part + "." +  part + "." + part;

}

