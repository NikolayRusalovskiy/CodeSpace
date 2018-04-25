package work31;

public class Task32 {
    public static void main(String[] args) {
        int depRes = 23000;
        int mounth = 5;
        double rate = 12;
        int res = (int) ( depRes + (depRes* rate/100*mounth/12));
        System.out.println(res);
    }
}
