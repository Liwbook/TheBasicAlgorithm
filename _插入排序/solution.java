package suanfa._插入排序;


import java.util.Arrays;
import java.util.Comparator;

public class solution {
  
    public  static  void  insertionsort (int [] a){
        int j;
        for (int p = 1; p < a.length; p++) {
            int temp=a[p];
            for (j=p;j>0 && temp<a[j-1] ;j--){
                a[j] = a[j - 1];
            }
            a[j]=temp;
        }
    }
}
