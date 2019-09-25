package cube;

public class Demo02 {
    public static void main(String[] args) {
        int a = 2_000_000_000;
        System.out.printf("a is %s \n", Utils.leftPad(Integer.toBinaryString(a), 32, "0"));

        int b = a * 2;
        System.out.printf("b is %s \n", Integer.toBinaryString(b));
        System.out.printf("b = %d \n", b);
    }
}
