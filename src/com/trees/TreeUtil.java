package com.trees;

import com.queue.QueueLinkedList;

/**
 * Created by GChidhambaranathan on 12/23/2017.
 */
public class TreeUtil {

    public static int maxElementInBinaryTree(BinaryTreeNode rootNode){
        int max= Integer.MIN_VALUE;

        if(rootNode != null){
            int rootVal = rootNode.getData();
            int left = maxElementInBinaryTree(rootNode.getLeftNode());
            int right = maxElementInBinaryTree(rootNode.getRightNode());

            if(left > right){
                max = left;
            }else {
                max = right;
            }

            if(max < rootVal){
                max = rootVal;
            }
        }
        return max;
    }

    public static boolean searchElementInBT(BinaryTreeNode rootNode, int data){
        if(rootNode == null) {
            return false;
        }else {
            if(rootNode.getData() == data)
                return true;

            boolean temp = searchElementInBT(rootNode.getLeftNode(),data);
            if(temp){
                return true;
            }else {
                return searchElementInBT(rootNode.getRightNode(),data);
            }
        }

    }

    public static void insertElementInBT(BinaryTreeNode rootNode, BinaryTreeNode newNode){
        if(rootNode == null){
            rootNode = newNode;
            return;
        }

        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enqueue(rootNode);
        while(!queueLinkedList.isEmpty()){
            BinaryTreeNode temp = (BinaryTreeNode)queueLinkedList.dequeue();
            if(temp.getLeftNode() != null){
                queueLinkedList.enqueue(temp.getLeftNode());
            }else {
                temp.setLeftNode(newNode);
                return;
            }

            if(temp.getRightNode() != null){
                queueLinkedList.enqueue(temp.getRightNode());
            }else {
                temp.setRightNode(newNode);
                return;
            }
        }
    }

    public static int sizeOfBT(BinaryTreeNode rootNode){
        if(rootNode == null){
            return 0;
        }else {
            System.out.println("Node: " + rootNode.getData());
            int size = sizeOfBT(rootNode.getLeftNode()) + 1 + sizeOfBT(rootNode.getRightNode());
            System.out.println("Size: "+ size);
            return size;
        }
    }
}
