public class MyTreeNode {
    private int data;
    private MyTreeNode left;
    private MyTreeNode right;

    public MyTreeNode(){
        data = 0;
        left = null;
        right = null;
    }

    public int getData(){
        return data;
    }

    public MyTreeNode getLeft(){
        return left;
    }

    public MyTreeNode getRight(){
        return right;
    }

    public void setData(int value){
        data = value;
    }

    public void setLeft(MyTreeNode t){
        left = t;
    }
    public void setRight(MyTreeNode t){
        right = t;
    }
}
