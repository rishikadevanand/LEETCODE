// Last updated: 7/14/2026, 2:45:50 PM

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        if(root.left == null && root.right == null) return root;
        if(root.left != null)
        invert(root.left);
        if(root.right != null)
        invert(root.right);
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
    private void invert(TreeNode left){
        if(left.left == null && left.right == null){
            return;
        }
        TreeNode temp;
        if(left.left != null)
        invert(left.left);
        if(left.right != null)
        invert(left.right);

        temp = left.left;
        left.left = left.right;
        left.right = temp;
        return;
    }
}