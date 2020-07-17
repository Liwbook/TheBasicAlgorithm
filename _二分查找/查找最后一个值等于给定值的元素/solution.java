package suanfa._二分查找.查找最后一个值等于给定值的元素;

/**
 * @Author Li
 * @Date 20.5.4 22:49
 * @Version 1.0
 */


public class solution {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 11, 11, 11, 11, 11, 15, 20, 21};
        System.out.println(binarySearch(arr,20));
    }

    public static int  binarySearch(int[] arr,int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = left+(right-left)/2;
            if (target > arr[mid]) {
                left = mid+1;
            } else if (target < arr[mid]) {
                right=mid-1;
            }else{
                left = mid+1;
            }
        }
        if (right < 0 || arr[right] != target) {
            return-1;
        }
        return right;
    }

}
