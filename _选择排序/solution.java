package suanfa._选择排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author Li
 * @Date 20.4.2 11:15
 * @Version 1.0
 */


public class solution {
    public static void main(String[] args) {


    }
    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min =i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]=temp;
        }
    }
}
