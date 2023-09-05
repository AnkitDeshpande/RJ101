public class NumberOfWays {
          public static void main(String[] args) {
               System.out.println(f(4));
          }
          public static int f(int n) {
			if (n < 0) {
				return 0;
			} else if (n == 0) {
				return 1;
			}
			return f(n - 1) + f(n - 2) + f(n - 3);
          }
}
