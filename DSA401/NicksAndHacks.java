public class NicksAndHacks {
          public static void main(String[] args) {
                    System.out.println(f(1,25));
          }
          public static boolean f(int i, int n) {
                    if (i == n) {
                              return true;
                    }
                    if (i > n) {
                              return false;
                    }
                    return f(i * 10, n) || f(i * 20, n);
          }
}
