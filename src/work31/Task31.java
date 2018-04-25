package work31;

public class Task31 {
    public static void main(String[] args) {
        double funt = 116.5;
        int funttoKilo = (int)(funt *453.6)/1000;
        int funttoGramm = (int) ((funt *453.6)%1000);
        System.out.println("funttoKilo = "+ funttoKilo);
        System.out.println("funttoGramm = " + funttoGramm);
    }
}
