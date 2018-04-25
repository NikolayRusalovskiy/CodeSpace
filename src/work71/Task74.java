package work71;

import java.util.Arrays;

public class Task74 {
    /**
     * ЗАДАНИЕ:
     * 1. Откройте проект PracticalWork7 и добавьте в него пакет work74, в
     * котором создайте класс Task74.
     * 2. Добавьте в класс Task74 метод public static void transpositionMatrix(int[][]
     * matrix), который выполняет транспонирование матрицы.
     * 3. Добавьте в класс Task74 метод public static int[][] createMatrix(int size),
     * который создает матрицу размером size на size и инициализирует ее
     * случайными значениями.
     * 4. Добавьте в класс Task74 метод public static void printMatrix(int[][] matrix),
     * который выводит матрицу.
     * 5. Добавьте в класс Task74 метод public static void main(String[] args),
     * который вводит размерность матрицы, создает ее, затем отображает, затем
     * транспонирует и снова отображает.
     * 6. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
     * 3. Используйте оператор for или for-each для обращения к элементам
     * массива.
     * 4. Используйте метод Math.random() для генерации случайного числа в
     * диапазоне от 0 и до 50 следующим образом:
     * (int)(Math.random() * 50);
     * <p>
     * 5. Используйте метод Arrays.toString() с методом System.out.println(...) для
     * вывода строк массива.
     */
    public static void main(String[] args) {
        int size = 5;
        int[][] myArr = createMatrix(size);
        printMatrix(myArr);
        transpositionMatrix(myArr);
        System.out.println("=====================================----------------------->>>>>>>>>>>>");
        printMatrix(myArr);
    }

    public static void transpositionMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static int[][] createMatrix(int size) {
        if (size <= 0) {
            return new int[0][];
        }
        int[][] a = new int[size][size];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100) - 50;
            }
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
