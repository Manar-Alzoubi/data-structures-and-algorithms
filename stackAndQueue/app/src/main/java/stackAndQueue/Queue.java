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
    public Node dequeue() {
        Node frontTemp = back;
        Node temp;
        if (front == null) {// if queue is empty
            return null;}
        if (front == back) {// if queue has one node

            temp = front;

            front = back = null;
            size--;
            return temp;
        }
        while (frontTemp != null) {
            if (frontTemp.getNext() == front) {
                temp = front;
                frontTemp.setNext(null);
                front = frontTemp;
                size--;
                return temp;
            }
            frontTemp = frontTemp.getNext();
        }
        return frontTemp;
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
        return "Queue{" +
                "back=  " + back +
                ", front=  " + front +
                ", size=  " + size +
                '}';


    }
//    @Override
//    public String toString() {
//        String allQueueToPrint = " Queue { back";
//        Node<T> pointerAtCurrent;
//        pointerAtCurrent =back;
//        while (pointerAtCurrent !=null){
//            allQueueToPrint +="{"+ pointerAtCurrent.getValue()+"}->";
//            pointerAtCurrent = pointerAtCurrent.getNext();
//        }
//        allQueueToPrint=allQueueToPrint+"front";
//
//        return allQueueToPrint + "  {size = "+size +"}";
//    }

