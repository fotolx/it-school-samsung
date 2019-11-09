import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int a = 5;
    System.out.println("a = " + a);
    doSmthWithInt(a);
    System.out.println("a = " + a);
    System.out.println();


    int[] arr1 = new int[] {1, 2, 3, 4, 5};
    System.out.println("arr1: " + Arrays.toString(arr1));
    doSmthWithArray(arr1);
    System.out.println("arr1: " + Arrays.toString(arr1));
  }

  public static void doSmthWithInt(int value) {
    value = value * 10;
    System.out.println("value = " + value);
  }

  public static void doSmthWithArray(int[] arr) {
    arr[1] = arr[1] * 10;
    System.out.println("arr = " + Arrays.toString(arr));
  }
}
