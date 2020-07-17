package suanfa._冒泡排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author Li
 * @Date 20.5.4 14:40
 * @Version 1.0
 */


public class solution {
    public static void main(String[] args) {
        int [] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        long start= System.currentTimeMillis();
        insertionSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                    flag=true;
                }
            }
            if (!flag) {
                break;
            }

        }
    }

}
