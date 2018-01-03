package com.trees;

/**
 * Created by GChidhambaranathan on 12/23/2017.
 */
public class Traversal {

    public void preOrderTraversal(BinaryTreeNode rootNode){
        if(rootNode != null){
            System.out.print(rootNode.getData());
            preOrderTraversal(rootNode.getLeftNode());
            preOrderTraversal(rootNode.getRightNode());
        }
    }
    public void inOrderTraversal(BinaryTreeNode rootNode){
        if(rootNode != null){
            inOrderTraversal(rootNode.getLeftNode());
            System.out.print(rootNode.getData());
            inOrderTraversal(rootNode.getRightNode());
        }
    }

    public void postOrderTraversal(BinaryTreeNode rootNode){
        if(rootNode != null){
            postOrderTraversal(rootNode.getLeftNode());
            postOrderTraversal(rootNode.getRightNode());
            System.out.print(rootNode.getData());
        }
    }

}
