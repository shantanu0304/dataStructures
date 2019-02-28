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

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
    /*//insert at the beginning
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
    }*/


    //insert at the end
    public static void insert(int data){
        Node new_node = new Node(data);
        if(start == null ){
            start = new_node;
            head = new_node;
        }
        else{
            while(head.next!=null){
                head = head.next;
            }
            head.next = new_node;
            head = start;
        }
    }

    //insert at any position
    /*public static void insert(int data,int pos){
        Node new_node = new Node(data);
        int c=0;
        if(start == null ){
            start = new_node;
            head = new_node;
        }
        else{
            while((head.next!=null) && (c<pos-2)){
                head = head.next;
                c++;
            }
            if((c==0) && (pos<=1)){
                new_node.next=start;
                start=new_node;
                head=new_node;
            }
            else if(head.next==null){
                head.next = new_node;
                head=start;
            }
            else{
                new_node.next = head.next;
                head.next = new_node;
                head = start;
            }

        }
    }*/

    public static void search(int data)
    {
        Node temp = start;
        while(temp!=null){
            if(temp.data == data){
                System.out.println("Element found");
                break;
            }
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Element not found");
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
        search(40);
    }

}
