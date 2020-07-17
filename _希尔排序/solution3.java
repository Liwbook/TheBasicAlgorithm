package suanfa._希尔排序;

import java.util.Arrays;

/**
 * @Author Li
 * @Date 20.7.5 20:41
 * @Version 1.0
 */


public class solution3 {

    public static void main(String[] args) {
        int [] arr ={8,2,3,1,4,7,11,2,13};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public  static void shellSort(int[] arr) {
        if(arr==null)
            return;
        int len=arr.length;
        //初始的增量为数组长度的一半
        int k=len/2;
        //while循环控制按增量的值来划不同分子序列，每完成一次增量就减少为原来的一半
        //增量的最小值为1，即最后一次对整个数组做直接插入排序
        while (k > 0) {
            //里边其实就是升级版的直接插入排序了，是对每一个子序列进行直接插入排序，
            //所以直接将直接插入排序中的‘1’变为‘k’就可以了。
            for (int i = k; i < len; i++) {
                int j =i;
                int target = arr[i];
                while (j >= k && arr[j - k] > target) {
                    arr[j] = arr[j - k];
                    j-=k;
                }
                arr[j] =target;
            }
            k/=2;
        }

    }
}
