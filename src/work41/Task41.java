package work41;

public class Task41 {
    public static void main(String[] args) {
        double a = 10, b = 35, c = 325;
        if (a > b) {
            if (a > c) System.out.println(a);
            else System.out.println(c);
        } else if (b > c) System.out.println(b);
        else System.out.println(c);
    }
}
