
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {


            // declare a linked list

        linkedList1<Integer> newlist = new linkedList1();
        linkedList1<Integer> list1 = new linkedList1();
        linkedList1<Integer> list2 = new linkedList1();

        list1.insertNode(1);
        list1.append(3);
        list1.append(5);
        list1.append(7);
//        list1.append(9);

        list2.insertNode(2);
        list2.append(4);
        list2.append(6);
//        list2.append(8);
//        list2.append(10);
        System.out.println("list 1 =   " +list1.toString());
        System.out.println("list 2 =   "+list2.toString() );
        System.out.println("zip list =  " +newlist.zipList(list1,list2).toString());
//         newlist.zipList(list1,list2);


//        linkedList1<String> newlist = new linkedList1();
//        // insert nodes to the head of linked list
//        newlist.insertNode("A");
//        newlist.insertNode("B");
//        newlist.insertNode("C");
//        newlist.insertNode("G");
//        newlist.insertNode("M");
//        newlist.insertNode("N");
//
//        System.out.println("\n nods in linked list : ");
//        newlist.printList();
//
//        newlist.KthFromLast(9);
//        newlist.KthFromLast(6);
//        newlist.KthFromLast(0);
//        newlist.KthFromLast(-1);
//        newlist.KthFromLast(4);

        // print the nodes in linked list





    }
}

