package linkedList;

public class linkedList<T> {
    Node head;

    public linkedList(){
        this.head = null;
    }

    public void insert(T v){
        Node newNode = new Node(v);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void print(){
        Node pointer = this.head;
        while(pointer != null)
        {
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
    }

    public void addLast(T v){
        Node pointer = this.head;
        while(pointer != null){
            if(pointer.next == null){
                Node newNode = new Node(v);
                pointer.next = newNode;
                newNode.next = null;
                break;
            }
            pointer = pointer.next;
        }
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

    }

