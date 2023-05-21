package LinkedList;

public class LinkedList {
    Node head = new Node();
    Node current = new Node();

    LinkedList() {
        this.head = null;
    }

    public void createLinkedList() {

        Node node1 = new Node(1);
        this.head = node1;

        Node node2 = new Node(2);
        node1.next = node2;

        Node node3 = new Node(3);
        node2.next = node3;
    }

    public void getData() {
        current = this.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }
    public void insertDataToIndex(Node node, int index){
        current = this.head;

        if (this.head == null) {
            this.head = node;
        } else {

            for (int i=0;i<index-1&&current!=null;i++){
                current=current.next;

            }
            node.next=current.next;
            current.next=node;


        }

    }
    public int getDataFromIndex(int index){
        current = this.head;

        for (int i=0;i<index-1&&current!=null;i++){
            current=current.next;
        }
        return current.data;
    }public void deleteNode(int index){
        Node previous=null;
        current = this.head;
        int deletedData=-1;
        for (int i=0;i<index&&current!=null;i++){
            previous=current;
            current=current.next;
        }
        if(index==0){
            deletedData=head.data;
            head=current.next;
        }
        else{
            deletedData = current.data;
            previous.next=current.next;
        }


    }

    public void appendNode(Node newNode) {

        current = this.head;

        if (current == null) {
            this.head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }


}
