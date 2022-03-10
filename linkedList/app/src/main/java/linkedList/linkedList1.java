package linkedList;

public class linkedList1<T> {
    Node head;

    public linkedList1(){
        this.head = null;
    }
    public linkedList1 zipList(linkedList1 list1, linkedList1 list2) {
        Node<T> pointer1 = list1.head;
        Node<T> pointer2 = list2.head;
        Node<T> temp1;
        Node<T> temp2;
        if (list1.head == null && list2.head == null) {
            return null;
        } else if (pointer1 == null) {
            return list2;
        } else if (pointer2 == null) {
            return list1;
        }
        else {
            while (pointer1.next != null && pointer2.next != null) {
                temp1 = pointer1.next;
                temp2 = pointer2.next;

                pointer1.next = pointer2;
                pointer2.next = temp1;

                pointer1 = temp1;
//              temp1 = pointer1.next;
                pointer2 = temp2;
//              pointer1.next = temp2;
            }
            if (pointer1.next == null) {
                pointer1.next = pointer2;
//               pointer1.next=pointer2.next;
//               System.out.println("pointer1.value    "+ pointer1.value);
//                System.out.println("pointer2.value    "+ pointer2.value);
        }
            if (pointer2.next == null) {
                temp1=pointer1.next;
                pointer1.next=pointer2;
                pointer2.next= temp1;
//               pointer1.next = pointer2;
            }
            return list1;

        }
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


