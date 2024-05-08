package nokiaOcadoInterview;

public class DoubleLinkedListImpl {
    NodeDouble tail;
    NodeDouble head;


    static class NodeDouble{
        NodeDouble next;
        NodeDouble previous;
        int data;

        public NodeDouble(int data) {
            this.next = null;
            this.previous = null;
            this.data = data;
        }

    }


    void addFront(int data){
        NodeDouble newNode = new NodeDouble(data);
        if(this.head ==null){
            this.head=this.tail=newNode;
        }else {
            NodeDouble temp = this.head;
            this.head.previous = newNode;
            this.head = newNode;
            newNode.next = temp;
        }
    }


    void addBack(int data){
        NodeDouble newNode = new NodeDouble(data);
        if(this.head ==null){
            this.head=this.tail=newNode;
        }else {
            tail.next=newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void delete(int index){
        if (head == null){
            return;
        }

        if(index == 0){
            this.head = this.head.next;
        }

        NodeDouble current = this.head;
        NodeDouble previous = null;
        int count = 0;
        while (current!= null && count != index){
            current = current.next;
            count++;
        }
        if(current == null){
            System.err.println("Wrong position given");
            return;
        }
        if (current == tail){
            this.tail.previous.next = null;
            this.tail = this.tail.previous;
        }
        current.previous.next = current.next;
        current.next.previous = current.previous;
        current.previous = null;
        current.next = null;
    }

    public static void main(String[] args) {
        DoubleLinkedListImpl doubleLinkedList = new DoubleLinkedListImpl();
        doubleLinkedList.addFront(1);
        doubleLinkedList.addBack(2);
        doubleLinkedList.addBack(3);
        doubleLinkedList.addBack(4);
        doubleLinkedList.addBack(5);
        doubleLinkedList.delete(2);
    }

}
