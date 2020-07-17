package suanfa._TrieTree;

import Leetcode._144_二叉树的前序遍历.TreeNode;

/**
 * @Author Li
 * @Date 20.5.7 10:22
 * @Version 1.0
 */


public class Trie {
    TrieNode root = new TrieNode('.');

    public void insert(char[] text){
        if (text==null||text.length==0){
            return;
        }
        TrieNode p = root;
        for (int i = 0; i < text.length; i++) {
            int index = text[i];
            if (p.children[index] == null) {
                TrieNode word =new TrieNode(text[i]);
                p.children[index] = word;
            }
            p = p.children[index];
        }
        p.isEndChar = true;
    }

    public boolean find(char[] text) {
        TrieNode p = root;
        for (int i = 0; i < text.length; i++) {
            int index = text[i];
            if (p.children[index] == null) {
                return false;
            }
            p = p.children[index];
        }
        if (p.isEndChar) {
            return true;
        }
      return false;
    }
}
class TrieNode{
    char data;
    TrieNode [] children = new TrieNode[256];
    boolean isEndChar = false;
    public TrieNode(char c) {
        data = c;
    }
}