public class Primer6 {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[5];

        int[][] a = { { 6, 5 }, { 3, 2, 1, 6, 7 }, { 7, 8, 9 } };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 10);
                System.out.format("Значение элемента [%d] [%d] = %d\n", i, j, array[i][j]);
            }
        }
    }
}
