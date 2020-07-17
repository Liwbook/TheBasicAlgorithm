package suanfa._堆排序;

/**
 * @Author Li
 * @Date 20.7.6 15:48
 * @Version 1.0
 */


public class demo {


    public static void heapSort(int [] arr){
        if (arr == null) {
            return;
        }

        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            adjustHeap(arr,i,len);
        }

        for (int j = len - 1; j > 0; j--) {
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }

    }

    private static void adjustHeap(int[] arr, int i, int j) {

        int temp = arr[i];
        for (int k = 2 * i + 1; k < j; k = 2 * k + 1) {

            if (k+1 <j&&arr[k] < arr[k + 1]) {
                k++;
            }
            if (arr[k] > temp) {
                arr[i] = arr[k];
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
