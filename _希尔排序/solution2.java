package suanfa._希尔排序;

import java.util.Arrays;

/**
 * @Author Li
 * @Date 20.4.3 10:52
 * @Version 1.0
 */


public class solution2 {
    public static void main(String[] args) {
        int[] arr = {10, 3, 1, 2, 5, 6, 8, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort( int[] arr) {
        int len = arr.length;
        int h =1;
        while (h < len / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < len; i++) {
                for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h) {
                    int temp = arr[j];
                    arr[j] = arr[j - h];
                    arr[j-h] = temp;
                }
            }
            h/=3;
        }
    }
}
