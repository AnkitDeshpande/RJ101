public class BinaryRep {
          public static void main(String[] args) {
                    f(128);
          }

          public static void f(int n) {
                    if (n == 0) {
                              return;
                    }
                    f(n / 2);
                    System.out.print(n%2);
          }
}
