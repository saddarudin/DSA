package com.Tree;

public class AVLTree {
    private int key,height;
    private AVLTree left,right;
    private AVLTree(){
        left=right=this;
        height=-1;
    }
    private AVLTree(int key,AVLTree left,AVLTree right){
        this.key=key;
        this.left=left;
        this.right=right;
        height=1+ Math.max(left.height,right.height);
    }

    private static final AVLTree NIL=new AVLTree();
    public AVLTree(int key){
        this.key=key;
        left=right=NIL;
    }
    public int size(){
        if(this==NIL)return 0;
        return 1+ left.size()+ right.size();
    }
    private void rotateLeft(){
        left=new AVLTree(key,left,right.left);
        key= right.key;
        right=right.right;
    }
    private void rotateRight(){
        right=new AVLTree(key,left.right,right);
        key= left.key;
        left=left.left;
    }
    public void rebalanced(){
        if(right.height> left.height+1){
            if(right.left.height> right.right.height)right.rotateRight();
            rotateLeft();
        }
        else if(left.height> right.height+1){
            if(left.right.height> left.left.height)left.rotateLeft();
            right.rotateRight();
        }
    }
    public AVLTree grow(int key){
        if(this==NIL)return new AVLTree(key);
        if(key==this.key)return this;
        if(key<this.key)left=left.grow(key);
        else right=right.grow(key);
        rebalanced();
        height=1+Math.max(left.height, right.height);
        return this;
    }
    public boolean add(int key){
        int oldSize=size();
        grow(key);
        return size()>oldSize;

    }
    @Override
    public String toString(){
        if(this==NIL)return "";
        return left+" "+key+" "+right;
    }

    public int leftMostNode(){
        if(left!=NIL)left=left.left;
        return left.key;
    }
    public int rightMostNode(){
        if(right!=NIL)right=right.right;
        return right.key;
    }
    public static void main(String[] args) {
        AVLTree tree=new AVLTree(1000);
        tree.add(500);
        tree.add(2000);
        tree.add(450);
        tree.add(420);
        tree.add(225);
        tree.add(1050);
        tree.add(1015);
        tree.add(2020);
        tree.add(1998);
        tree.add(2);
        tree.add(105);
        System.out.println(tree.leftMostNode());

    }
}

