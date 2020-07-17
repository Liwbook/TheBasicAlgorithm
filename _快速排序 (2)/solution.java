package suanfa._快速排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author Li
 * @Date 20.4.3 15:42
 * @Version 1.0
 */


public class solution {
    public static void main(String[] args) {
        int[] arr = new int[100000000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        solution s  = new solution();
        long start =  System.currentTimeMillis();
        s.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("==============");
        System.out.println(end-start);
//        System.out.println(Arrays.toString(arr));
    }
    public void sort(int[] arr) {
        sort(arr,0,arr.length-1);
    }

    private void sort(int[] arr, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(arr, lo, hi);
        sort(arr, lo, j - 1);
        sort(arr,j+1,hi);
    }

    private int partition(int []arr,int lo,int hi) {
        int i =lo;
        int j = hi+1;
        int temp = arr[lo];
        while (true) {
            while (arr[++i] < temp) {
                if (i == hi) {
                    break;
                }
            }
            while (temp < arr[--j]) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        int t = arr[lo];
        arr[lo] = arr[j];
        arr[j]=t;
        return j;
    }
}
