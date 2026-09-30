// LeetCode Problem No. 145 Binary Tree Postorder Traversal
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Q145Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter binary tree nodes in level order (e.g., 1 null 2 3 or [1, null, 2, 3]):");
        String input = scanner.nextLine();

        // Build tree from input
        TreeNode root = buildTree(input);

        // Perform inorder traversal
        List<Integer> result = inorderTraversal(root);

        // Output result
        System.out.println("Inorder Traversal: " + result);
    }

    public static TreeNode buildTree(String input) {
        if (input == null || input.trim().isEmpty() || input.trim().equals("[]")) {
            return null;
        }

        // Clean input brackets if provided like [1, null, 2, 3]
        input = input.replace("[", "").replace("]", "").trim();
        if (input.isEmpty()) return null;

        String[] parts = input.split("[,\\s]+");
        if (parts[0].equalsIgnoreCase("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(parts[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < parts.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < parts.length && !parts[i].equalsIgnoreCase("null")) {
                current.left = new TreeNode(Integer.parseInt(parts[i]));
                queue.add(current.left);
            }
            i++;

            // Right child
            if (i < parts.length && !parts[i].equalsIgnoreCase("null")) {
                current.right = new TreeNode(Integer.parseInt(parts[i]));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ansList = new ArrayList<>();
        postOrder(root , ansList);

        return ansList;
    }

    public static void postOrder(TreeNode node , List<Integer> ansList){
        if(node == null){
            return;
        }

        // Left
        postOrder(node.left , ansList);

        // Right
        postOrder(node.right , ansList);

        // Node
        ansList.add(node.val);
    }
}
