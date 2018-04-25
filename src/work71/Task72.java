package work71;

public class Task72 {
    /**
     * ЗАДАНИЕ:
     * 1. Откройте проект PracticalWork7 и добавьте в него пакет work72, в
     * котором создайте класс Task72.
     * 2. Добавьте в класс Task72 метод public static int sumOddElementsArray(int[]
     * array), который получает массив целых положительных значений и
     * возвращает сумму нечетных элементов этого массива или -1, если с
     * массивом что-то не так.
     * 3. Добавьте в класс Task72 метод public static void main(String[] args),
     * который описывает массив целых положительных чисел, использует метод
     * sumOddElementsArray() и выводит результат его работы.
     * 4. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте инициализацию массива при объявлении.
     * 3. Используйте операторы управления потоком исполнения для обработки
     * массива.
     * 4. Используйте метод Arrays.toString() с методом System.out.println(...) для
     * вывода массива.
     */
    public static void main(String[] args) {
        int[] a = {5, 4, 5, 3, 5, 5, 2, 3};
        int sum = sumOddElementsArray(a);
        System.out.println("Summa =" + sum);
    }

    public static int sumOddElementsArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] <= 0) {
                sum = -1;
                break;
            } else if (array[i] % 2 == 1) {
                sum += array[i];
            }
        }
        return sum;
    }
}
