package com.trees;

/**
 * Created by GChidhambaranathan on 12/24/2017.
 */
public class BinarySearchTreeNode {
    private int data;
    private BinarySearchTreeNode leftNode;
    private BinarySearchTreeNode rightNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinarySearchTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinarySearchTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinarySearchTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
