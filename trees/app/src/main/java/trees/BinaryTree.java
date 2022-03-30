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

    public ArrayList<T> preOrder(Node <T> root){
        if(root == null)
            return  arrOfIn;// will be empty
        arrOfPre.add(root.value);
        if(root.getLeft() !=null){
            preOrder(root.getLeft());
        }
        if(root.getRight()!=null){
            preOrder(root.getRight());
        }
//        arrOfPre.add(root.value);
        return arrOfPre;
    }

    public ArrayList<T> inOrder(Node <T> root) {
        if(root == null)
            return  arrOfIn;// will be empty
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
