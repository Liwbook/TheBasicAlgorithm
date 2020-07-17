package suanfa._计数排序;

/**
 * @Author Li
 * @Date 20.5.4 21:08
 * @Version 1.0
 */

import java.util.Arrays;

/**
 * 稳定排序
 * 计数排序优化版
 * 分数: 90  99  95 94  95
 * */
public class solution2 {
    public static void main(String[] args) {
        int [] arr = {99,92,90,95,93,91,90};
        System.out.println(Arrays.toString(countSort(arr)));
    }
    public static int[] countSort(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            max=Math.max(max,array[i]);
            min=Math.min(min,array[i]);
        }
        int len= max-min+1;
        int [] countArr=new int[len];
        for (int i = 0; i < array.length; i++) {
            countArr[array[i]-min]++;
        }
        //后面元素等于前面元素之和
        int sum=0;
        for (int i = 0; i < len; i++) {
            sum+=countArr[i];
            countArr[i]=sum;
        }
        //倒序遍历数组，从统计数组找到正确位置
        int[] sortArr = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            sortArr[countArr[array[i]-min]-1] = array[i];
            countArr[array[i]-min]--;
        }
        return sortArr;
    }
}
