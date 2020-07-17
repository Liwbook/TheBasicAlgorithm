package suanfa._插入排序;

/**
 * @Author Li
 * @Date 20.7.5 16:18
 * @Version 1.0
 */

import java.util.Arrays;

/**
 *
 *
 * 插入排序的思想打牌的人肯定很容易理解，就是见缝插针。
 * 首先就默认数组中的第一个数的位置是正确的，即已经排序。
 * 然后取下一个数，与已经排序的数按从后向前的顺序依次比较，
 * 如果该数比当前位置排好序的数小，则将排好序的数的位置向后移一位。
 * 重复上一步骤，直到找到合适的位置。 找到位置后就结束比较的循环，将该数放到相应的位置。
 *
 * */

public class solution3 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 1, 2, 3, 7, 11, 8};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        if (arr == null) {
            return;
        }
        int len = arr.length;

        //i控制循环次数，因为已经默认第一个数的位置是正确的，所以i的起始值为1，i<len，循环len-1次
        for (int i = 1; i <len; i++) {
            int j=i;
            //target用来记录即将要排序的那个数的值即目标值
            int target = arr[j];
            while (j >0 && arr[j-1] > target) {
                arr[j]=arr[j-1];
                j--;
            }

            //更目标数的位置。
            arr[j]=target;
        }


    }
}
