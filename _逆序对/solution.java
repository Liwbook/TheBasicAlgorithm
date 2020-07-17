package suanfa._逆序对;

import java.util.Arrays;

/**
 * @Author Li
 * @Date 20.5.7 14:59
 * @Version 1.0
 */

class Main{
    public static void main(String[] args) {
        solution s = new solution();
        int []a = {1,2,3,9,5,6,7,4};
        System.out.println(s.count(a));
        System.out.println(Arrays.toString(a));
    }
}
public class solution {


    private int num = 0;
    public int count(int[] arr) {
        if (arr==null||arr.length==0){
            return 0;
        }
        mergeSortCounting(arr,0,arr.length-1);
        return num;
    }
    private void mergeSortCounting(int [] arr,int p,int r){
        if (p >= r) {
            return;
        }
        int q = (p+r)/2;
        mergeSortCounting(arr,p,q);
        mergeSortCounting(arr,q+1,r);
        merge(arr,p,q,r);
    }
    private void merge(int []arr,int p,int q,int r){
        int i=p;
        int j = q+1;
        int k = 0;
        int[] temp = new int[r-p+1];
        while (i<=q&&j<=r){
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }else{
                num+=(q-i+1);
                temp[k++] = arr[j++];
            }
        }
        while (i <= q) {
            temp[k++] = arr[i++];
        }
        while (j<=r){
            temp[k++] = arr[j++];
        }
        for (int index = 0; index < r-p+1; index++) {
              arr[p+index] =   temp[index];
        }
    }
}
