class Solution {

    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }

    public int dfs(TreeNode root) {

        // Base case
        if(root == null) {
            return 0;
        }

        // Left subtree height
        int left = dfs(root.left);

        // If already unbalanced
        if(left == -1) {
            return -1;
        }

        // Right subtree height
        int right = dfs(root.right);

        // If already unbalanced
        if(right == -1) {
            return -1;
        }

        // Check balance condition
        if(Math.abs(left - right) > 1) {
            return -1;
        }

        // Return height
        return Math.max(left, right) + 1;
    }
}