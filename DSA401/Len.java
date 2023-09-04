public class Len {
          public static void main(String[] args) {
                    // System.out.println(f("ankit"));
                    System.out.println(f(95));
          }

          public static int f(String s) {
                    if (s.equals("")) {
                              return 0;
                    }
                    return 1 + f(s.substring(1));
          }

          public static int f(int n) {
                    if (n>100) {
                              return n-10;
                    }
                    return f(f(n + 11));
          }

}
