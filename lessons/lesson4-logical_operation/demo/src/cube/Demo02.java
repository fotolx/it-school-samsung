package cube;

public class Demo02 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean result;

        result = a > b || a < b;  // логическое или
        System.out.printf("a > b || a < b \t %b \n", result);

        result = 3 < a && a < 6;
        System.out.printf("3 < a && a < 6 \t %b \n", result);

        result = !result;
        System.out.printf("!result \t %b \n", result);
        System.out.println();


        // у логических операций есть приоритет выполнения:
        // сначала !, потом &&, потом ||
        result = a < 5 || b < 5 && a > 7 || b > 7;
        System.out.printf("a < 5 || b < 5 && a > 7 || b > 7 \t %b \n", result);

        // можем использовать ( ) для изменения порядка выполнения
        result = (a < 5 || b < 5) && (a > 7 || b > 7);
        System.out.printf("(a < 5 || b < 5) && (a > 7 || b > 7) \t %b \n", result);

    }
}
