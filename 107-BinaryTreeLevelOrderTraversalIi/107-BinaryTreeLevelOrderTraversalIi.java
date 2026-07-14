// Last updated: 7/14/2026, 2:47:07 PM
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        fun(root, 0, ans);
        Collections.reverse(ans);
        return ans; 
    }

    void fun(TreeNode root, int lvl, List<List<Integer>> ans) {
        if(root == null) return;

        if(lvl == ans.size()) {
            ans.add(new ArrayList<>());
        }
        
        ans.get(lvl).add(root.val);

        fun(root.left, lvl + 1, ans);
        fun(root.right, lvl + 1, ans);
    }
}