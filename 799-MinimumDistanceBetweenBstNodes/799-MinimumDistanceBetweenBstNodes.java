// Last updated: 7/14/2026, 2:43:58 PM
class Solution {
    int ans = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return ans;
    }
    public void inOrder(TreeNode root)
    {
        if(root ==  null)return;
        inOrder(root.left);
        if(pre != null){
            ans = Math.min(ans, root.val - pre.val);
        }
            pre= root;
            inOrder(root.right);
    }
}