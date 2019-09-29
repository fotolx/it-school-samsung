package cube;

public class Demo05 {
    public static void main(String[] args) {
        int a = 6;
        int b;

        if (a == 6) {
            b = 2;
        } else if (a == 7) {
            b = 3;
        } else if (a == 8) {
            b = 4;
        } else if (a == 9) {
            b = 5;
        } else {
            b = 0;
        }
        System.out.println("b = " + b);
        System.out.println();


        // switch .. case
        switch (a) {
            case 6: b = 2; break;
            case 7: b = 3; break;
            case 8: b = 4; break;
            case 9: b = 5; break;
            default: b = 0;
        }
        System.out.println("b = " + b);
        System.out.println();


        // не забываем про break;
        System.out.println("missing break");
        switch (a) {
            case 6: b = 2;
            case 7: b = 3;
            case 8: b = 4;
            case 9: b = 5;
            default: b = 0;
        }
        System.out.println("b = " + b);

    }
}
