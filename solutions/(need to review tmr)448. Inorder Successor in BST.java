//Given a binary search tree (See Definition) and a node in it, find the in-order successor of that node in the BST.
//Recursive O(h) solution.
//If the given node has no in-order successor in the tree, return null.

public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    if (root == null) return null;
    
    if (root.val <= p.val) {
        return inorderSuccessor(root.right, p);
    }
    
    TreeNode left = inorderSuccessor(root.left, p);
    return left == null ? root : left;
}
