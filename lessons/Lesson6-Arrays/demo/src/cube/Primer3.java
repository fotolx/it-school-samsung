public class Primer3 {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int[] b = new int[]{0, 1, 2, 3, 4, 5};
        int[][] c = {{0, 1, 2}, {3, 4, 5}};

        //**********************
        int[][] array = new int[3][];
        array[0] = new int[4];
        array[1] = new int[4];
        array[2] = new int[4];

        System.out.println("Количество строк массива = " + array.length);
        System.out.println("Количество столбцов массива = " + array[0].length);
        System.out.println("Количество столбцов массива = " + array[1].length);

        array[1][0]=44;
        System.out.println("Значение элемента = " + a[1][0]);
    }
}

