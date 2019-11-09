public class Primer4 {
    public static void main(String[] args) {

        int x = (int) (Math.random() * 10) + 1;

        int[][] array = new int[6][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 10);
                System.out.format("Значение элемента [%d] [%d] = %d\n", i, j, array[i][j]);
            }
        }
    }
}
