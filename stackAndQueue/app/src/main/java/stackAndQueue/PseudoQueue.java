package stackAndQueue;

import java.util.EmptyStackException;

public class PseudoQueue<T> {

    public Stack<T> firstStack = new Stack<T>();
    public Stack<T> secondStackTemp = new Stack <T>();

    public Node<T> backPointer;
    public Node<T> frontPointer;
    int size =0;


    public void enqueuePseudoQueue(T valueToPushQueue){
        Node<T> pointerAtCurrentNode = null;
        firstStack.push(valueToPushQueue);
        backPointer= firstStack.getTop();
        pointerAtCurrentNode = backPointer;
        while (pointerAtCurrentNode.getNext() != null)
            pointerAtCurrentNode = pointerAtCurrentNode.getNext();
        frontPointer= pointerAtCurrentNode;
        size++;

    }


    public T dequeuePseudoQueue() throws Exception {
        T NodeToDequeue = null;
        if(firstStack.isEempty()){
            System.out.println("the stack is empty can't dequeue");
            return null;}
        else if (firstStack.getTop().getNext() == null)
            return firstStack.pop();
        else {
        Node<T> pointerAtCurrentNode = secondStackTemp.getTop();
        if (secondStackTemp.isEempty()) {
            while (!firstStack.isEempty()) {
                secondStackTemp.push(firstStack.pop());
//                pointerAtCurrentNode=pointerAtCurrentNode.getNext();
            }
            NodeToDequeue = secondStackTemp.pop();
            while (!secondStackTemp.isEempty()) {
                firstStack.push(secondStackTemp.pop());
            }
        }
        }
        return NodeToDequeue;
    }

    public T peek() {
        if (firstStack.isEempty()) {
            return null; // throw exception if queue empty
        } else{
            return frontPointer.getValue();
        }
    }


    @Override
    public String toString() {
        String allQueueToPrint = "PseudoQueue{ back->";
        Node<T> pointerAtCurrent;
        pointerAtCurrent =backPointer;
        while (pointerAtCurrent !=null){
            allQueueToPrint+="{"+ pointerAtCurrent.getValue()+"}->";
            pointerAtCurrent = pointerAtCurrent.getNext();
        }
        allQueueToPrint=allQueueToPrint+"front";
//        frontPointer=frontPointer.getNext();
        return allQueueToPrint;
    }

}
