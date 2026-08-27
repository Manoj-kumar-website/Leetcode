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
     int res=0;
     int i=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root != null){
          int left=  kthSmallest(root.left,k);
            i++;
            if(k == i){
                res=root.val;
                return res;
            }
             int right= kthSmallest(root.right,k);
        }
        return res;
    }
}