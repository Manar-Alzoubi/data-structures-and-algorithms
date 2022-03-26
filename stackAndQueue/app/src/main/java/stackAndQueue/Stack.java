package stackAndQueue;
import java.util.EmptyStackException;

public class Stack <T>{
    private Node<T> top;
    private int size;


    public Stack() {
        this.top = null;
        size = 0;
    }

    public Node<T> getTop() {
        return top;
    }

    public void setTop(Node<T> top) {
        this.top = top;
    }

    // Returns Boolean if the stack is empty or not
    public boolean isEempty() {
        return top == null;
    }

    public Node push(T value) {
        Node<T> nodeToPush = new Node<>(value);
        //  check if stack is empty
        if (isEempty()) { // push node  as first node (to the top)
            top = nodeToPush;
            size++;
        } else {
            // make value node point to what top is pointing to
            nodeToPush.setNext(top);
            // make top point to new value node
            top = nodeToPush;
            size++;
        }
        return null;
    }

    // Removes the node from the top of the stack
    public <T> T pop() {
        T topTemp;

        if (isEempty()) {
            throw new EmptyStackException();//raise exception when called on empty stack
        }else {
            topTemp = (T) top.getValue(); // store the node on the top
            top = top.getNext();// remove the node at top
            size--;
            }
        return topTemp;// return the value of node removed
    }

    // return the value on top
    public T peek() {
        if (isEempty()) {
            throw new EmptyStackException();//raise exception when called on empty stack
        }
        return top.getValue(); // Returns Value of the node located at the top of the stack
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +"}"+
                "   {sizeOStack = "+size+
                '}';
    }
}


