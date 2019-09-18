public class Main {
  public static void main(String[] args)  {
    //побитовое отрицание (not)
    int i = 123;
    System.out.println("i = " + i);
    System.out.println("~i = " + ~i);
    System.out.println();

    //побитовое исключающее или (xor)
    int value = 1234;
    int key = 8888;
    int xorValue = value ^ key;
    System.out.println("value = " + value);
    System.out.println("xorValue = " + xorValue);
    System.out.println("xorValue ^ key = " + (xorValue ^ key));
  }
}
