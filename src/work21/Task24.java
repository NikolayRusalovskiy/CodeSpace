package work21;

import java.util.Scanner;

import static java.lang.System.out;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write numer a: ");
        int a = scanner.nextInt();
        System.out.print("Write numer b: ");
        int b = scanner.nextInt();
        a = a + b;// a=a+b    b=b
        b = a - b;// a=a+b   b=a
        a = a - b;// a=b     b=a
        out.println("Number a:" + a + " \n" + "Number b: " + b + "");
    }
}
