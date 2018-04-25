package work51;

public class Task53 {
    /**ЗАДАНИЕ:
     1. Откройте проект PracticalWork5 и добавьте в него пакет work53, в
     котором создайте класс Task53.
     2. Добавьте в класс Task53 метод public static void main(String[] args) { }.
     3. Добавьте в метод main(...) код, в котором:
     − определяется переменная строкового типа, содержащая несколько
     слов (например, «An information system is designed to collect, process,
     store and distribute information»);
     – меняются местами первое и последнее слова этой строки;
     – выводится результат в консоль.
     4. Запустите приложение на исполнение.
     ТРЕБОВАНИЯ
     1. Приложение должно быть написано на языке Java.
     2. Используйте методы substring(), length(), indexOf() и lastIndexOf() класса
     String для получения результата.
     3. Используйте оператор System.out.println(...) для вывода результата.
     */
    public static void main(String[] args) {
        String str = "An information system is designed to collect, process, store and distribute information";
        int position1 = str.indexOf(" ");
        String firstWord = str.substring(0,position1);
        int lastPosition = str.lastIndexOf(" ");
        String lastWord = str.substring(lastPosition);
        String res = lastWord + str.substring(position1,lastPosition).trim() + " "+firstWord;
        System.out.println(res);

    }
}
