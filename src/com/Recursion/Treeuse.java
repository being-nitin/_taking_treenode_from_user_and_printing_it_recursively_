package com.Recursion;
import java.util.ArrayList;

import java.util.Scanner;
public class Treeuse {

    public static TreeNode<Integer> takeInput(){
        int n;
        // n will the the value of corresponding root node of every Treenode;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);

        // now the number of child,every node will have:

        int childCount;
        System.out.println();
        childCount = sc.nextInt();
        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }
    // this function will print the root and corresponding nodes of tree.
    public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for(int i=0;i<root.children.size();i++){
            s = s+ root.children.get(i).data+",";
        }
    }
    public static void main(String args[]){
        TreeNode<Integer> root = takeInput();
        print(root);
    }
}
