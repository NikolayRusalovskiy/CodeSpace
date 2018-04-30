package work22;

import java.util.Scanner;

public class Task4 {
    /**
     * ПРАКТИЧЕСКАЯ РАБОТА В2_1-4
     * <p>
     * ЗАДАНИЕ:
     * 1. Откройте проект PracticalWorkВ2-1 и добавьте в него пакет workВ21Р4, в
     * котором создайте класс TaskВ21Р4.
     * 2. Добавьте в класс TaskB21P4 метод public static boolean
     * countBrackets(String str), который определяет сбалансирована ли строка по
     * открывающимся и закрывающимся скобкам (например, строка "((()())())"
     * правильна; строка "((()())" или "()))((" не допустимы, т.е. каждой
     * открывающей скобке должна быть парная закрывающая скобка).
     * 3. Добавьте в класс TaskВ21Р4 метод public static void main(String[] args),
     * который вводит строку символов, а затем вызовом метода countBrackets()
     * проверяет ее валидность и выводит в консоль соответствующее
     * сообщение.
     * 4. Запустите приложение на исполнение.
     * ТРЕБОВАНИЯ
     * 1. Приложение должно быть написано на языке Java.
     * 2. Используйте класс Scanner для ввода данных набором на клавиатуре.
     * 3. Используйте операторы управления потоком исполнения и методы
     * обработки строк.
     * 4. Используйте метод System.out.println(...) для вывода результата.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write line -->");
        String line = sc.nextLine();
        validateLineForSyntax(line);
        System.out.println("Line has correct number of breaks --> " + countBrackets(line));
    }

    public static boolean
    countBrackets(String str) {

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                result += 1;
            }

            if (str.charAt(i) == ')') {
                result -= 1;
            }

        }

        if (result == 0) {
            return true;
        } else return false;
    }
public static String validateLineForSyntax(String line){
        if (line.indexOf(')')<line.indexOf('(') |line.lastIndexOf('(')<line.lastIndexOf('('))
        {
            System.out.println("Incorrect String value");
        }
        return line;
}

}
