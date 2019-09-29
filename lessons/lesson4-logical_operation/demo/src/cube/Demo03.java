package cube;

public class Demo03 {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;

        // выполнение последовательности действий при выполнении определенного условия
        if (a > b) {
            System.out.println("a > b");
        }
        System.out.println();

        // выполнение разных последовательностей действий
        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("b > a");
        }
        System.out.println();

        // используем else if для большего числа условий чем два
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("b > a");
        } else {
            System.out.println("a == b");
        }
    }

}
