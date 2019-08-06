/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 */

public class binaryTreeLevelOrderTraversal {
    /**
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        List res=new ArrayList();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            ArrayList<Integer> level=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode head=q.poll();
                level.add(head.val);
                if(head.left!=null){
                    q.offer(head.left);
                }
                if(head.right!=null){
                    q.offer(head.right);
                }
            }
             res.add(level);
        }
        return res;
    }
}
