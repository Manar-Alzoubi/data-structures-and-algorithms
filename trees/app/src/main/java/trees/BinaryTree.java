package trees;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue; // Import Queue package


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

    ////////////////// code for challenge 18 /////////////////

    public ArrayList fizzBuzzTree (BinaryTree  tree) { // recieve the tree
        if(tree.getRoot() == null ) // if tree is empty
            throw new IllegalStateException(" Empty tree ");
        return fizzBuzzTree(tree.getRoot()); // if not empty
    }
    public ArrayList<T> fizzBuzzTree (Node<T>  root)
    {
        int rootValue = ((Integer)root.getValue());// we can't compare node value to int value so convert the node into int
        if(rootValue % 3 == 0 &&rootValue% 5 ==0 ) {//if divisable by 3 &5 at same time
            root.setValue((T) "FizzBuzz");
            arrOfIn.add(root.getValue());
        }
        else if (rootValue % 3 == 0) { //if divisable by 3
            root.setValue((T) "Fizz");
            arrOfIn.add(root.getValue());
        }
        else if(rootValue % 5 == 0) { //if divisable by 5
            root.setValue((T) "Buzz");
            arrOfIn.add(root.getValue());
        }
        else { // otherwise, (if not divisable by 3 or 5 )
            root.setValue((T) String.valueOf(rootValue));
            arrOfIn.add(root.getValue());
        }
        if(root.getLeft() != null) // if root has left node
            fizzBuzzTree(root.getLeft());
        if(root.getRight() != null) // if root has right node
            fizzBuzzTree(root.getRight());
        return arrOfIn;
    }


    // code for code challenge 17

public ArrayList<T> breadthFirst(Node <T> root) {
        // using java's built-in queue
    //https://www.section.io/engineering-education/introduction-to-built-in-data-structures-in-java/

    //Since Queue is an interface, objects cannot be created of the type queue. We always need a class
    // which extends this list in order to create an object. This type-safe queue can be defined as:
    // Obj is the type of the object to be stored in Queue
    //Queue<Obj> queue = new PriorityQueue<Obj> ();
    //    Queue<T> queue = new LinkedList<>();; // Create new object

    Queue<T> queue = new PriorityQueue<>();// Create new object
    if(root == null)
        throw  new IllegalStateException("tree is empty");
    queue.add((T) root);
    arrOfPost.add(root.value);
    Node node;
    while(!queue.isEmpty()){
        node = (Node) queue.poll();
        if(node.getLeft() != null) {
            queue.add((T) node.getLeft());
            arrOfPost.add((T) node.getLeft().getValue());
        }
        if(node.getRight() != null) {
            queue.add((T) node.getRight());
            arrOfPost.add((T) node.getRight().getValue());
        }
//        else System.out.println("empty tree"));
    }
//    System.out.println(queue);
    return arrOfPost;
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
