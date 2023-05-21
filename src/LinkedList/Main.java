package LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList list203 = new LinkedList();
        Node node4 = new Node(4);
        list203.createLinkedList();
        list203.appendNode(node4);
        Node node35= new Node(999);
        //list203.insertDataToIndex(node35,2);
        //System.out.println(list203.getDataFromIndex(4));
        list203.getData();
        list203.deleteNode(1);
        System.out.println();
        list203.getData();
        System.out.println("Zdarec Mates");





    }
}