public class linked {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public void AddAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        public void inserAtMiddle(int data){
            if(head == null){
                head = new Node(data);
                return;
            }
            int count =0;
            Node temp = head;
            while(temp!= null){
                count++;
                temp = temp.next;
            }
            int middle = count/2;
            Node newNode = new Node(data);
            temp = head;
            for(int i=1;i<middle;i++){
                temp = temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }

        public void AddAtStart(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] arg) {
        LinkedList list = new LinkedList();
        list.AddAtEnd(1);
        list.AddAtEnd(2);
        list.AddAtEnd(3);
        list.AddAtEnd(4);
        list.AddAtStart(5);
        list.AddAtStart(6);
        list.inserAtMiddle(2006);
        list.print();
    }
}
