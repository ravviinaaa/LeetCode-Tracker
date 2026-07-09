// Last updated: 7/9/2026, 11:25:30 AM
class MyLinkedList {
    class Node {
        int val;
        Node next;
        public Node(int data) {
            this.val = data;
            next = null;
        }
    }

    Node head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= count) return -1;

        Node temp = head;
        for (int i = 0; i < index; i++) {  
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        count++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++; 
    }

    public void addAtIndex(int index, int val) {

        if (index > count || index < 0) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == count) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        count++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= count) return;
        if (head == null) return;  

        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
        count--;
    }
}