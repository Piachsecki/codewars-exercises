package nokiaOcadoInterview;

public class SingleLinkedListImpl {
    Node head;

    public SingleLinkedListImpl() {
        this.head = null;
    }

    public static void main(String[] args) {
        SingleLinkedListImpl imp = new SingleLinkedListImpl();
        imp.append(2);
        imp.append(3);
        imp.append(4);
        imp.append(5);
        imp.append(6);
        imp.append(7);
        imp.append(8);
//        imp.deleteFirst();
//        imp.deleteLast();
        imp.deleteAtIndex(2);
    }

    void deleteFirst() {
        if (this.head == null) {
            return;
        }
        this.head = this.head.next;
    }

    void deleteLast() {
        if (this.head == null) {
            return;
        } else {
            Node temp = head;
            Node previous = null;
            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            previous.next = null;
        }
    }

    void deleteAtIndex(int index) {
        if (this.head == null) {
            return;
        }

        Node previous = null;
        Node current = head;
        int count = 0;
        while (current.next != null && count < index) {
            previous = current;
            current = current.next;
            count++;
        }
        previous.next = current.next;
    }

    void append(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


}
