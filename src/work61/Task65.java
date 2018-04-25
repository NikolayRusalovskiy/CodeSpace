package work61;

import java.util.Scanner;

public class Task65 {
    /**
     * ЗАДАНИЕ:
     * 1. Откройте проект PracticalWork6 и добавьте в него пакет work65, в
     * котором создайте класс Task65.
     * 2. Добавьте в класс Task65 метод public static void printPyramid(int height),
     * который создает и выводит на консоль пирамиду высотой height (значение в
     * диапазоне от 1 по 9). Например, для height = 3:
     * <p>
     * 1
     * 121
     * 12321
     * 1234321
     * <p>
     * 3. Добавьте в класс Task65 метод public static void main(String[] args),
     * который вводит высоту пирамиды и выводит пирамиду с использованием
     * метода printPyramid().
     * 4. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте операторы управления потоком исполнения для получения
     * результата.
     * 3. Используйте оператор System.out.println(...) для вывода результата.
     */
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int b = sc.nextInt();
        int h = 5;
        printPyramid(h);
        printPuramid2(h);
    }

    public static void printPyramid(int h) {
        String res = "";
        int level = 1;
        int c = 0;
        while (level<=h) {
            int count = h-level;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            int number=1;
            while (number <=level) {
                System.out.print(number);;
                number--;
            }
           number=level;
            while (number>1){
                System.out.print(--number);
            }
            System.out.println();
            number++;
        }
    }

    static void printPuramid2(int h) {
        int i = 1;
        String line;
        if (h <= 0 || h > 9) {
            System.out.println("Invalid piramyd height");
            return;
        }
        while (i <= h) {
            line = "";
            String spases = getSpases(h - i);
            line += spases;
            line += getNumbers(i);
            line += spases;
            System.out.println(line);
            i++;
        }
    }

    private static String getNumbers(int i) {
        String out = "" + i;
        int b = i - 1;
        while (b > 0) {
            out = b + out + b;
            b--;
        }
        return out;
    }

    private static String getSpases(int count) {
        int i = count;
        String out = "";
        while (i > 0) {
            out += " ";
            i--;
        }
        return out;
    }
}
