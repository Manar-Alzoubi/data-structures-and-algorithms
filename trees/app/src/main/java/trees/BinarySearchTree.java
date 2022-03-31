package trees;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{
    public Node<T> root;



    public void add(T value) {
        Node<T> node = new Node<>(value) ;
        if (isTreeEmpty())
            root = node;
         else add(value,root);
    }

    private void add(T value, Node<T> root) {
        if(value.compareTo(root.getValue())<0){
            if(root.getLeft() != null){
                add(value, root.getLeft());
            }else {
                Node<T> node = new Node<>(value);
                root.setLeft(node);
            }
        }else if(value.compareTo(root.getValue())>0){
            if(root.getRight()!= null){
                add(value,root.getRight());
            } else{
                Node<T> node = new Node<>(value);
                root.setRight(node);
            }
        }
    }

    public boolean contains(T value)
    {
        if(isTreeEmpty()){
            return false;}
        if(value.equals(root.getValue())){
            return true;}
        return contains(root,value);
    }

    public boolean contains(Node<T> node,T value) {
        if (node == null) {
            return false;
        }
        if (value.compareTo(node.getValue()) == 0)
            return true;
        else if (value.compareTo(node.getValue()) > 0)
            return contains(node.getRight(), value);
        else return contains(node.getLeft(), value);


    }



    public boolean isTreeEmpty() {
        return root == null;
    }
    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
