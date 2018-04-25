package work21;

public class Task25 {
    public static void main(String[] args) {
        int number = 123;
        int digit = number % 10;
        int digit1 = number / 10 % 10;
        int digit2 = number / 100;
        int rebmun = digit * 100 + digit1 * 10 + digit2;
//        int rebmun = 321;
        System.out.println("Difference between rebmun - number = " + (rebmun - number));
    }
}
