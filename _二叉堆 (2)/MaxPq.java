package suanfa._二叉堆;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author Li
 * @Date 20.4.4 14:24
 * @Version 1.0
 */

class test{
    public static void main(String[] args) {

        Random random = new Random();
        int[] p = new int[10];

        for (int i = 0; i < 10; i++) {
            p[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(p));
        MaxPq pq = new MaxPq(p);
        System.out.println(pq.toString());
    }
}
public class MaxPq {
    private int [] pq;
    private int size=0;

    @Override
    public String toString() {
        return "MaxPq{" +
                "pq=" + Arrays.toString(pq) +
                '}';
    }

    //pq[0]不使用
    public MaxPq(int[] data) {
        pq = new int[data.length+1];
        for (int i = 0; i < data.length; i++) {
           insert(data[i]);
        }
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int size() {
        return size;
    }

    public void insert(int k) {
        pq[++size]= k;
        swim(size);
    }

    public int delMax() {
        int max = pq[1];
        int temp = pq[1];
        pq[1] = pq[size];
        pq[size] = 0;
        size--;
        sink(1);
        return max;
    }

    private void swim(int k) {

        while (k > 1 && pq[k / 2] < pq[k]) {
            pq[k] = pq[k/2];
            k=k/2;
        }

    }

    private void sink(int k) {
        while (2 * k <= size) {
            int j = 2*k;
            if (j < size && pq[j] < pq[j + 1]) {
                j++;
            }
            if (k > j) {
                break;
            }
            int temp = pq[k];
            pq[k] = pq[j];
            pq[j] = temp;
            k=j;
        }
    }
}
