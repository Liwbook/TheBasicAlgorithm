package suanfa._二分查找.查找第一个大于等于给定值的元素;

/**
 * @Author Li
 * @Date 20.5.5 10:04
 * @Version 1.0
 */


public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 10, 10, 10, 11, 12, 13};
        System.out.println(bSearch(arr,11));
    }
    public static int bSearch(int[] arr, int target) {
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid  = left+ ((right-left)>>1);
            if (target <= arr[mid]) {
                if (mid == 0 || arr[mid - 1] < target) {
                    return mid;
                }else{
                    right=mid-1;
                }
            }else {
                left=mid+1;
            }
        }

        return -1;
    }
}
