package suanfa._选择排序;

/**
 * @Author Li
 * @Date 20.7.5 16:05
 * @Version 1.0
 */


import java.util.Arrays;

/**
 * 选择排序可以说是冒泡排序的改良版，不再是前一个数跟后一个数相比较，
 * 而是在每一次循环内都由一个数去跟 所有的数都比较一次，每次比较都选取相对较小的那个数来进行下一次的比较，
 * 并不断更新较小数的下标 这样在一次循环结束时就能得到最小数的下标，再通过一次交换将最小的数放在最前面，
 * 通过n-1次循环之后完成排序。 这样相对于冒泡排序来说，比较的次数并没有改变，但是数据交换的次数大大减少。
 *
 * */

public class solution2 {
    public static void main(String[] args) {
        int[] arr = {2,23,12,3,5,11,12,6,7,8,0};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {

        if (arr == null) {
            return;
        }

        int len = arr.length;
        //i控制循环次数，长度为len的数组只需要循环len-1次，i的起始值为0所以i<len-1
        for (int i=0;i<len-1;i++){
            //记录最小数的下标
            int minIndex =i;
            //j从i+1开始，i之前的数都是排好序的
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    //每比较一次都需要将较小数的下标记录下来
                    minIndex = j;
                }
            }
            //扫描后，得到最小下标，交换
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] =arr[minIndex];
                arr[minIndex] = temp;
            }
        }

    }

}
