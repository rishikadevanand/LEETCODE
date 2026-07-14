// Last updated: 7/14/2026, 2:46:49 PM
class Solution {

    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return result;
    }
    private void preorder(TreeNode node) {
        if(node == null)
            return;
        result.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }
}