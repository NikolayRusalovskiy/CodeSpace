package work71;

import java.util.Arrays;

public class Task73 {
    /**
     * ЗАДАНИЕ:
     * 1. Откройте проект PracticalWork7 и добавьте в него пакет work73, в
     * котором создайте класс Task73.
     * 2. Добавьте в класс Task73 метод public static int[][] createMatrix(int size),
     * который создает матрицу размером size на size и инициализирует ее
     * числами, начиная с 1, двигаясь по столбцам.
     * Например, матрица размером 4х4 будет иметь следующий вид:
     * <p>
     * 3. Добавьте в класс Task73 метод public static void printMatrix(int[][] matrix),
     * который выводит матрицу.
     * 4. Добавьте в класс Task73 метод public static void main(String[] args),
     * который вводит размерность матрицы, создает ее и затем отображает.
     * 5. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
     * 3. Используйте оператор for или for-each для обращения к элементам
     * массива.
     * 4. Используйте метод Arrays.toString() с методом System.out.println(...) для
     * вывода строк массива.
     */
    public static void main(String[] args) {
        int size = 5;
        int a[][] = createMatrix(size);
        printMatrix(a);
    }

    public static int[][] createMatrix(int size) {
        if (size <= 0) {
            return new int[0][];
        }
        int[][] a = new int[size][size];
        int c = 1;
        int b = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = b;
                b += size;
            }
            c++;
            b = c;
        }
        return a;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length <= 0) {
            System.out.println("Incorrect Matrix");
        }
        String line = "";
        for (int[] a : matrix) {
            line = Arrays.toString(a);
            System.out.println(line);
        }
    }
}
