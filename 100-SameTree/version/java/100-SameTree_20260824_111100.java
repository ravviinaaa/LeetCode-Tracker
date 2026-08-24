// Last updated: 8/24/2026, 11:11:00 AM
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        
4        if (p == null && q == null) {
5            return true;
6        }
7        
8        if (p == null || q == null || p.val != q.val) {
9            return false;
10        }
11        
12        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
13    }
14}