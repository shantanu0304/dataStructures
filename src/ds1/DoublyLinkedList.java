package ds1;

public class DoublyLinkedList {
    private static class Node {
        private int data;
        private Node next = null;
        private Node prev = null;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    private void insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            insertHead(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public static void display(DoublyLinkedList doublyLinkedList) {
        while (doublyLinkedList.head != null) {
            System.out.println(doublyLinkedList.head.data);
            doublyLinkedList.head = doublyLinkedList.head.next;
        }
    }

    /*public int delete()
    {

    }*/

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (size == 0) {
            result.append("[]");
        } else {
            result.append("[ null <== ");

            Node temp = this.head;
            while (temp != null) {
                result.append(temp.data);

                if (temp.next != null) {
                    result.append(" <==> ");
                }
                temp = temp.next;
            }
            result.append(" ==> null ]");
        }
        return result.toString();
    }

    public int removeHead() {
        int response = -1;

        if (head != null) {
            response = head.data;
            Node temp = head.next;
            temp.prev = null;
            head = temp;
        }
        return response;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        System.out.println(doublyLinkedList);
        for (int i = 0; i < 5; i++) {
            doublyLinkedList.insert(i + 1);
        }
        System.out.println(doublyLinkedList);
        System.out.println(doublyLinkedList.removeHead() + " is deleted ");
    }
}