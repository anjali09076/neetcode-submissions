class Solution {  

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // Empty subtree
        if(subRoot == null){
            return true;
        }

        // Main tree empty
        if(root == null){
            return false;
        }

        // Check same tree
        if(isSame(root, subRoot)){
            return true;
        }

        // Search left or right
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    public boolean isSame(TreeNode p, TreeNode q){

        // Both null
        if(p == null && q == null){
            return true;
        }

        // One null
        if(p == null || q == null){
            return false;
        }

        // Values different
        if(p.val != q.val){
            return false;
        }

        // Compare left and right
        return isSame(p.left, q.left) &&
               isSame(p.right, q.right);
    }
}