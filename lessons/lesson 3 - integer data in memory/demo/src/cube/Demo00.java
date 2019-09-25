package cube;

public class Demo00 {
    public static void main(String[] args) {
        int i = 1_000;
        float f = 2.5f;
        double d = 29841.1234;


        System.out.printf("b = %32s \n", Integer.toBinaryString(i));
        System.out.printf("f = %32s \n", Integer.toBinaryString(Float.floatToIntBits(f)));
        System.out.printf("d = %64s \n", Long.toBinaryString(Double.doubleToLongBits(d)));
    }
















    public static String leftPad(String str, int len, String pad) {
        if (str.length() == len) {
            return str;
        }
        String padded = "";
        for (int i = 0; i < len; i++) {
            padded += pad;
        }

        return padded.substring(str.length()) + str;
    }
}
