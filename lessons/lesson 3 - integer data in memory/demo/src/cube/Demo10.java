package cube;

public class Demo10 {
    public static void main(String[] args)  {

        //знаковый сдвиг влево
        int a = 5;
        System.out.printf("a = %2d; %s \n", a, Utils.leftPad(Integer.toBinaryString(a), 32, "0"));
        a = a << 3;
        System.out.printf("a = %2d; %s \n", a, Utils.leftPad(Integer.toBinaryString(a), 32, "0"));
        System.out.println();


        //знаковый сдвиг вправо
        int b = 143;
        System.out.printf("b = %d; %s \n", b, Utils.leftPad(Integer.toBinaryString(b), 32, "0"));
        b >>= 3;
        System.out.printf("b = %d; %s \n", b, Utils.leftPad(Integer.toBinaryString(b), 32, "0"));
        System.out.println();

        int c = -43;
        System.out.printf("c = %d; %s \n", c, Integer.toBinaryString(c));
        c >>= 2;
        System.out.printf("c = %d; %s \n", c, Integer.toBinaryString(c));
        System.out.println();


        //беззнаковый оператор сдвига
        int d = -1233;
        System.out.printf("d = %9d; %s \n", d, Integer.toBinaryString(d));
        d = d >>> 5;
        System.out.printf("d = %d; %s \n", d, Utils.leftPad(Integer.toBinaryString(d), 32, "0"));
    }
}
