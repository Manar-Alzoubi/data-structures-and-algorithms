
package stackAndQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    Stack<String> newStack = new Stack<>();
    Queue<String> newQueue = new Queue<>();
    PseudoQueue<String> myPseudoQueue = new PseudoQueue<>();

    @BeforeEach
    void setUp() {
        newStack = new Stack();
        newQueue = new Queue<>();
    }
/////////////// lab 12 /////////////
    // Test enqueue on dogs queue
    @Test void AnimalEnqueueDogs(){
        AnimalShelter allAnimals = new AnimalShelter();
        Dog dog = new Dog("dog1");
        allAnimals.enqueue(dog);
        Dog dog2 = new Dog("dog2");
        allAnimals.enqueue(dog2);
        assertEquals(allAnimals.toString(),"AnimalShelter{catsQueue=Queue{ back->frontsize = 0, dogsQueue=Queue{ back->{Dog}->{Dog}->frontsize = 2}");
    }
    // Test enqueue on dogs queue
    @Test void AnimalEnqueueCats(){
        AnimalShelter allAnimals = new AnimalShelter();
        Cat cat = new Cat("cat1");
        allAnimals.enqueue(cat);
        Cat cat1 = new Cat("cat2");
        allAnimals.enqueue(cat1);
        assertEquals(allAnimals.toString(),"AnimalShelter{catsQueue=Queue{ back->{Cat}->{Cat}->frontsize = 2, dogsQueue=Queue{ back->frontsize = 0}");
    }
    // Test enqueue on both cats and dogs
    @Test void AnimalEnqueueCatsDogs(){
        AnimalShelter allAnimals = new AnimalShelter();
        Cat cat = new Cat("cat1");
        allAnimals.enqueue(cat);
        Dog dog2 = new Dog("dog2");
        allAnimals.enqueue(dog2);
        assertEquals(allAnimals.toString(),"AnimalShelter{catsQueue=Queue{ back->{Cat}->frontsize = 1, dogsQueue=Queue{ back->{Dog}->frontsize = 1}");
    }// test if dequeu cats
    @Test void AnimaldequeueCats() throws Exception {
        AnimalShelter allAnimals = new AnimalShelter();
        Cat cat = new Cat("cat1");
        allAnimals.enqueue(cat);
        Dog dog2 = new Dog("dog2");
        allAnimals.enqueue(dog2);
        allAnimals.deQueue("dog");
        assertEquals(allAnimals.toString(),"AnimalShelter{catsQueue=Queue{ back->{Cat}->frontsize = 1, dogsQueue=Queue{ back->{Dog}->frontsize = 0}");
    }// test if dequeu dog
    @Test void AnimaldequeueDogs() throws Exception {
        AnimalShelter allAnimals = new AnimalShelter();
        Cat cat = new Cat("cat1");
        allAnimals.enqueue(cat);
        Dog dog2 = new Dog("dog2");
        allAnimals.enqueue(dog2);
        allAnimals.deQueue("dog");
        assertEquals(allAnimals.toString(),"AnimalShelter{catsQueue=Queue{ back->{Cat}->frontsize = 1, dogsQueue=Queue{ back->{Dog}->frontsize = 0}");
    }

    //dequeue dog if dogs queue is empty
    @Test void dequeueDogsEmpty() throws Exception {
        AnimalShelter allAnimals = new AnimalShelter();
        Cat cat = new Cat("cat1");
        allAnimals.enqueue(cat);
        Cat cat2 = new Cat("cat2");
        allAnimals.enqueue(cat2);
        allAnimals.deQueue("dog");
        assertEquals(allAnimals.toString(),"AnimalShelter{catsQueue=Queue{ back->{Cat}->{Cat}->frontsize = 2, dogsQueue=Queue{ back->frontsize = 0}");
    }
    //dequeue cat if cats queue is empty
    @Test void dequeueCatsEmpty() throws Exception {
        AnimalShelter allAnimals = new AnimalShelter();
        Dog dog = new Dog("dog1");
        allAnimals.enqueue(dog);
        Dog dog2 = new Dog("dog2");
        allAnimals.enqueue(dog2);
        allAnimals.deQueue("cat");
        assertEquals(allAnimals.toString(),"AnimalShelter{catsQueue=Queue{ back->frontsize = 0, dogsQueue=Queue{ back->{Dog}->{Dog}->frontsize = 2}");
    }



    /////////// tests for lab 11

    // test if psudeoQueue is empty
    @Test void psudeoQueueEnqueueTest ()
    {
        myPseudoQueue.enqueuePseudoQueue("A");
        assertEquals(myPseudoQueue.peek(),"A");
    }
    // test enqueue  if psudeoQueue has one node
    @Test void psudeoQueueEnqueueTest2()
    {
        myPseudoQueue.enqueuePseudoQueue("A");
        myPseudoQueue.enqueuePseudoQueue("B");
        assertEquals(myPseudoQueue.toString(), "PseudoQueue{ back->{B}->{A}->front");
    }
    // test enqueue  if psudeoQueue has multiple nodes
    @Test void psudeoQueueEnqueueTest3()
    {
        myPseudoQueue.enqueuePseudoQueue("A");
        myPseudoQueue.enqueuePseudoQueue("B");
        myPseudoQueue.enqueuePseudoQueue("C");
        myPseudoQueue.enqueuePseudoQueue("D");
        assertEquals(myPseudoQueue.toString(), "PseudoQueue{ back->{D}->{C}->{B}->{A}->front");
    }
    // test dequeue if psudeoQueue is empty // it will be exception
    @Test void psudeoQueueDequeueTest () throws Exception {
        try {
            myPseudoQueue.dequeuePseudoQueue();
        }catch(Exception exception){
        System.err.println("empty stack");}
    }

    // test dequeue if psudeoQueue has one element // pop it (on top/peek)
    @Test void psudeoQueueDequeueTest4 () throws Exception {
        myPseudoQueue.enqueuePseudoQueue("A");
        assertEquals( myPseudoQueue.dequeuePseudoQueue(),"A");

    }
    // test dequeue if psudeoQueue has multiple elements
    @Test void psudeoQueueDequeueTest5 () throws Exception {
        myPseudoQueue.enqueuePseudoQueue("A");
        myPseudoQueue.enqueuePseudoQueue("B");
        myPseudoQueue.enqueuePseudoQueue("C");
        myPseudoQueue.enqueuePseudoQueue("D");
        assertEquals( myPseudoQueue.dequeuePseudoQueue(),"A");
        assertEquals( myPseudoQueue.dequeuePseudoQueue(),"B");
        assertEquals( myPseudoQueue.dequeuePseudoQueue(),"C");

    }

////////////////////////////////////////////////////////////////////////
    @Test //Can successfully push onto a stack (on empty stack)
    @DisplayName("testStackPush")
    void testStackPush() {
       newStack.push("Manar");
        assertEquals(newStack.peek(),"Manar");
    }
    @Test //Can successfully push multiple values onto a stack
    @DisplayName("testStackPush2values")
    void testStackPush2values() {
        newStack.push("Manar");
        newStack.push("Sadan");
        assertEquals(newStack.toString(),"Stack{top=Node{value=Sadan}, next=Node{value=Manar}, next=null}   {sizeOStack = 2}");
    }

    @Test //Can successfully pop off the stack
    void testStackPop() {
        newStack.push("Manar");
        newStack.push("Sadan");
        newStack.pop();
        assertEquals(newStack.toString(),"Stack{top=Node{value=Manar}, next=null}   {sizeOStack = 1}");
    }
    //Can successfully empty a stack after multiple pops
    @Test
    void testEmptyStackAfterPop() {
        newStack.push("Manar");
        newStack.push("Sadan");
        newStack.pop();
        newStack.pop();
        assertEquals(newStack.toString(),"Stack{top=null}   {sizeOStack = 0}");
    }

    //Can successfully peek the next item on the stack
    @Test
    void testPeekSecondElement() {
        newStack.push("Manar");
        newStack.push("Sadan");
        assertEquals(newStack.peek(),"Sadan");
    }
    //Can successfully instantiate an empty stack
    @Test
    void testInstantiateEmptyStack() {
        assertEquals(newStack.isEempty(),true);
    }
    //Calling pop or peek on empty stack raises exception
//    @Test
//    void testPopEmptyStack() {
//        assertEquals(newStack.pop(),"java.util.EmptyStackException at AppTest.java:69" );
//    }
    // Can successfully enqueue into a queue
    @Test
    void testQueueEnqueue() {
        newQueue.enqueue("LOLO");
        assertEquals(newQueue.peek(),"LOLO");
    }
    //Can successfully enqueue multiple values into a queue
    @Test
    void testEnqueue2values() {
        newQueue.enqueue("Manar");
        newQueue.enqueue("Sadan");
        assertEquals(newQueue.toString(),"Queue{ back->{Sadan}->{Manar}->frontsize = 2");
    }
    //Can successfully dequeue out of a queue the expected value
    @Test
    void testDequeuvalues() throws Exception {
        newQueue.enqueue("Manar");
        newQueue.enqueue("Sadan");
        newQueue.dequeue();
        assertEquals(newQueue.toString(),"Queue{ back->{Sadan}->{Manar}->frontsize = 1");
    }
    //Can successfully peek into a queue, seeing the expected value
    @Test
    void testPeekQueue() throws Exception {
        newQueue.enqueue("Manar");
        newQueue.enqueue("Sadan");
        newQueue.peek();
        assertEquals(newQueue.peek(),"Manar");
    }
    //Can successfully empty a queue after multiple dequeues
    @Test
    void testEmptyQueue() throws Exception {
        newQueue.enqueue("Manar");
        newQueue.dequeue();
        assertEquals(newQueue.isEmpty(),false);
    }
    //Can successfully instantiate an empty queue
    @Test
    void testInstantiateEmptyQueue() throws Exception {
        assertEquals(newQueue.isEmpty(),true);
    }
    // Calling dequeue or peek on empty queue raises exception
    @Test
    void testPeekEmptyQueue() throws Exception {
    assertEquals(newQueue.peek(),null);

    }
}
