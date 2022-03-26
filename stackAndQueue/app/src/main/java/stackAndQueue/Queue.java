package stackAndQueue;

public class Queue<T> {

    private static final int QUEUE_SIZE = 10;

    private Node<T> back;
    private Node<T> front;

    private int size;

    public Queue() { // default constructor
        size = 0;
    }

    public Node<T> getBack() {
        return back;
    }

    public void setBack(Node<T> back) {
        this.back = back;
    }

    public Node<T> getFront() {
        return front;
    }

    public void setFront(Node<T> front) {
        this.front = front;
    }

    public boolean enqueue(T value) {
        Node<T> nodeToAddToQueue = new Node<>(value);
        if (isEmpty()) { // if queue empty add a new node of value on the top
            front = nodeToAddToQueue;
            back = nodeToAddToQueue;
            size++;
            return true;
        } else { //adds a new node with value to the back of the queue it is not empty
            if (size < QUEUE_SIZE) {
                nodeToAddToQueue.setNext(back);
                back = nodeToAddToQueue;
                size++;
                return true;
            }
        }

        return false;
    }

    // Removes the node from the front of the queue
    public T dequeue() throws Exception {
        Node<T> Temp;
        T frontTemp = front.getValue();
        Temp =back;
        if(!isEmpty()){// if not empty remove the element on top
            while (Temp !=null) {

                if (Temp == front) {
                    front = Temp;
                    size--;
                }
                Temp = Temp.getNext();
            }
        }else{ // if empty throw exception
            throw new Exception("The Queue is empty");
        }
        return frontTemp;// the value from node from the front of the queue
    }

    // Returns Value of the node located at the front of the queue
    public T peek() {
        if (isEmpty()) {
            return null; // throw exception if queue empty
        } else{
            return front.getValue();
        }
    }

    // check if queue empty return true else return false
    public boolean isEmpty() {
        return front == null && back==null;
    }

    @Override
    public String toString() {
//        return "Queue{" +
//                "back=  " + back +
//                ", front=  " + front +
//                ", size=  " + size +
//                '}';

        String str = "Queue{ back->";
        Node<T> curr;
        curr =back;
        while (curr !=null){
            str +="{"+ curr.getValue()+"}->";
            curr = curr.getNext();
        }
        str = str +"front" + "size = " +size ;
//        frontPointer=frontPointer.getNext();
        return str;
    }
}
