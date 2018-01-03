package com.trees;

/**
 * Created by GChidhambaranathan on 12/23/2017.
 */
class BinaryTreeNode {

    private int data;
    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
