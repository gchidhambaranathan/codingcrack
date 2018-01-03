package com.trees;

/**
 * Created by GChidhambaranathan on 12/24/2017.
 */
public class BSTUtil {

    public static BinarySearchTreeNode findElementInBST(BinarySearchTreeNode rootNode, int data){
        if(rootNode == null)
            return null;
        if(rootNode.getData() > data){
            return findElementInBST(rootNode.getLeftNode(),data);
        }else if(rootNode.getData() < data){
            return findElementInBST(rootNode.getRightNode(),data);
        }
        return rootNode;
    }

    public static BinarySearchTreeNode findMinInBST(BinarySearchTreeNode rootNode){
        if(rootNode == null)
            return null;

        if(rootNode.getLeftNode() == null)
            return rootNode;
        else
            return findMinInBST(rootNode.getLeftNode());

    }

    public static BinarySearchTreeNode insertNode(BinarySearchTreeNode rootNode, int data){
        BinarySearchTreeNode insertNode = new BinarySearchTreeNode();
        insertNode.setData(data);
        if(rootNode == null){
            rootNode = insertNode;
        }else if(rootNode.getData() < data){
            rootNode.setLeftNode(insertNode(rootNode.getLeftNode(), data));
        }else if(rootNode.getData() > data){
            rootNode.setRightNode(insertNode(rootNode.getRightNode(), data));
        }
        return rootNode;
    }

    public static boolean isBST(BinarySearchTreeNode rootNode){
        return isBST1(rootNode,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isBST1(BinarySearchTreeNode rootNode, int min, int max){
        if(rootNode == null)
            return true;

        return (rootNode.getData() > min && rootNode.getData() < max && isBST1(rootNode.getLeftNode(),min,rootNode.getData())
                && isBST1(rootNode.getRightNode(),rootNode.getData(), max));
    }

    public static int heightOfBST(BinarySearchTreeNode rootNode){
        if(rootNode == null) {
            return 0;
        }else {
            int lHieght = heightOfBST(rootNode.getLeftNode());
            int rHeight = heightOfBST(rootNode.getRightNode());
            if(lHieght > rHeight){
                return lHieght + 1;
            }else {
                return rHeight +1;
            }
        }


    }
}
