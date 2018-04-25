package work61;

import java.util.Scanner;

public class Task62 {
    /**
     * ПРАКТИЧЕСКАЯ РАБОТА 6-2
     * <p>
     * ЗАДАНИЕ:
     * 1. Откройте проект PracticalWork6 и добавьте в него пакет work62, в
     * котором создайте класс Task62.
     * 2. Добавьте в класс Task62 метод public static String latestDigit(int number),
     * который получает целое число, определяет две последние цифры и возвращает их в
     * виде строки символов в обратном порядке.
     * 3. Добавьте в класс Task62 метод public static void main(String[] args),
     * который вводит переменную целого типа и выводит результат ее
     * обработки методом latestDigit().
     * 4. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
     * 3. Используйте арифметические операции, операторы управления потоком
     * исполнения и класс String для получения результата.
     * 4. Используйте оператор System.out.println(...) для вывода результата.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your number ->");
        int number = sc.nextInt();
        System.out.println("Last digit conversely = " + latestDigit(number));
        System.out.println("Last digit conversely = " + latestDigit2(number));
    }

    public static String latestDigit(int number) {
        String res = "";
        String def = "";
        def = def.valueOf(number);
        if (number > 9) {
            res = res.valueOf(def.charAt(def.length() - 1)) + res.valueOf(def.charAt(def.length() - 2));
        } else res = def.charAt(def.length() - 1) + "0";
        return res;
    }

    public static String latestDigit2(int number) {
        String result = "";
        int sotni = number % 100 / 10;
        int edenci = number % 10;
        result =result +edenci + sotni;
        return result;
    }
}
