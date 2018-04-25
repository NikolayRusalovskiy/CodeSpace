package work21;

public class Task22 {
    public static void main(String[] args) {
        long seconds = System.currentTimeMillis() / 1000;
        long second = seconds % 60;
        long minute = seconds / 60 % 60;
        long hour = seconds / (60 * 60) % 24  ;
        long day = seconds / (3600 * 24) % (365 * 3 + 366) % 365 +1;
        long dayOfWeek = day % 7 + 1;
        String dayString;
        switch ((int) dayOfWeek) {
            case 1:
                dayString = "Понедельник";
                break;
            case 2:
                dayString = "Вторник";
                break;
            case 3:
                dayString = "Среда";
                break;
            case 4:
                dayString = "Четверг";
                break;
            case 5:
                dayString = "Пятница";
                break;
            case 6:
                dayString = "Суббота";
                break;
            case 7:
                dayString = "Воскресенье";
                break;
            default:
                dayString = "Не знаем такого";
                break;
        }
        System.out.println(dayString);
        System.out.println("DD: " + day);
        System.out.println("HH: " + hour);
        System.out.println("MM: " + minute);
        System.out.println("SS: " + second);
    }
}
