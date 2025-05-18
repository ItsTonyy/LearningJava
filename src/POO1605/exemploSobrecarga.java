package POO1605;

public class exemploSobrecarga {
  public static int soma(int a, int b) {
    return a + b;
  }

  public static int soma(int a, int b, int c) {
    return a + b + c;
  }

  public static int soma(String a, String b) {
    int i = Integer.parseInt(a);
    int j = Integer.parseInt(b);

    return i + j;
  }
}
