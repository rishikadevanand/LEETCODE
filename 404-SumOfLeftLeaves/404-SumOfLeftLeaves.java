// Last updated: 7/14/2026, 2:45:04 PM

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root,false);

    }
    
    public int helper(TreeNode root, boolean isleft){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return isleft ? root.val : 0;
        }
        
        

        int a = helper(root.left,true);
        int b = helper(root.right,false);

        return a+b;
    }
}