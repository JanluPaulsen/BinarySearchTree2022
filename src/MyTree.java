public class MyTree {
    private MyTreeNode tree;

    public MyTree(){
        tree = null;
    }

    public boolean isEmpty(){
        return tree == null;
    }

    private MyTreeNode insert(MyTreeNode tree, int value){
        if (tree == null){
            tree = new MyTreeNode();
            tree.setData(value);
            tree.setLeft(null);
            tree.setRight(null);
        } else if (value > tree.getData()) {
            tree.setRight(insert(tree.getRight(), value));
        } else if (value < tree.getData()) {
            tree.setLeft(insert(tree.getLeft(), value));
        }
        return tree;
    }

    public void insert(int value){
        tree = insert(tree, value);
    }

    public int delete(int target){
        return 0;
    }

    public MyTreeNode search(int target){
        return null;
    }

    private void preorder(MyTreeNode root){
        if (root != null){
            System.out.println(root.getData()); //N visit(print)
            preorder(root.getLeft()); //L
            preorder(root.getRight());//R
        }
    }
    public void preorder(){
        preorder(tree);
    }

    private void inorder(MyTreeNode root){
        if (root != null){
            preorder(root.getLeft()); //L
            System.out.println(root.getData()); //N visit(print)
            preorder(root.getRight());//R
        }
    }
    public void inorder(){
        preorder(tree);
    }

    private void postorder(MyTreeNode root){
        if (root != null){
            preorder(root.getLeft()); //L
            preorder(root.getRight());//R
            System.out.println(root.getData()); //N visit(print)
        }
    }
    public void postorder(){
        preorder(tree);
    }
}
