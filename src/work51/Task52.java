package work51;

import java.util.Scanner;

public class Task52 {
    /*
    * ЗАДАНИЕ:
1. Откройте проект PracticalWork5 и добавьте в него пакет work52, в
котором создайте класс Task52.
2. Добавьте в класс Task52 метод public static void main(String[] args) { }.
3. Добавьте в метод main(...) код, в котором:
– определяется переменная строкового типа, которая содержит название
некоторой организации из трех слов (например, «National Aviation
University»);
– составляет и сохраняет в переменной аббревиатуру этой организации;
– выводит результат в консоль.
4. Запустите приложение на исполнение.
ТРЕБОВАНИЯ
1. Приложение должно быть написано на языке Java.
2. Используйте методы charAt(), indexOf() и lastIndexOf() класса String для
получения результата.
3. Используйте оператор System.out.println(...) для вывода результата.*/
    public static void main(String[] args) {
//        String name = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Write ->");
        String name = sc.nextLine();
        String res = "";
        int positonChar = 1;
        int lastPositionChar = name.length();
        while (positonChar <= lastPositionChar) {
            char currentChar = name.charAt(positonChar);
            res = res + currentChar;
            positonChar=name.indexOf(" ")+1;
        }
        System.out.println("result = "+res);
    }
}
