package work41;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number -> ");
        int number = sc.nextInt();

        int sum =0;
        while (number !=0){
            int mod =number%10;
            sum =sum+ mod*mod;
            number=number/10;
        }
        System.out.println( "Sum = " + sum);
    }
}
