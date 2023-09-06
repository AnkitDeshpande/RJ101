import java.util.Arrays;

class MergeSort {
          public static void main(String[] args) {
                    int arr1[] = { 38, 27, 43, 3, 9, 82, 10 };

                    sort(arr1, 0, arr1.length - 1);

                    System.out.println(Arrays.toString(arr1));
          }
          
          public static void sort(int arr[], int l, int h) {
                    if (l < h) {
                              int q = (l + h) / 2;
                              sort(arr, l, q);
                              sort(arr, q + 1, h);
                              merge(arr, l, q, h);
                    }
          }
          
          public static void merge(int arr[], int l, int m, int h) {
                    int n1 = m - l + 1;
                    int n2 = h - m;
                    int arr1[] = new int[n1];
                    int arr2[] = new int[n2];
                    for (int i = 0; i < n1; ++i) {
                              arr1[i] = arr[l + i];
                    }
                    for (int i = 0; i < n2; ++i) {
                              arr2[i] = arr[m + 1 + i];
                    }
                    
                    int i = 0, j = 0, k = l;

                    while (i < n1 && j < n2) {
                              if (arr1[i] <= arr2[j]) {
                                        arr[k] = arr1[i];
                                        i++;
                              } else {
                                        arr[k] = arr2[j];
                                        j++;
                              }
                              k++;
                    }

                    while (i < n1) {
                              arr[k] = arr1[i];
                              i++;
                              k++;
                    }

                    while (j < n2) {
                              arr[k] = arr2[j];
                              j++;
                              k++;
                    }
                    
                    
          }
}