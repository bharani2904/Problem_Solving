/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        
        Stack<TreeNode>stack=new Stack<>();
        TreeNode curr=root;
        int target=0;
        while(curr!=null || stack!=null){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            target++;
if(target==k){
    return curr.val;
}
curr=curr.right;
        }
        return 0;
    }
}