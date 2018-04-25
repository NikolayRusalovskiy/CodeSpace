package work61;

import java.util.Scanner;

public class Task64 {
    /**
     * ЗАДАНИЕ:
     * 1. Откройте проект PracticalWork6 и добавьте в него пакет work64, в
     * котором создайте класс Task64.
     * 2. Добавьте в класс Task64 метод public static String
     * convertDecimalToBinary(int number), который получает некоторое целое
     * положительное число number, преобразует его в двоичное число и
     * возвращает в виде строки символов.
     * 3. Добавьте в класс Task64 метод public static void main(String[] args),
     * который вводит целое число и выводит результат его обработки методом
     * convertDecimalToBinary().
     * 4. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
     * 3. Используйте арифметические операции, операторы управления потоком
     * исполнения и класс String для получения результата.
     * 4. Используйте оператор System.out.println(...) для вывода результата.
     */
    public static void main(String[] args) {
        int a = 345;        // 101011001
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        System.out.println("New binary ->" + convertDecimalToBinary(a));
    }

    public static String convertDecimalToBinary(int number) {
        String res = "";
        while (number != 0) {
            int b = number % 2;
            res = b + res;
            number /= 2;
        }
        return res;
    }


}
