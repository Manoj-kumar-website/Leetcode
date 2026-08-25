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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        String Fulltree=Tree(root);
        String subTree=Tree(subRoot);
        return (Fulltree.contains(subTree));
        
    }
    String Tree(TreeNode root){
        if(root == null){
            return "null";
        }
        StringBuilder sb=new StringBuilder("^");
        sb.append(root.val);
        sb.append(Tree(root.left));
        sb.append(Tree(root.right));

        return sb.toString();
    }
}