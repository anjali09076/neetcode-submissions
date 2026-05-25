class Solution {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        
        height(root);

        return diameter;
    }

    public int height(TreeNode root) {

        // Base case
        if(root == null) {
            return 0;
        }

        // Find left height
        int leftHeight = height(root.left);

        // Find right height
        int rightHeight = height(root.right);

        // Update diameter
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return height
        return Math.max(leftHeight, rightHeight) + 1;
    }
}