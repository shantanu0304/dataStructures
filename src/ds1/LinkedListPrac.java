package ds1;

public class LinkedListPrac {
    private static class node{
        private int data;
        private node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public node getNext() {
            return next;
        }

        public void setNext(node next) {
            this.next = next;
        }
    }
    private node head;
    int size = 0;
    LinkedListPrac(){
        head = null;
    }

  void display(){
      if(this.head == null){
          System.out.println();
      }
      else{
          node temp = this.head;
          while(temp.getNext()!=null){
              System.out.print(temp.data+" --> ");
              temp = temp.getNext();
          }
          System.out.println(temp.getData());
      }
  }

    public void insertathead(int data){
        node newnode = new node();
        newnode.setData(data);
        newnode.setNext(null);
        if(this.head == null)
        {
            this.head = newnode;
        }
        else{
            newnode.setNext(this.head);
            this.head = newnode;
        }
        size++;

    }
    public void insertatlast(int data)
    {
        node newnode = new node();
        newnode.setData(data);
        newnode.setNext(null);

        if(head == null){
            head = newnode;
        }
        else{
            node temp = head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.next = newnode;
        }
        size++;

    }

    public void delete(int data){
        node temp = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if (data == head.data)
        {
            head = head.getNext();
            size--;
            System.out.println(data+" is removed");

        }
        else{
            int flag = 0;
            while(temp.next!=null)
            {
                if(temp.getNext().getData() == data)
                {
                    temp.setNext(temp.getNext().getNext());
                    flag = 1;
                    this.size--;
                    break;
                }
                temp = temp.getNext();
            }
            if(flag == 0){
                System.out.println("Element not found");
            }
            else{
                System.out.println(data+" is removed");
            }
        }
    }
    public static void main(String[] args) {
        LinkedListPrac linkedlist = new LinkedListPrac();
        for (int i = 0; i < 10 ; i++)
        {
            linkedlist.insertatlast(i+1);

        }
        linkedlist.display();
        System.out.println(linkedlist.size);

        linkedlist.delete(10);
        linkedlist.display();
        System.out.println(linkedlist.size);

        linkedlist.delete(5);
        linkedlist.display();
        System.out.println(linkedlist.size);

        linkedlist.delete(1);
        linkedlist.display();
        System.out.println(linkedlist.size);

        linkedlist.delete(10);
        linkedlist.display();
        System.out.println(linkedlist.size);
    }

}


