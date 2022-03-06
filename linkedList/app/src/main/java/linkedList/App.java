/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {



        linkedList1<String> newlist = new linkedList1();
        newlist.insertNode("A");
        newlist.insertNode("B");
        newlist.insertNode("C");

        newlist.printlist();
        System.out.println("includes  A  : "+  newlist.includes("A"));
        System.out.println("includes  C  : "+  newlist.includes("C"));
        System.out.println("includes  E  : "+  newlist.includes("E"));
        System.out.println("includes  Empty string  : "+  newlist.includes(""));


        System.out.println("\n" +newlist.tostring());


        newlist.append("F");
        newlist.printlist();

        newlist.addBefore("C","G");
        newlist.printlist();

        newlist.addBefore("B","E");
        newlist.printlist();

        newlist.addBefore("X","Y");
        newlist.printlist();

        newlist.addAfter("A","M");
        newlist.printlist();

        newlist.addAfter("F","W");
        newlist.printlist();

        newlist.addAfter("Y","X");
        newlist.printlist();

    }
}
