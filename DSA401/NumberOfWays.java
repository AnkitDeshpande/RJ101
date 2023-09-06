public class NumberOfWays {
          public static void main(String[] args) {
               System.out.println(f(9));
          }

	public static int f(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		}
		return f(n - 1) + f(n - 2) + f(n - 3);
	}
	public static int fun(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		}
		return fun(n - 4) + fun(n - 8);
          }
}
