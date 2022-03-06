package linkedList;

public class linkedList1<T> {
    Node head;

    public linkedList1(){
        this.head = null;
    }

    public void insertNode(T v){
        Node newNode = new Node(v);
        newNode.next = this.head;
        this.head = newNode;
    }

    public Boolean includes(T v) {
        Node pointer = this.head;
        boolean x = false;
        while(pointer != null)
        {
            if(pointer.value == v)
                x=true;
            pointer = pointer.next;
        }
        return x;
    }

    public String tostring() {
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

    public void printlist(){
        Node pointer = this.head;
        while(pointer != null)
        {
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
        System.out.println("\n");
    }

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

    public void addBefore(T value, T newvalue) {
        boolean flag = false;
        Node pointer = this.head;
        Node newNode = new Node(newvalue);
        if (head.next == null || head.value==value){
                    insertNode(newvalue);
//            newNode.next = this.head;
//            this.head = newNode;
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
                  System.out.println( value +" is not found in linked list to add  "+ newvalue+ "  before it ");
            else System.out.println(newvalue +" is added to linked list before "+ value);

    }
    public void addAfter(T value, T newvalue){
        boolean flag = false;
        Node pointer = this.head;
        Node newNode = new Node(newvalue);
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
           System.out.println( value +" is not found in linked list to add "+ newvalue+"  after it ");
        else System.out.println(newvalue +" is added to linked list after "+ value);
    }


}


