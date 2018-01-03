package com.trees;

/**
 * Created by GChidhambaranathan on 12/24/2017.
 */
public class BSTTest {
    public static void main(String[] args) {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode();
        rootNode.setData(7);

        BinarySearchTreeNode fourNode = new BinarySearchTreeNode();
        fourNode.setData(4);

        BinarySearchTreeNode nineNode = new BinarySearchTreeNode();
        nineNode.setData(9);

        BinarySearchTreeNode twoNode = new BinarySearchTreeNode();
        twoNode.setData(2);

        BinarySearchTreeNode fiveNode = new BinarySearchTreeNode();
        fiveNode.setData(5);

        rootNode.setLeftNode(fourNode);
        rootNode.setRightNode(nineNode);

        fourNode.setLeftNode(twoNode);
        fourNode.setRightNode(fiveNode);


      /*  BinarySearchTreeNode foundElement = BSTUtil.findElementInBST(rootNode, 10);
        if(foundElement != null){
            System.out.println(foundElement.getData());
        }else {
            System.out.println("Element not found");
        }*/

     /* BinarySearchTreeNode minNode = BSTUtil.findMinInBST(rootNode);

      if(minNode != null){
          System.out.println("Minimum node in BST is " + minNode.getData());
      }else{
          System.out.println("Element is not found ");
      }*/

       // System.out.println(BSTUtil.isBST(rootNode));
        System.out.println(BSTUtil.heightOfBST(rootNode));
    }
}
