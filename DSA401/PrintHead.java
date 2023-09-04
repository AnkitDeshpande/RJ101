import java.util.Scanner;

class PrintHead {
          
          public static void fun(int n) {
                    if (n == 0) {
                              return;
                    }
                    fun(n-1);
                    System.out.println(n);
          }

          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    fun(n);
          }
}