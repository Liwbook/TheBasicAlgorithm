package suanfa._插入排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author Li
 * @Date 20.4.2 11:33
 * @Version 1.0
 */


public class solution2 {
    public static void main(String[] args) {

    }
    public static void sort(int [] arr) {
        int len =arr.length;

        for (int i = 1; i < len; i++) {

            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j-1]= temp;
            }
        }
    }
}
