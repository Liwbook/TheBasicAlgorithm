package suanfa._计数排序;

import java.util.Arrays;

/**
 * @Author Li
 * @Date 20.5.4 20:33
 * @Version 1.0
 */


public class solution {
    public static void main(String[] args) {
        int [] arr= {8,8,6,5,3,2,3,1,2,3,8,10,1,7};
        System.out.println(Arrays.toString(countSort(arr)));
    }

    public static int[] countSort(int[] array) {
        int maxLen = array[0];
        for (int i = 1; i < array.length; i++) {
            maxLen= Math.max(maxLen,array[i]);
        }
        int[] countArr = new int[maxLen+1];
        for (int i = 0; i < array.length; i++) {
            countArr[array[i]]++;

        }
        //遍历统计
        int index = 0;
        int[]sortArr = new int[array.length];
        for (int i = 0; i < countArr.length; i++) {
            for (int j = 0; j < countArr[i]; j++) {
                sortArr[index++]  =i;
            }
        }
        return sortArr;
    }
}
