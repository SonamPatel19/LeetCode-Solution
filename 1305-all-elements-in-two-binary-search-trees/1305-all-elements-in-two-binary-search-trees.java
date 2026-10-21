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
    public static void inorder(ArrayList<Integer>arr,TreeNode root){
        if(root==null){
            return;
        }
        inorder(arr, root.left);
        arr.add(root.val);
        inorder(arr, root.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
         ArrayList<Integer>arr1=new ArrayList<>();
          inorder(arr1,root1);

          ArrayList<Integer>arr2=new ArrayList<>();
          inorder(arr2,root2);

          ArrayList<Integer>finalarr=new ArrayList<>();
          int i=0;
          int j=0;
          while(i<arr1.size() && j<arr2.size()){
              if(arr1.get(i)<arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
              }
              else{
                finalarr.add(arr2.get(j));
                j++;
              }
          }

          while(i<arr1.size()){
               finalarr.add(arr1.get(i));
                i++;
          }

          while(j<arr2.size()){
             finalarr.add(arr2.get(j));
                j++;
          }
          return finalarr;
    }
}