package suanfa._插入排序;

/**
 * @Author Li
 * @Date 20.7.5 16:46
 * @Version 1.0
 */


public class Demo {

    public static void main(String[] args) {
        String s = "1";
        String  s2 = "s2";
        System.out.println(s.equals(s2));



    }

    public void insertSort(int[] arr) {
        if (arr == null) {
            return;
        }

        int len= arr.length;
        for (int i = 1; i < len; i++) {
            int j=i;
            int target = arr[j];
            while (j > 0 && arr[j - 1] > target) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j]=target;
        }
    }
}
