public class Main {
  public static void main(String[] args)  {

    //знаковый сдвиг влево
    int a = 5;
    System.out.printf("a = %d; %s \n", a, Integer.toBinaryString(a));
    a = a << 3;
    System.out.printf("a = %d; %s \n", a, Integer.toBinaryString(a));
    System.out.println();


    //знаковый сдвиг вправо
    int b = 43;
    System.out.printf("b = %d; %s \n", b, Integer.toBinaryString(b));
    b >>= 2;
    System.out.printf("b = %d; %s \n", b, Integer.toBinaryString(b));

    int c = -43;
    System.out.printf("c = %d; %s \n", c, Integer.toBinaryString(c));
    c >>= 2;
    System.out.printf("c = %d; %s \n", c, Integer.toBinaryString(c));
    System.out.println();


    //беззнаковый оператор сдвига
    int d = -123;
    System.out.printf("d = %d; %s \n", d, Integer.toBinaryString(d));
    d = d >>> 20;
    System.out.printf("d = %d; %s \n", d, Integer.toBinaryString(d));
  }
}
