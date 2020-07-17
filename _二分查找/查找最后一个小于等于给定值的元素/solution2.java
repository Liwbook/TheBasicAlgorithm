package suanfa._二分查找.查找最后一个小于等于给定值的元素;

/**
 * @Author Li
 * @Date 20.5.5 10:16
 * @Version 1.0
 */


public class solution2 {
    public int bSearch(int[] arr, int target) {
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        int left =0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = left+((right-left)>>1);
            if (target<arr[mid]){
                right=mid-1;
            }else{
                if (mid == arr.length - 1 || arr[mid + 1] > target) {
                    return mid;
                }else{
                    left=mid+1;
                }
            }
        }
            return -1;
    }
}
