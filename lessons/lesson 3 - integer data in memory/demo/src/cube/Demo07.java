package cube;

public class Demo07 {
    public static void main(String[] args)  {
        // побитовое и
        int i = 1436;
        int mask = 13;
        int result = i & mask;

        System.out.println(Utils.leftPad(Integer.toBinaryString(i), 16, "0"));
        System.out.println(Utils.leftPad(Integer.toBinaryString(mask), 16, "0"));
        System.out.println(Utils.leftPad("", 16, "-"));
        System.out.println(Utils.leftPad(Integer.toBinaryString(result), 16, "0"));
        System.out.println();
        System.out.println();


        // побитовое или
        i = 1113;
        mask = 33;
        result = i | mask;

        System.out.println(Utils.leftPad(Integer.toBinaryString(i), 16, "0"));
        System.out.println(Utils.leftPad(Integer.toBinaryString(mask), 16, "0"));
        System.out.println(Utils.leftPad("", 16, "-"));
        System.out.println(Utils.leftPad(Integer.toBinaryString(result), 16, "0"));
    }

}
