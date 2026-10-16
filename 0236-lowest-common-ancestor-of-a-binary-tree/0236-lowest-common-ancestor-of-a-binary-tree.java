/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static boolean getPath(TreeNode root,ArrayList<TreeNode>path,TreeNode n){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root==n){
            return true;
        }

        boolean foundLeft=getPath(root.left,path,n);
       boolean foundRight= getPath(root.right,path,n);

       if(foundLeft || foundRight){
        return true;
       }

       path.remove(path.size()-1);
       return false;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         ArrayList<TreeNode>path1=new ArrayList<>();
        ArrayList<TreeNode>path2=new ArrayList<>();

        getPath(root,path1,p);
        getPath(root,path2,q);
        
        int i=0;
        for(;i<path1.size() && i< path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        TreeNode lca=path1.get(i-1);

        return lca;


    }
}