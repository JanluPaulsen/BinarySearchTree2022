public class BinarySearchTree2022 {
    public static void main(String[] args) {
        MyTree aTree = new MyTree();

        aTree.insert(10);
        aTree.insert(11);
        aTree.insert(2);
        aTree.insert(15);
        aTree.insert(5);

        aTree.preorder(); //NLR  L - GO LEFT
        aTree.inorder(); //LNR   R - GO RIGHT
        aTree.postorder(); //LRN N - Visit(print)
    }
}
