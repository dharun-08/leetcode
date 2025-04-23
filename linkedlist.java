public class linkedlist {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    // private void addNodeBegin(int data) {
    //     Node newNode = new Node(data);
    //     if(head == null) {
    //         head = newNode;
    //         tail = newNode;
    //     } else {
    //         newNode.next = head;
    //         head = newNode;
    //     }
    // }

    private void addNodeEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    private void display() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    // private void removeNodeBegin() {
    //     head = head.next;
    // }

    // private void removeNodeEnd() {
    //     Node temp = head;
    //     while(temp.next.next != null) {
    //         temp = temp.next;
    //     }
    //     tail = temp;
    //     temp.next = null;
    // }

    private void removeNodePos(int pos) {
        
    }

    public static void main(String[] args) {
        System.out.println("Single Linked List");
        linkedlist list = new linkedlist();
        list.addNodeEnd(10);
        list.addNodeEnd(11);
        list.addNodeEnd(12);
        list.addNodeEnd(13);
        list.addNodeEnd(14);
        // list.removeNodeBegin();
        // list.removeNodeEnd();
        list.removeNodePos(1);
        list.display();
    }
}