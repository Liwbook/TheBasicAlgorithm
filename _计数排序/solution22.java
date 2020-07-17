package suanfa._计数排序;

/**
 * @Author Li
 * @Date 20.7.6 15:59
 * @Version 1.0
 */

import java.util.Arrays;

/**
 *
 * 计数排序采用了一种全新的思路，不再是通过比较来排序，
 * 而是将待排序数组中的最大值+1作为一个临时数组的长度，
 * 然后用临时数组记录待排序数组中每个元素出现的次数。
 * 最后再遍历临时数组，因为是升序，所以从前到后遍历，
 * 将临时数组中值>0的数的下标循环取出，依次放入待排序数组中，
 * 即可完成排序。计数排序的效率很高，但是实在牺牲内存的前提下
 * 并且有着限制，那就是待排序数组的值必须 限制在一个确定的范围。
 **/
public class solution22 {
    public static void main(String[] args) {
        int [] arr = {2,3,1,2,3,11,1,12,13,15,17,20,5,6,7};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int[] arr) {
        if (arr == null) {
            return;
        }
        int len =arr.length;
        int minNum = arr[0];
        int maxNum = arr[0];
        for (int i = 1; i < len; i++) {
            maxNum = arr[i]> maxNum? arr[i] : maxNum;
            minNum = arr[i] < minNum? arr[i] : minNum;
        }
        int[] temp = new int[maxNum + 1];
        for (int i = 0; i < len; i++) {
            temp[arr[i]]++;
        }

        int k=0;
        for (int i = minNum; i < temp.length; i++) {
            int t = temp[i];
            while (t-- > 0) {
                arr[k++] = i;
            }
        }


    }
}
