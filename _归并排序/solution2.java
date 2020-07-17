package suanfa._归并排序;

import java.util.Arrays;

/**
 * @Author Li
 * @Date 20.7.5 21:33
 * @Version 1.0
 */


public class solution2 {

    public static void main(String[] args) {
        int[] arr= {11,13,1,2,7,3,4,6,8,0,8};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void mergeSort(int [] arr){
        mergeSort(arr,0,arr.length-1);
    }




    private static void mergeSort(int[] arr, int l, int r) {
        int mid = l+(r-l)/2;
        if (l < r) {
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            sort(arr,l,mid,r);
        }
    }
    /**
     * 合并两个有序子序列
     * @param arr 待合并数组
     * @param left 待合并数组最小下标
     * @param mid 待合并数组中间下标
     * @param right 待合并数组最大下标
     */
    private static void sort(int[] arr, int left, int mid, int right) {
        int[] temp=new int[right-left+1]; //临时数组，用来保存每次合并年之后的结果

        int i =left;
        int j = mid+1;
        //temp数组的下标
        int k=0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++]=arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        //将左边序列中剩余的数放入临时数组
        while (i <= mid) {
            temp[k++]=arr[i++];
        }
        //将右边序列中剩余的数放入临时数组
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int index = 0; index < temp.length; index++) {
            arr[index+left] = temp[index];
        }
    }
}
