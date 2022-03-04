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



}


