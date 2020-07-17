package suanfa._希尔排序;


import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] k = {11, 3, 4, 12, 14, 15, 10, 7, 5, 3, 1};
        shellsort(k);
        System.out.println(Arrays.toString(k));
    }

    public static void shellsort(int[] a) {
        int j;
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                int temp = a[i];
                for (j = i; j >= gap && temp < a[j - gap]; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j]=temp;
            }
        }
    }
}
