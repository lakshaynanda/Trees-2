// TC: O(n)
// SC: O(h) h: height of tree
// Works on Leetcode
// No problem faced

class Solution {
    int sum;
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        int num = 0;
        helper(root, num);
        return sum;
    }
    public void helper(TreeNode root, int num) {
        if (root == null) {
            return;
        }
        
        if (root.left == null && root.right == null) {
            sum = sum + num * 10 + root.val;
            return;
        }
        
        helper(root.left, num * 10 + root.val);
        helper(root.right, num * 10 + root.val);
        
    }
}
