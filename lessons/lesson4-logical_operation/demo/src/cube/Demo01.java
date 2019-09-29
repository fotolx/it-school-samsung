package cube;

public class Demo01 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean result;

        result = a == b; // равно
        System.out.printf("a == b \t %b \n", result);

        result = a != b; // не равно
        System.out.printf("a != b \t %b \n", result);

        result = a < b; // строго меньше
        System.out.printf("a < b \t %b \n", result);

        result = a > b; // строго больше
        System.out.printf("a > b \t %b \n", result);

        result = a <= 4; // меньше или равно
        System.out.printf("a <= b \t %b \n", result);

        result = b >= 6; // больше или равно
        System.out.printf("a >= b \t %b \n", result);


        // нельзя выстраивать цепочки операций сравнения — это строго бинарные операции
        // двойные условия типа 1≤x≤6 записываются в виде пар логических операций (Demo02)
    }
}
