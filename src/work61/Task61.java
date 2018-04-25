package work61;

public class Task61 {
    /**ЗАДАНИЕ:
     1. Создайте проект PracticalWork6 с пакетом work51, в котором создайте
     класс Task61.
     2. Добавьте в класс Task61 метод public static double areaTriangle(double a,
     double b, double c), который вычисляет и возвращает значение площади
     треугольника по формуле Герона: p ⋅( p − a ⋅() p − b ⋅() p − c)

     , где a, b, c –

     стороны треугольника, p – полупериметр.
     3. Добавьте в класс Task61 метод public static void main(String[] args),
     который:
     − вводит значения сторон треугольника и выводит площадь
     треугольника, используя метод areaTriangle().
     4. Запустите приложение на исполнение.
     ТРЕБОВАНИЯ
     1. Приложение должно быть написано на языке Java.
     2. Используйте класс Scanner для ввода данных набором на клавиатуре.
     3. Используйте метод Math.sqrt() для вычисления корня квадратного.
     4. Используйте оператор System.out.println(...) для вывода результата.
     */
    public static void main(String[] args) {
        double a=6, b=10, c= 9;
        if (a>(b+c)|| b>(a+c)|| c>(a+b)) {System.out.println("Неверные значения сторон");}
        else
        System.out.println("Plosha = "+ areaTriangle(a,b,c));

    }
    public static double areaTriangle (double a, double b, double c){
        double p = (a+b+c)*0.5;
        return  Math.sqrt( p*(p-a)*(p-b)*(p-c));
    }
}
