package suanfa._希尔排序;

/**
 * @Author Li
 * @Date 20.7.5 21:18
 * @Version 1.0
 */


public class Demo {


    public void shellSort(int [] arr){
        if (arr == null) {
            return;
        }
        int len =arr.length;
        int k = len/2;
        while (k > 0) {

            for (int i = k; i < len; i++) {
                int j =i;
                int target = arr[i];
                while (j >= k && arr[j - k] > target) {
                    arr[j]=arr[j-k];
                    j-=k;
                }
                arr[j]=target;


            }
            k/=2;
        }
    }
}
