package suanfa._二叉堆;

import java.util.Arrays;

/**
 * @Author Li
 * @Date 20.5.6 11:06
 * @Version 1.0
 */
class Main{
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 2, 3, 7, 8, 11, 33, 12};
        Heap heap = new Heap(arr);
        heap.insert(13);
        heap.sort();
        System.out.println(heap.toString());
    }
}

public class Heap {
    private int [] a;
    private  int n;
    private  int count;

    @Override
    public String toString() {
        return "Heap{" +
                "a=" + Arrays.toString(a) +
                '}';
    }

    public Heap( int [] arr ) {
        a = new int[arr.length*2];
        n = arr.length;
        count = n;
        for (int i = 1; i <= arr.length; i++) {
            a[i] = arr[i-1];
        }
        buildHeap(a);

    }

    public void insert(int data) {
        if (count >= a.length) {
            return;
        }
        a[++count] =data;
        int i =count;
        while (i / 2 > 0 && a[i / 2] < a[i]) {
            swap(a, i / 2, i);
            i= i/2;
        }
    }

    public void removeMax() {
        if (count == 0) {
            return;
        }
        a[1] = a[count];
        --count;
        heapify(a,count,1);

    }


    private  void heapify(int[] arr, int n, int i) {
        while (true) {
            int maxPos = i;
            if (i * 2 <= n && a[i] < a[i * 2]) {
                maxPos = i*2;
            }
            if (i * 2 + 1 <= n && a[i * 2 + 1] > a[maxPos]) {
                maxPos = 2*i+1;
            }
            if (maxPos == i) {
                break;
            }
            swap(a,maxPos,i);
            i=maxPos;
        }
    }

    public void buildHeap(int[] arr) {
        a = arr;
        for (int i = (arr.length - 1) / 2; i > 0; i--) {
            heapify(arr,arr.length-1,i);
        }
    }

    public void sort() {
        if (a.length == 0 || a == null) {
            return;
        }
        int k =count;
        while (k > 1) {
            swap(a, 1, k);
            k--;
            heapify(a,k,1);
        }
    }

    private void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
