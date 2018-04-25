package work61;

import java.util.Scanner;

public class Task63 {
    /**
     * ЗАДАНИЕ:
     * 1. Откройте проект PracticalWork6 и добавьте в него пакет work63, в
     * котором создайте класс Task63.
     * 2. Добавьте в класс Task63 метод public static char
     * getFirstCharacterOfWord(String str, int numberWord), который определяет и
     * возвращает первый символ слова под номером numberWord в строке str, в
     * которой слова разделены только пробелами.
     * 3. Добавьте в класс Task63 метод public static void main(String[] args),
     * который вводит необходимые данные и выводит результат выполнения
     * метода getFirstCharacterOfWord().
     * 4. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
     * 3. Используйте методы length(), indexOf() и charAt() класса String для
     * получения результата.
     * 4. Используйте оператор System.out.println(...) для вывода результата.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str =  sc.nextLine();
        String str = "который определяет и возвращает первый символ слова под номером numberWord в строке str";
        System.out.print("Number of word = ");
        int number = sc.nextInt();
        System.out.println("First char of the word#"+number+"="+getFirstCharacterOfWord(str,number));
    }

    public static char getFirstCharacterOfWord(String str, int numberWord) {
char firstChar=0;

        return firstChar;
    }
}
