package cube;

public class Demo04 {
    public static void main(String[] args) {
        int a = 6;
        int b;

        if (a < 7) {
            b = 10;
        } else {
            b = 5;
        }
        System.out.println("b = " + b);
        System.out.println();


        // лучше использовать тернарный оператор
        b = a < 7 ? 10 : 5;
        System.out.println("b = " + b);
    }
}
