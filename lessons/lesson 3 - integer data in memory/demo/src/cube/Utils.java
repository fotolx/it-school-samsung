package cube;

public class Utils {
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
