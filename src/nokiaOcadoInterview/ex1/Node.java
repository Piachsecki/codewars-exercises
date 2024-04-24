package nokiaOcadoInterview.ex1;

public class Node {
   int data;
   Node next;
public Node(int data){
    this.data = data;
    this.next = null;
}

}



class LinkedListCustom {
    private Node head;

    LinkedListCustom() {
        this.head = null;
    }


    public void insert(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

    }

    public void delete(int data){
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node prev = head;
        Node current = head.next;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            prev.next = current.next;
        }


    }



        public static void main(String[] args) {
            LinkedListCustom list = new LinkedListCustom();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(5);
            list.delete(3);
        }


}
