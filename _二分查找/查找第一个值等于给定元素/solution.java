package suanfa._二分查找.查找第一个值等于给定元素;

/**
 * @Author Li
 * @Date 20.5.5 9:43
 * @Version 1.0
 */

/**
 * 1 3 4 5 6 8 8 8 11 18
* */
public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6,  8, 8, 8, 11, 18};
        System.out.println(bSearch(arr,8));
    }
    public static int bSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid  = left+((right-left)>>1);
            if (target<arr[mid]){
                right=mid-1;
            } else if (target > arr[mid]) {
                left = mid+1;
            }else {
                if (mid == 0 || arr[mid - 1] != target) {
                    return mid;
                }else {
                    right=mid-1;
                }

            }

        }
        return -1;
    }
}
