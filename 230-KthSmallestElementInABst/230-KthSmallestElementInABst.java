// Last updated: 7/14/2026, 2:45:48 PM
class Solution {
    int count = 0;
    TreeNode result = null;

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return result.val;
    }

    private void helper(TreeNode node, int k) {
        if (node == null) return;

        helper(node.left, k);       
        count++;                    
        if (count == k) {
            result = node;
            return;
        }
        helper(node.right, k);      
        }
}