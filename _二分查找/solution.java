package suanfa._二分查找;


public class solution {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9,11,12,13,14,15,17};
        System.out.println(rank(arr,3));
    }

    public static int rank(int[] a,int target) {
        int left=0;
        int right=a.length-1;
        while (left <= right) {
            int mid = left + (right-left) / 2;
            if (target < a[mid]) {
                right=mid-1;
            } else if (target > a[mid]) {
                left=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
