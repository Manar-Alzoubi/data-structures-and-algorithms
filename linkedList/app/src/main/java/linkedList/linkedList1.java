package linkedList;

public class linkedList1<T> {
    Node head;

    public linkedList1(){
        this.head = null;
    }

    // insert nodes to the head of linked list
    public void insertNode(T value){
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
    }
    // check if a certain node list in linked list
    public Boolean includes(T value) {
        Node pointer = this.head;
        boolean flag = false;
        while(pointer != null)
        {
            if(pointer.value == value)
                flag=true;
            pointer = pointer.next;
            break;
        }
        return flag;
    }
    // print linked list in certain way  // "{C}->{B}->{A}->NULL"
    public String toString() {
        String str= "";

        Node pointer = this.head;
        if(pointer.next == null)
            str= str+ pointer.next;
        else{
            while(pointer != null) {
                str= str +"{"+pointer.value+"}->";
                pointer=pointer.next;
            }}
        return "\""+str+"NULL"+"\"";
    }
    // print the nodes in linked list
    public void printList(){
        Node pointer = this.head;
        while(pointer != null)
        {
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
        System.out.println("\n");
    }
    // add node to the last
    public void append(T v){
        Node pointer = this.head;
        if(this.head == null)
            insertNode(v);
        else{
        while(pointer != null){
            if(pointer.next == null){
                Node newNode = new Node(v);
                pointer.next = newNode;
                newNode.next = null;
                break;
            }
            pointer = pointer.next;
        }}
    }
    // add new node before certain node
    public void addBefore(T value, T newValue) {
        boolean flag = false;
        Node pointer = this.head;
        Node<T> newNode = new Node<>(newValue);
        if (head.next == null || head.value==value){
                    insertNode(newValue);
            flag = true;}
         else {
            while (pointer.next != null) {
                if (pointer.next.value== value){
                    newNode.next = pointer.next;
                pointer.next = newNode;

                flag = true;
                break;
            }
            pointer = pointer.next;}
        }

            if(!flag)
                  System.out.println( value +" is not found in linked list to add  "+ newValue + "  before it ");
            else System.out.println(newValue +" is added to linked list before "+ value);

    }
    // add new node after certain node
    public void addAfter(T value, T newValue){
        boolean flag = false;
        Node pointer = this.head;
        Node<T> newNode = new Node<>(newValue);
        while(pointer != null){
            if(pointer.value == value){
                newNode.next=  pointer.next ;
                pointer.next= newNode;
                flag = true;
                break;
            }
            pointer = pointer.next;
        }
        if(!flag)
           System.out.println( value +" is not found in linked list to add "+ newValue +"  after it ");
        else System.out.println(newValue +" is added to linked list after "+ value);
    }

    public String KthFromLast(int Kthposition)
    {

        Node pointer = this.head;
        int count =0;

        while(pointer.next != null) {
            count++;
            pointer = pointer.next;
        }
        System.out.println("\n num of nodes in linked list = "+ (count+1)+ "  from index 0 to 5");
        // return pointer to the head
          pointer =this.head;
        if (this.head == null) {
            System.out.println("linked list is empty ");
            return "empty";
        }
          else if(Kthposition < 0) {
            System.out.println(Kthposition +" number of node can't be less than zero ");
            return "negative";
        }
            else if (Kthposition > count ){
                System.out.println(Kthposition + " is grater than length of linked list, it has " + (count+1)+ " nodes from index 0 to 5");
            return "greater";
               }
             else
             {
                 for (int i = 1; i <= count-Kthposition; i++)
                     pointer = pointer.next;

                 System.out.println("value of node at " + Kthposition +"  position from the end  is  "+ pointer.value);


        }

        return (String) pointer.value;

    }




}


