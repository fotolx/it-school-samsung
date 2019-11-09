import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int a = 5;
    int b = a;
    a++;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println();


    int[] arr1 = new int[] {1, 2, 3, 4, 5};
    int[] arr2 = arr1;
    arr1[1] = 0;
    System.out.println("arr1: " + Arrays.toString(arr1));
    System.out.println("arr2: " + Arrays.toString(arr2));
    System.out.println();

    System.out.println("arr1 = " + arr1);
    System.out.println("arr2 = " + arr2);
  }
}
