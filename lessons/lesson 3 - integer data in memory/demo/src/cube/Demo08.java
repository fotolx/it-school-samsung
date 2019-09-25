package cube;

public class Demo08 {
    public static void main(String[] args)  {
        // узнать значение в определенном бите
        int i = 1436;
        int mask = 4;
        int result = i & mask;
        System.out.printf("3-й бит числа %d = %d \n", i, result > 0 ? 1 : 0);
        System.out.printf("двоичное представление числа %d = %s \n", i, Integer.toBinaryString(i));
        System.out.println();



        // выставить значение в определенном бите
        int a = 10;
        System.out.printf("a = %s \n", Integer.toBinaryString(a));
        a = a | mask;
        System.out.printf("a = %s \n", Integer.toBinaryString(a));
    }
}
