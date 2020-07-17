package suanfa._快速排序;

import java.util.Arrays;

/**
 * @Author Li
 * @Date 20.7.5 21:54
 * @Version 1.0
 */





public class solution3_2 {

    /**
     * 快速排序也采用了分治的策略，这里引入了‘基准数’的概念。
     * <p>
     * 找一个基准数（一般将待排序的数组的第一个数作为基准数）
     * 对数组进行分区，将小于等于基准数的全部放在左边，大于基准数的全部放在右边。
     * 重复1，2步骤，分别对左右两个子分区进行分区，一直到各分区只有一个数为止。
     **/

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 5, 4, 11, 12, 0, 6, 7, 5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }
public static void quickSort(int[] arr, int low, int high) {
    int i,j,temp,t;
    if (low > high) {
        return;
    }
    i=low;
    j=high;
    //基准位
    temp = arr[low];

    while (i < j) {
        //先从右边开始
        while (arr[j] >= temp && i < j) {
            j--;
        }

        while (arr[i] <= temp && i < j) {
            i++;

        }



        if (i < j) {
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
    arr[low] = arr[i];
    arr[i] = temp;


    quickSort(arr, low, j - 1);
    quickSort(arr, j + 1, high);


}
}
