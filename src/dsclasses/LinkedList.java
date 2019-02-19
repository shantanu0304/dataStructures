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
    //insert at the beginning
    /*public static void insert(int data){
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
    /*public static void insert(int data){
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
    }*/

    //insert at any position
    public static void insert(int data,int pos){
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
    }

    public static void display(){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        insert(10,1);
        insert(20,2);
        insert(30,3);
        insert(40,4);

        display();
    }

}
