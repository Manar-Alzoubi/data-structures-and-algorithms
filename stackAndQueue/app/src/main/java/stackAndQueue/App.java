
package stackAndQueue;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("\n ---------  Here is the PseudoQueue (queue using 2 stacks) ------- \n");

        PseudoQueue<String> myPseudoQueue = new PseudoQueue<>();
        myPseudoQueue.enqueuePseudoQueue("A");
        System.out.println("after enqueue : ===>  " + myPseudoQueue);
        myPseudoQueue.enqueuePseudoQueue("B");
        myPseudoQueue.enqueuePseudoQueue("C");
        System.out.println("after enqueue : ===>  " + myPseudoQueue);
        myPseudoQueue.enqueuePseudoQueue("D");
        System.out.println(" after enqueue : (D) ===>  " + myPseudoQueue);
        myPseudoQueue.enqueuePseudoQueue("W");
        System.out.println(" after enqueue : (W) ===>  " + myPseudoQueue);

        System.out.println("\n*****************     dequeue     **********************\n");
        PseudoQueue<String> myPseudoQueue1 = new PseudoQueue<>();
        System.out.println(" after dequeue (stack empty) :  ===>  " + myPseudoQueue1.dequeuePseudoQueue() );


        myPseudoQueue1.enqueuePseudoQueue("X");
        myPseudoQueue1.enqueuePseudoQueue("Y");
        myPseudoQueue1.enqueuePseudoQueue("Z");
        System.out.println(" after enqueue :  ===>  " + myPseudoQueue1 +"   top = " +myPseudoQueue1.peek());
        System.out.println("decueue node  ===>  "+ myPseudoQueue1.dequeuePseudoQueue());
        System.out.println( "decueue node  ===>  "+myPseudoQueue1.dequeuePseudoQueue());
        System.out.println( "decueue node  ===>  "+myPseudoQueue1.dequeuePseudoQueue());




//        System.out.println("\n -----------------  Here is the stack ----------------------- ");
//        Stack<String> myStack = new Stack();
//        if (myStack.isEempty()) {
//            System.out.println("The stack is empty");
//        }
//
//        System.out.println("push to the stack");
//        myStack.push("Manar"); // first node
//        myStack.push("Alaa");
//        myStack.push("Sadan"); // last node
//
//        System.out.println(myStack);
//        System.out.println("peek ==> " + myStack.peek());
//        System.out.println("pop ==> " + myStack.pop());
//        System.out.println(myStack);
//
//        System.out.println("\n");
//
//        System.out.println(" -----------------  Here is the Queue ----------------------- ");
//
//        Queue<String> myQueue = new Queue();
//        if (myQueue.isEmpty()) {
//            System.out.println("the queue is empty");
//        } else {
//            System.out.println(myQueue);
//        }
//
//        myQueue.enqueue("Mohammad"); // first in
//        myQueue.enqueue("Ahmad");
//        myQueue.enqueue("Omar");
//        myQueue.enqueue("Ali"); // last in
//        System.out.println("add to queue (enqueue) ==>  "+myQueue);
//        System.out.println("the peek of queue (peek) ==> "+ myQueue.peek());
//        System.out.println("remove element : (dequeue ) ==>  "+ myQueue.dequeue());
//        System.out.println(myQueue);


    }
}

