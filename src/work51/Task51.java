package work51;

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("Write String->");
        str=sc.nextLine();
        System.out.println("Polovina");
        System.out.println(str.substring(str.length()/2));
    }
}
