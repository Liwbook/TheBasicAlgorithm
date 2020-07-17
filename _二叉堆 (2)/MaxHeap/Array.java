package suanfa._二叉堆.MaxHeap;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author Li
 * @Date 20.5.18 13:19
 * @Version 1.0
 */


public class Array<E> {
    private E[] data;
    private int size;
    public Array(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }
    public Array(){
        this(10);
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void add(int index,E e){
        checkIndex(index);
        if (size == data.length) {
            resize(data.length*2);
        }
        System.arraycopy(data,index,data,index+1,size-index);
        data[index] = e;
        size++;
    }
    public void addLast(E e){
        add(size,e);
    }
    public void addFirst(E e ){
        add(0,e);
    }
    public E get(int index){
        checkIndex(index);
       return data[index];
    }
    public void set(int index,E e){
        checkIndex(index);
        data[index] = e;
    }
    public boolean contains(E e){
        for (int i=0;i<size;i++){
            if (data[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e){
        for (int i = 0;i<size;i++){
            if (data.equals(e)){
                return i;
            }
        }
        return -1;
    }
    public E remove (int index){
        checkIndex(index);
        E e = data[index];
        System.arraycopy(data,index+1,data,index,size-index-1);
        size--;
        data[size] = null;
        return e;

    }
    public void removeElement(E e){
        int index = indexOf(e);
        remove(index);
    }

    public E removeFirst(){

        return remove(0);
    }
    public E removeLast(){
        return remove(size-1);
    }
    public int length(){
        return data.length;
    }


    private boolean checkIndex(int index){
        if (index<0||index>size){
            throw new IllegalArgumentException("ArrayIndex out");
        }
        return true;
    }

    public void resize(int newLen){
        E[] newdata = (E[])new Object[newLen];
        System.arraycopy(data,0,newdata,0,data.length);
        data = newdata;
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if (i != size - 1) {

                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }


}
