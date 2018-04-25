package work51;

public class Task54 {
    /**
     * ЗАДАНИЕ:
     1. Откройте проект PracticalWork5 и добавьте в него пакет work54, в
     котором создайте класс Task54.
     2. Добавьте в класс Task54 метод public static void main(String[] args) { }.
     3. Добавьте в метод main(...) код, который:
     − описываются две переменные myStr1 и myStr2 типа String (например, со
     значениями «Cartoon» для первой и «Tomcat» для второй);
     − выведите в консоль все буквы, которые присутствуют в первом слове,
     но отсутствуют во втором.
     4. Запустите приложение на исполнение.
     ТРЕБОВАНИЯ
     1. Приложение должно быть написано на языке Java.
     2. Используйте методы charAt(), length(), indexOf() класса String и оператор
     цикла while для получения результата.
     3. Используйте оператор System.out.println(...) для вывода результата.
     */
    public static void main(String[] args) {
        String myStr1= "Cartoon";
        String myStr2= "Tomcat";
        int position=0;
        String res="";
        int position2=0;
        while (position < myStr1.length()){
            char currentChar1 = myStr1.charAt(position);
                while (position2<myStr2.length()){
                    char currentChar2 = myStr2.charAt(position2);
                    if(!(currentChar1 ==currentChar2)){
                        res=res+currentChar1;
                    }
                    position2++;
                }
            position++;
        }
        System.out.println(res);
    }
}
