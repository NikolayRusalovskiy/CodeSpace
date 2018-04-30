package work22;

public class Task221 {
    /**
     * ЗАДАНИЕ:
     * 1. Создайте проект PracticalWorkB2-1 с пакетом workB21P1, в котором
     * создайте класс TaskB21P1.
     * 2. Добавьте в класс TaskB21P1 метод public static int
     * convertHexToDecimal(String number), который получает целое
     * положительное число number в шестнадцатеричной системе счисления в
     * виде строки символов, преобразует его в десятичное число, которое и
     * возвращает.
     * 3. Добавьте в класс TaskВ21Р1 метод public static void main(String[] args),
     * который вводит строку символов, представляющую число в
     * шестнадцатеричной системе счисления и выводит результат его обработки
     * методом convertHexToDecimal().
     * 4. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
     * 3. Используйте операторы управления потоком исполнения и методы
     * обработки строк.
     * 4. Используйте метод System.out.println(...) для вывода результата.
     */

    static String digits = "0123456789abcdef";
    static final int BASE = 16;

    public static void main(String[] args) {
        String number = "56435478da";
//Scanner sc =new Scanner(System.in);
//number = sc.next().toLowerCase();
        number = validateTo16(number);
        int resNumber = convertHexToDecimal(number);
        System.out.println("Number 16 = " + number);
        System.out.println("Number 10 = " + resNumber);
    }

    public static String validateTo16(String line) {

        for (int i = 0; i < line.length(); i++) {
            if (digits.indexOf(line.charAt(i)) == -1) {
                return "incorrect value " + "position = " + i;
            }
        }

        return line;
    }

    public static int convertHexToDecimal(String number) {

        int result = 0;

        for (int position = number.length() - 1;
             position >= 0;
             position--) {
            int degree = number.length() - 1 - position;
            char ch = number.charAt(position);
            int value = digits.indexOf(ch);
            result += (int) (value * Math.pow(BASE, degree));
        }
        return result;
    }
}
