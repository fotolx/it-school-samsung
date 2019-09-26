package cube;

public class Demo01 {
    public static void main (String [] args) {
        // автоматическое преобразование
        byte b = 5;
        int i = b;
        System.out.printf("b = %d \n", b);
        System.out.printf("i = %d \n", i);
        System.out.println();



        // автоматическое преобразование с потерей точности
        int i2 = 1234567890;
        float f = i2;            // от типа int к типу float
        System.out.printf("i2 = %d \n", i2);
        System.out.printf("f = %f \n", f);
        System.out.println();


        // явные преобразования
        int i3 = 5;
        byte b2 = (byte) i3;
        System.out.printf("b = %d \n", b2);
        System.out.println();


        // потеря данных при преобразовании
        int i4 = 5000;
        byte b3 = (byte) i3;
        System.out.printf("i4 = %d \n", i4);
        System.out.printf("b = %d \n", b3);
        System.out.println();


//        byte b4 = 5;
//        byte b5 = b4 * 2;
    }

}
