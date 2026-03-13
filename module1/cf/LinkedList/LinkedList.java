package module1.cf.LinkedList;

public class LinkedList {

        Node head;
    
        static class Node {
            int data;
            Node next;
    
            Node(int dt) {
                data = dt;
                next = null;
            }
        }
    
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                        current = current.next;
                }
                current.next = newNode;
            }
        }
    
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.insert(10);
            list.insert(20);
            list.insert(50);
            list.display(); // 
        }
    
}
