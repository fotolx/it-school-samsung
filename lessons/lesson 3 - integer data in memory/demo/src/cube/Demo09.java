package cube;

public class Demo09 {
    public static void main(String[] args)  {
        //побитовое отрицание (not)
        int i = 123;
        System.out.printf(" i = %4d; %s \n", i, Utils.leftPad(Integer.toBinaryString(i), 32, "0"));
        System.out.printf("~i = %4d; %s \n", ~i, Utils.leftPad(Integer.toBinaryString(~i), 32, "0"));
        System.out.println();
        System.out.println();



        //побитовое исключающее или (xor)
        int value = 1234;
        int key = 8888;
        int xorValue = value ^ key;
        int xorXorValue = xorValue ^ key;
        System.out.println(Utils.leftPad(Integer.toBinaryString(value), 16, "0"));
        System.out.println(Utils.leftPad(Integer.toBinaryString(key), 16, "0"));
        System.out.println(Utils.leftPad("", 16, "-"));
        System.out.println(Utils.leftPad(Integer.toBinaryString(xorValue), 16, "0"));
        System.out.println();

        System.out.printf("value = %d; \n", value);
        System.out.printf("key = %d; \n", key);
        System.out.printf("xorValue = %d; \n", xorValue);
        System.out.printf("xorxorValue = %d; \n", xorXorValue);
    }
}
