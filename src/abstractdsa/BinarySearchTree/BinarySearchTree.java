package abstractdsa.BinarySearchTree;

public class BinarySearchTree {
    TreeNode root;
    public int size = 0;
    public void insert(TreeNode node){
        root = insertHelper(root, node);
        size++;
    }
    private TreeNode insertHelper(TreeNode root, TreeNode node){
        int data = node.data;
        if (root== null){
            root = node;
            return root;
        }
        else if (data<root.data){
            root.left = insertHelper(root.left, node);
        }
        else{
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(TreeNode root){
        if (root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);

        }
    }
    public boolean search(int data){
        return searchHelper(root, data);
    }
    private boolean searchHelper(TreeNode root, int data){
        if (root == null){
            return false;
        }
        else if (root.data == data){
            return true;
        }
        else if (root.data > data){
            return searchHelper(root.left, data);
        }
        else{
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data){
        if (search(data)){
            removeHelper(root, data);
        }
        else{
            System.out.println(data + "cannot be found");
        }
    }
    private TreeNode removeHelper(TreeNode root, int data){
        if(root == null){
            return null;
        }
        else if (data < root.data){
            removeHelper(root.left, data);
        }
        else if (data > root.data){
            removeHelper(root.right, data);
        }
        else{ // node is found
            if (root.left == null && root.right == null){
                // means a leaf node
                root = null;
            }
            else if (root.right != null){ // find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else{ // find a predecessor to replace this mode
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(TreeNode root){
        // find the least n below the right child of this root node
        root = root.right;
        while (root.left != null){
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(TreeNode root){
        // find the greatest value n below the left child of this root node
        root = root.left;
        while (root.right != null){
            root = root.right;
        }
        return root.data;
    }
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new TreeNode(1));
        tree.insert(new TreeNode(2));
        tree.insert(new TreeNode(3));
        tree.insert(new TreeNode(4));

        System.out.println(tree.search(3));
        tree.remove(1);

        tree.display();

    }
}
