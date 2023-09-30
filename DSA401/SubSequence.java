class SubSequence {

     public static void f(String ans, char[] arr, int low, int high) {
          if (low <= high+1 && !ans.equals("")) {
               System.out.println(ans);
          }
          for (int i = low; i < high; i++) {
               f(ans+arr[i], arr, i+1, high);
          }
     }
     public static void main(String[] args) {
          char arr[] = { 'a', 'b', 'c', 'd'};
          f("", arr, 0, arr.length);
     }
}
