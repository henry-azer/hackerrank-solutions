package Compete.CodeWhiz.javaOctober2015;

import java.lang.reflect.Method;

class Printer {

    public void printArray(Object[] array) {
        for (Object obj : array)
            System.out.println(obj);
    }
}

public class PrintTheArray {

    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equals("printArray"))
                count++;
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");
        assert count == 1;

    }
}