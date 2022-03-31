package trees;

import java.util.ArrayList;

public class BinaryTree <T extends Comparable<T>>{

    public Node<T> root;
     ArrayList<T> arrOfPre =new ArrayList<>();
     ArrayList<T> arrOfIn =new ArrayList<>();
     ArrayList<T> arrOfPost =new ArrayList<>();

    public BinaryTree() {
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }



//    //////////////////  solution for code 16 ////////////

    public int maximumValue(){
        if(root == null)// if tree is empty , raise an exception
            throw new IllegalArgumentException();

        return maximumValue((Node) root, (Integer) root.getValue());// call fun recursevly
    }

    public int maximumValue(Node node, int max){
        if(node == null)
            return max;
//        if(root.getLeft() == null && root.getRight() == null )
//            return max = (int) root.getValue();
        if(node.getLeft() != null) // if there is a left node call fun for it
            max = maximumValue(node.getLeft(),max);

        if(node.getRight() != null) //if there is a right node call fun for it
            max = maximumValue(node.getRight(),max);

        if((int) node.getValue() >= max) // if value of node grater than max
            max = (int) node.getValue();// make max = value of node

        return max;
    }



    public ArrayList<T> preOrder(Node <T> root){
        if(root == null)
            return  arrOfIn;
        arrOfPre.add(root.value);
        if(root.getLeft() !=null){
            preOrder(root.getLeft());
        }
        if(root.getRight()!=null){
            preOrder(root.getRight());
        }

        return arrOfPre;
    }

    public ArrayList<T> inOrder(Node <T> root) {
        if(root == null)
            return  arrOfIn;
        if (root.left != null) {
            inOrder(root.left);
        }
        arrOfIn.add(root.value);
        if (root.right != null) {
            inOrder(root.right);
        }
//        arrOfIn.add(root.value);
        return arrOfIn;
    }

    public ArrayList<T> postOrder (Node < T > root) {
        if(root == null)
            return  arrOfIn;// will be empty
        if (root.left != null) {
            postOrder(root.left);
        }
        if (root.right != null) {
            postOrder(root.right);
        }
        arrOfPost.add(root.value);
        return arrOfPost;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
