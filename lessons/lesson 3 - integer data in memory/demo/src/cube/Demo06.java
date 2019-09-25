package cube;
// accumulation inaccuracy

public class Demo06 {
    public static void main(String[] args)  {

        double f1 = 0.0;
        //прибавляем к f1 0.1 одиннадцать раз подряд
        for (int i = 0; i < 11; i++) {
            f1 += .1;
        }

        //Умножаем 0.1 на 11
        double f2 = 0.1 * 11;

        // Проверим!
        if (f1 == f2) {
            System.out.println("f1 и f2 равны!");
        }
        else {
            System.out.println("f1 и f2 не равны!");
        }

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
    }
}
