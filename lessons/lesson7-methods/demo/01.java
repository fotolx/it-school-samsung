public class Main {
    public static void main(String[] args) {
      int[] arr1 = new int[] {1, 2, 3, 4, 5};
      int[] arr2 = new int[] {6, 7, 8, 9, 10};
      int[] arr3 = new int[] {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

      printArray(arr1);
      printArray(arr2);
      printArray(arr3);
    }

    public static void printArray(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
}
