
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
        linkedList1<Integer> list3 = new linkedList1();

        list1.insertNode(1);
        list1.append(2);
        list1.append(2);
        list1.append(1);

        System.out.println("is list palindrom ? " + newlist.Ispalindrom(list1)+"\n");
        list2.insertNode(2);
        list2.append(6);
        list2.append(7);
        list2.append(2);

        System.out.println("is list palindrom ? " + newlist.Ispalindrom(list2)+"\n");

        list3.insertNode(2);
        list3.append(3);
        list3.append(6);
        list3.append(3);
        list3.append(2);

        System.out.println("is list palindrom ? " + newlist.Ispalindrom(list3)+"\n");

    }
}

