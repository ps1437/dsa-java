package com.syscho.dsa.binarysearchtree;

public class DFS_IN_PRE_POST_ORDER {
    public static void main(String[] args) {
        TreeNode treeNode = CreateTree.generateTree();
        System.out.println("IN ORDER");
        inOrder(treeNode);
        System.out.println();
        System.out.println("PRE ORDER");
        preOder(treeNode);
        System.out.println();
        System.out.println("POST ORDER");
        postOrder(treeNode);
    }

    private static void postOrder(TreeNode treeNode) {

        if (treeNode == null) return;

        postOrder(treeNode.left);
        postOrder(treeNode.right);
        System.out.print(treeNode.val +"->");

    }

    private static void preOder(TreeNode treeNode) {
        if (treeNode == null) return;

        System.out.print(treeNode.val +"->");
        preOder(treeNode.left);
        preOder(treeNode.right);

    }

    private static void inOrder(TreeNode treeNode) {

        if (treeNode == null) return;

        inOrder(treeNode.left);
        System.out.print(treeNode.val +"->");
        inOrder(treeNode.right);

    }
}
