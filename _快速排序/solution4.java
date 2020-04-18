package suanfa._快速排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author Li
 * @Date 20.4.3 20:07
 * @Version 1.0
 */


public class solution4 {
    public static boolean comparable(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(100);
        }
        long start = System.currentTimeMillis();
        sort(arr,0,arr.length-1);
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
//        System.out.println(comparable(arr));
//        System.out.println(end-start);
     }
    public static void sort(int[] arr, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int lt=lo,i=lo+1,gt=hi;
        int t = arr[lo];
        while (i <= gt) {
            if (arr[i] < t) {
                int temp = arr[lt];
                arr[lt] = arr[i];
                arr[i]=temp;
                lt++;
                i++;
            } else if (arr[i] > t) {
                int temp = arr[i];
                arr[i] = arr[gt];
                arr[gt]=temp;
                gt--;
            }else {
                i++;
            }
        }
        sort(arr, lo, lt - 1);
        sort(arr, gt + 1, hi);
    }
}
