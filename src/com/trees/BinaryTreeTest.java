package com.trees;

/**
 * Created by GChidhambaranathan on 12/23/2017.
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTreeNode rootNode = new BinaryTreeNode();
        rootNode.setData(1);

        BinaryTreeNode twoNode = new BinaryTreeNode();
        twoNode.setData(2);

        BinaryTreeNode threeNode = new BinaryTreeNode();
        threeNode.setData(3);

        BinaryTreeNode fourNode = new BinaryTreeNode();
        fourNode.setData(4);

        BinaryTreeNode fiveNode = new BinaryTreeNode();
        fiveNode.setData(5);

        BinaryTreeNode sixNode = new BinaryTreeNode();
        sixNode.setData(6);

        BinaryTreeNode sevenNode = new BinaryTreeNode();
        sevenNode.setData(7);

        rootNode.setLeftNode(twoNode);
        rootNode.setRightNode(threeNode);

        twoNode.setLeftNode(fourNode);
        twoNode.setRightNode(fiveNode);

        threeNode.setLeftNode(sixNode);
        threeNode.setRightNode(sevenNode);

       /* Traversal traversal = new Traversal();
        traversal.preOrderTraversal(rootNode);
        System.out.println();
        traversal.inOrderTraversal(rootNode);
        System.out.println();
        traversal.postOrderTraversal(rootNode);*/

       /*int max = TreeUtil.maxElementInBinaryTree(rootNode);
        System.out.println(max);*/

        //System.out.println(TreeUtil.searchElementInBT(rootNode, 5));
        System.out.println(TreeUtil.sizeOfBT(rootNode));

    }
}
