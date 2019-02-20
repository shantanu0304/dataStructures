package dsclasses;

import java.util.Arrays;

public class LinkedList_rev {
    public static class Node1
    {
        int data;
        Node1 next;
        Node1(int d){
            data = d;
            next = null;
        }

        @Override
        public String toString() {
            return "Node1{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
    public static Node1 start;
    public static Node1 head;

    public static void insert(int data)
    {
        Node1 new_node = new Node1(data);
        if(start == null){
            start = new_node;
            head = new_node;
        }
        else{
            if(head.next == null){
                head.next = new_node;
                head = head.next;
            }

        }
        //System.out.println(start);
    }

    public static void reverse(){
        Node1 t = start;
        Node1 start1 = t;
        start = start.next;
        t.next = null;
        System.out.println(start);
        while(start!=null){
            Node1 t1;
            t1 = start;
            t1.next = t;
            System.out.println(start.next);
            t=t1;
            start1 = t1;
            start = start.next;
            break;
        }
        System.out.println(start1);
        start = start1;
        head = start1;
    }


    public static void display(){
        Node1 temp;
        temp = start;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        reverse();

    }

}
