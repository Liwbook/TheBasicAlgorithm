package suanfa._二叉堆.MaxHeap;

import java.util.Random;

/**
 * @Author Li
 * @Date 20.5.18 13:51
 * @Version 1.0
 */


public class Test {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        Random random = new Random();
        for (int i = 0;i<15;i++){
            int temp = random.nextInt(100);
            System.out.print( temp+" ");
            arr.addLast(temp);
        }
        System.out.println();
        System.out.println(arr.toString());
        arr.remove(1);
        System.out.println("reomve:1 "+arr.toString());
        arr.add(3,1000);
        System.out.println(arr.toString());
        arr.addFirst(1);
        System.out.println(arr.toString());
        System.out.println(arr.get(1));
    }
}
