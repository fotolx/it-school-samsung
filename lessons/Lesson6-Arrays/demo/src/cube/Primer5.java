public class Primer5 {
    public static void main(String[] args) {
        int[][] array = {{3, 6, 5, 7}, {3, 2, 1, 6}, {7, 8, 9, 0}};

        for (int i = 0; i < array.length; i++) {
                System.out.format("%d %d %d %d\n", array[i][0], array[i][1], array[i][2], array[i][3]);
        }

        System.out.println("Перестановка");

        int[] temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.format("%d %d %d %d\n", array[i][0], array[i][1], array[i][2], array[i][3]);
        }
    }
}
