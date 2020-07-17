package suanfa._剑指Offer.二维数组中的查找;

/**
 * @Author Li
 * @Date 20.7.7 23:19
 * @Version 1.0
 */


public class solution {

    public static void main(String[] args) {
        int[][]arr={
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };
        solution s =new solution();
        System.out.println(   s.Find(15,arr));
    }


    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0||array[0].length==0) {
            return false;
        }
        int row =0;
        int col = array[0].length-1;
        while (row < array.length && col >=0) {
            if (target == array[row][col]) {
                return true;
            } else if (target > array[row][col]) {
                row++;
            }else {
                col--;
            }
        }

        return false;
    }
}
