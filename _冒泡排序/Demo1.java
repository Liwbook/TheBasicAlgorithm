package suanfa._冒泡排序;

/**
 * @Author Li
 * @Date 20.7.5 14:34
 * @Version 1.0
 */


public class Demo1 {


    public void bubbleSort(int []arr){
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i=0;i<arr.length;i++){
            boolean flag = false;
            //此处你可能会疑问的j<n-i-1，因为冒泡是把每轮循环中较大的数飘到后面，
            //j控制比较次数，第i次循环内需要比较len-i次
            // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=t;
                    flag =true;
                }
            }
            if (!flag) {
                break;
            }
        }



    }
}
