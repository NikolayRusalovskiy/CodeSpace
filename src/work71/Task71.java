package work71;

import java.util.Arrays;

public class Task71 {
    /**
     * ЗАДАНИЕ:
     * 1. Создайте проект PracticalWork7 с пакетом work71, в котором создайте
     * класс Task71.
     * 2. Добавьте в класс Task71 метод public static int[] createArray(int size),
     * создает массив четных чисел, начиная с 2, размерностью size.
     * 3. Добавьте в класс Task71 метод public static void main(String[] args),
     * который вводит количество элементов массива, создает массив, используя
     * метод createArray() и выводит его в консоль.
     * 4. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
     * 3. Используйте оператор for для инициализации массива.
     * 4. Используйте метод Arrays.toString() с методом System.out.println(...) для
     * вывода массива.
     */
    public static void main(String[] args) {
        int i = 5;
        String line = Arrays.toString(createArray(i));
        System.out.println(line);
    }

    public static int[] createArray(int size) {
        if (size <= 0) {
            return new int[0];
        }
        int[] a = new int[size];
        int b = 2;
        for (int i = 0; i < a.length; i++) {
            a[i] = b;
            b += 2;
        }
        return a;
    }
}