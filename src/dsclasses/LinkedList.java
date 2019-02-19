package dsclasses;

public class LinkedList
{
    static Node start;
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public static void insert(int data){
        Node new_node = new Node(data);
        if(start == null){
            start = new_node;
            head = new_node;
        }
        else{
            new_node.next = start;
            start = new_node;
            head = new_node;
        }
    }

    public static void display(){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        display();
    }

}
