package suanfa.binarySerachTree;

import java.util.Random;

/**
 * @Author Li
 * @Date 20.5.16 20:55
 * @Version 1.0
 */


public class test {

    public static void main(String[] args) {
        TreeNode bts = new TreeNode();
        Random random = new Random();
        System.out.println();
        for (int i = 0;i<10;i++){
            int nums = random.nextInt(100);
            System.out.print(nums+"  ");

            bts.add(nums);
        }
        bts.toString();
    }
}
