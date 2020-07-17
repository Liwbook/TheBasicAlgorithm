package suanfa._堆排序;

import java.util.Arrays;

/**
 * @Author Li
 * @Date 20.7.6 14:41
 * @Version 1.0
 */



public class solution {


/**
 * 此之前要先说一下堆的概念，堆是一种特殊的完全二叉树，分为大顶堆和小顶堆。
 *
 * 大顶堆：每个结点的值都大于它的左右子结点的值，升序排序用大顶堆。
 *
 * 小顶堆：每个结点的值都小于它的左右子结点的值，降序排序用小顶堆。
 *
 * 所以，需要先将待排序数组构造成大顶堆的格式，这时候该堆的顶结点就是最大的数，
 * 将其与堆的最后一个结点的元素交换。再将剩余的树重新调整成堆，再次首节点与尾结点交换，
 * 重复执行直到只剩下最后一个结点完成排序。
 **/


public static void main(String[] args) {
    int[] arr = {1, 11, 12, 13, 2, 3, 9, 8, 7};

    heapSort(arr);
    System.out.println(Arrays.toString(arr));

}
public static void heapSort(int[] arr) {



    if (arr == null) {
        return;
    }

    int len =arr.length;
    //初始化大顶堆（从最后一个非叶节点开始，从左到右，由下到上）
    for (int i = len / 2 - 1; i >= 0; i--) {
        adjustHeap(arr,i,len);
    }
    System.out.println(Arrays.toString(arr));
    for (int j = len - 1; j > 0; j--) {
        swap(arr, 0, j);
        adjustHeap(arr,0,j);
    }

}

    private static void adjustHeap(int[] arr, int i, int j) {
        int temp=arr[i];//定义一个变量保存开始的结点
        for (int k = 2 * i + 1; k < j; k = 2 * k + 1) {
            //找出最大的孩子
            if (k + 1 < j && arr[k] < arr[k + 1]) {
                k++;
            }

            if (arr[k] > temp) {
                arr[i]=arr[k];
                i=k;
            }else{
                break;
            }
        }
        arr[i]=temp;
    }

    private static void swap(int[] arr, int num1,int num2) {
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }

}
