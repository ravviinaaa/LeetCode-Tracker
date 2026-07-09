// Last updated: 7/9/2026, 11:26:19 AM
class Solution {
    List<Integer> li=new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            li.add(root.val);
        }return li;
    }
}