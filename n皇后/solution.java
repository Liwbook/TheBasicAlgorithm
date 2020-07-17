package suanfa.n皇后;

import java.util.Arrays;

/**
 * @Author Li
 * @Date 20.5.7 15:55
 * @Version 1.0
 */


public class solution {
    public static void main(String[] args) {
        solution s = new solution();
        s.queens(0);
    }

    int[] result = new int[8];
    public void queens(int row){
        if (row == 8) {
            print();
            return;
        }
        for (int col = 0; col < result.length; col++) {
            if (isOk(row,col)){
                result[row] = col;
                queens(row+1);
            }
        }
    }

    private boolean isOk(int row, int col) {
        int leftup = col-1;
        int rightup = col+1;
        for (int i = row - 1; i >= 0; i--) {
            if (result[i] == col) {
                return false;
            }
            if (leftup >= 0) {
                if (result[i] == leftup) {
                    return false;
                }
            }
            if (rightup < result.length) {
                if (result[i] == rightup) {
                    return false;
                }
            }
            leftup--;
            rightup++;
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i]==j){
                    System.out.print(" Q ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(result));
    }
}
