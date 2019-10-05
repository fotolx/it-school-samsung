public class Main {

    public static void main(String[] args) {
        //Объявление массива
        int[] a;
        int test[];
        int [] b, c;
        //******************

        //Инициализация массива
        a = new int[5];
        int array[] = new int [5];

        int x = 1;
        int y = 2;
        int array1[] = new int [] {3, 11, 4, 6, 5};
        int array2[] = new int [] {3, 11, x, 2*x, y - x};
        int array3[] = {3, 11, x, 2*x, y - x};
        //******************

        //Длина массива и обращение к элементам массива
        System.out.println("Длина массива а = " + a.length);

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        //******************

        //Цикл for each
        int sum = 0;
        for (int e: a) {
            sum += e;
        }
        System.out.println("Сумма значений элементов массива а = " + sum);
        //******************

    }
}
