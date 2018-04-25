package work21;

public class Task23 {
    public static void main(String[] args) {
        int speed_1= 90;
        int speed_2= 120;
        int distance = 300;
        int time = 1;
        int distanceAfterTime =distance- time*(speed_1+speed_2);
        System.out.println("Расстояние : "+distanceAfterTime+ " км \n" +
                "между двумя автомобилями, движущимися навстречу друг другу, через " + time + " час/ов");

    }
}
