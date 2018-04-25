package work71;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    /**
     * ЗАДАНИЕ:
     * 1. Откройте проект PracticalWork7 и добавьте в него пакет work75, в
     * котором создайте класс Task75.
     * 2. Добавьте в класс Task75 метод public static int[]
     * countOfSequenceNumbers(String numbers), который получает
     * последовательность цифр numbers в виде строки символов (символы из
     * диапазона ['1'– '9']) и подсчитывает в этой последовательности количество
     * единиц, количество двоек, количество троек и т.д., записывая их в массив.
     * 3. Добавьте в класс Task75 метод public static void main(String[] args),
     * который вводит строку цифровых символов, обрабатывает ее методом
     * countOfSequenceNumbers() и выводит результат.
     * 4. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте класс Scanner для ввода строки набором на клавиатуре.
     * 3. Используйте оператор for, for-each, if для обработки строки символов и
     * создания массива целых чисел.
     * 4. Используйте метод Arrays.toString() с методом System.out.println(...) для
     * вывода массива.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scanner.nextLine();
        string = updateString(string);
        int[] number = countOFSequencesNumbers(string);
        System.out.println(Arrays.toString(number));

    }

    public static int[] countOFSequencesNumbers(String numbers) {
        if (numbers == null || numbers.length() == 0) {
            return new int[0];
        }
        int[] result = new int[10];
        for (int i = 0; i < numbers.length(); i++) {
            char ch = numbers.charAt(i);
            result[ch - '0']++;
        }

        return result;
    }

    public static String updateString(String string) {
        if (string == null || string.trim().length() == 0) {
            return null;
        }
        String resultString = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= '0' && ch <= '9') {
                resultString += ch;
            }
        }
        return resultString;
    }
}
