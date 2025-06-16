package day37;

class main1 {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtEnd(1);
        list.insertStart(3);
        list.insertStart(23456);
        list.deleteEnd();
        list.deleteEnd();
        list.display();
    }

    public static class Node {
        int val;
        Node next;

        Node(int data) {
            val = data;
            next = null;
        }
    }

    public static class LL {
        Node head = null;

        public  void insertAtEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        public void insertStart(int val){
            Node newNode = new Node(val);
            if(head==null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void deleteEnd(){
            if (head==null) return;
            Node temp = head;
            if(temp.next == null){
                head = null;
                return;
            }
            while(temp.next.next!=null){
                temp =temp.next;
            }
            temp.next=null;
        }

        public  void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}

