package com.syscho.dsa.binarysearchtree;

import java.util.*;

public class BFS {
    // Function to perform breadth-first search (BFS) traversal
    private static List<List<Integer>> bfs(TreeNode root) {
        // If the root is null, return an empty list
        if (root == null)
            return Collections.emptyList();

        Queue<TreeNode> queue = new LinkedList<>(); // Queue to store nodes for BFS traversal

        List<List<Integer>> segments = new ArrayList<>(); // List to store segments (levels) of the tree
        queue.offer(root); // Add root node to the queue

        while (!queue.isEmpty()) {
            int level = queue.size(); // Number of nodes at the current level
            List<Integer> sublist = new ArrayList<>(); // List to store nodes at the current level
            for (int i = 0; i < level; i++) {
                TreeNode q = queue.poll(); // Remove the front node from the queue
                sublist.add(q.val); // Add the node value to the current level sublist

                // Enqueue the left and right child nodes if they exist
                if (q.left != null)
                    queue.offer(q.left);
                if (q.right != null)
                    queue.offer(q.right);
            }
            segments.add(sublist); // Add the sublist to the segments list
        }

        return segments; // Return the list of segments (levels) of the tree
    }

    public static void main(String[] args) {
        TreeNode treeNode = CreateTree.generateTree();
        List<List<Integer>> result = bfs(treeNode); // Perform BFS traversal

        System.out.println(result);
    }
}
