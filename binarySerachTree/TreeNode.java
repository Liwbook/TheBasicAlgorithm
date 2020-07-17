package suanfa.binarySerachTree;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Stack;

/**
 * @Author Li
 * @Date 20.5.16 20:07
 * @Version 1.0
 */


public class TreeNode {

    private class Node{
        int val;
        Node left,right;
        public Node(int x){
            val = x;
        }
    }
    private  Node root;
    private  int size;

    public TreeNode (){
        root = null;
        size = 0;
    }

    public void add(int num){
        root = add(root,num);
    }
    private Node add(Node node,int num){
        if (node==null){
            size++;
            return  new Node(num);
        }
        if (num<node.val){
           node.left =  add(node.left,num);
        }else if (num>node.val) {
           node.right =  add(node.right, num);
        }
        return node;
    }
    public boolean contains(int num){

        return contains(root,num);
    }
    private boolean contains(Node node,int num){
        if (node == null) {
            return false;
        }
        if (num<node.val){
           return contains(node.left,num);
        }else if (num>node.val){
            return contains(node.right, num);
        }
        return true;
    }
    public Node searchMin() throws IllegalAccessException {
        if (size==0){
            throw new IllegalAccessException("No any elements");
        }
        return searchMin(root);
    }
    private Node searchMin(Node node){
        if (node.left==null){
            return node;
        }
       return searchMin (node.left);

    }
    public Node searchMax() throws IllegalAccessException {
        if (size==0){
            throw new IllegalAccessException("No any elements");
        }
        return searchMax(root);
    }
    private Node searchMax(Node node){
        if (node.right==null){
            return node;
        }
       return searchMax (node.right);

    }
    public Node removeMin()throws IllegalAccessException{
        Node min = searchMin();
        root =  removeMin(root);
        return min;
    }

    private Node removeMin(Node node) {
        if (node.left==null){
            Node nodeRight = node.right;
            node.right = null;
            size--;
            return nodeRight;
        }
        node.left = removeMin(node.left);
          return node;
    }
    public Node removeMax() throws IllegalAccessException {
        Node max = searchMax();
        root = removeMax(root);
        return max;
    }
    private Node removeMax(Node node){
        if (node.right == null) {
            Node nodeLeft = node.left;
            node.left =null;
            size--;
            return nodeLeft;
        }
        node.right = removeMax(node.right);
        return node;
    }


    public Node remove(int num){
        return remove(root,num);

    }
    private Node remove(Node node,int num){
        if (node==null){
            return null;
        }
        if (num<node.val){
            node.left = remove(node.left,num);
            return node;
        } else if (num > node.val) {
            node.right = remove(node.right,num);
            return node;
        }else{
            if (node.left==null){
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }else if (node.right==null){
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }else{
                Node min = searchMin(node);
                min.left = node.left;
                min.right = removeMin(node.right);
                node.left = node.right = null;
                return min;
            }
        }
    }


   public boolean isEmpty(){
        return size==0;
   }
   public int size(){
        return size;
   }
   @Override
    public String toString(){
       System.out.println();
        Node curr = root;
       Stack<Node> stack = new Stack<>();
       stack.push(curr);


       while (!stack.isEmpty()) {
           Node cur = stack.pop();
           System.out.println(cur.val+" ");

           if (cur.right != null) {
               stack.push(cur.right);
           }
           if (cur.left != null) {
               stack.push(cur.left);
           }

       }
       return "";

   }

}
