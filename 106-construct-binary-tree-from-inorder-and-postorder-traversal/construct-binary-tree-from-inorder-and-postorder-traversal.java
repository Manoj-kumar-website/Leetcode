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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length != postorder.length){
            return null;
        }
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mp);
    }
    TreeNode buildTree(int[] inorder,int is,int ie,int[] postorder,int ps,int pe,Map<Integer,Integer> mp){
        if(is > ie || ps>pe){
            return null;
        }
        TreeNode root=new TreeNode(postorder[pe]);
        int indexroot=mp.get(root.val);
        int numsleft=indexroot-is;
        root.left=buildTree(inorder,is,indexroot-1,postorder,ps,ps+numsleft-1,mp);
        root.right=buildTree(inorder,indexroot+1,ie,postorder,ps+numsleft,pe-1,mp);
        return root;

    }
}