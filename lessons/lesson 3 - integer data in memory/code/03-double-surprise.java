public class Main {

  public static void main(String[] args)  {

    double f = 0.0;
    //прибавляем к f 0.1 десять раз подряд
    for (int i = 0; i < 10; i++) {
      f += 0.1;
    }

    System.out.println(f);
  }
}
