import java.util.Scanner;

public class Demo01 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int n = in.nextInt();
      System.out.println(n * 2);
    }
  }
}
