package suanfa._归并排序;


import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {13, 11, 15, 16, 12, 7, 6, 5, 9};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] a) {
        int[] k = new int[a.length];
        mergeSort(a,k,0,a.length-1);
    }

    private static void mergeSort(int[] a ,int[] tempArr,int left,int right) {
        if (left < right) {
            int center=(left+right)/2;
            mergeSort(a, tempArr, left, center);
            mergeSort(a, tempArr, center + 1, right);
            merge(a,tempArr,left,center+1,right);
        }
    }

    private static void merge(int[] a, int[] tempArr, int leftpos, int rightpos, int rightend) {
        int leftend=rightpos-1;
        int temppos=leftpos;
        int numElements = rightend-leftpos+1;
        while (leftpos <= leftend && rightpos <= rightend) {
            if (a[leftpos] <= a[rightpos]) {
                tempArr[temppos++] = a[leftpos++];
            }else{
                tempArr[temppos++] = a[rightpos++];
            }
        }
        while (leftpos <= leftend) {
            tempArr[temppos++] = a[leftpos++];
        }
        while (rightpos <= rightend) {
            tempArr[temppos++] = a[rightpos++];
        }
        for (int i = 0; i < numElements; i++, rightend--) {
            a[rightend] = tempArr[rightend];
        }
    }
}
