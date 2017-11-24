package com.array;

public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        Node rootNode = new Node(4);
        Node twoNode = new Node(2);
        Node oneNode = new Node(1);
        Node threeNode = new Node(3);
        Node sixNode = new Node(6);
        Node fiveNode = new Node(5);
        Node sevenNode = new Node(7);

        rootNode.left = twoNode;
        rootNode.right = sixNode;

        twoNode.left = oneNode;
        twoNode.right = threeNode;

        sixNode.left = fiveNode;
        sixNode.right = sevenNode;
        System.out.println(isBSTUtil(rootNode));
    }



    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    private static boolean isBSTUtil(Node rootNode){
        return isBSTUtil(rootNode,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    private static boolean isBSTUtil(Node node, int min, int max)
    {

        if (node == null)
            return true;


        if (node.data < min || node.data > max)
            return false;


        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }


}
