package ds1;
public class DoublyLinkedList {

    /*
     *  The 'DoublyLinkedList' class will have the following attributes
     *  1. An integer variable to hold the current size of the linked list, named 'size'.
     *  2. A 'Node' type reference variable to point to the first node of the linked list.
     * */

    private int size = 0;
    private Node head = null;

    /*
     * This main method is just provided here for a demo of the DoublyLinkedList class,
     * this method will more often be found in the application class for this list
     * */
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.insert(i + 1);
        }
        System.out.println(linkedList);
        int value = linkedList.deleteHead();
        System.out.println(value + " was the previous HEAD and has been deleted from the list!");
        System.out.println(linkedList);
        int del = 4;
        int value2 = linkedList.delete(del);
        if (value2 != -1) {
            System.out.println(value2 + " deleted from the list");
            System.out.println(linkedList);
        } else {
            System.out.println(del + " not found in the list");
            System.out.println(linkedList);
        }
        int found = linkedList.search(8);
        System.out.println("8 found at location " + found + ". (if -1, then it isn't present)");
    }

    /*
     * The 'toString()' method will be used to print the values of the linked list as a String
     * */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        //  check if the size of the linked list is zero, then display "list is empty"
        if (size == 0) {
            System.out.println("The list is currently empty.");
        } else {  //  if the list is not empty, traverse and append the values

            //  append the "[ null <==> " to the result to depict the head node's previous is null
            result.append("[ null <==> ");

            /*
             * Steps to traverse a linear linked list.
             * 1. Copy the head node's reference to a new 'Node' type reference, 'temp'
             * 2. Check if the node is not null
             * 3. Change the reference of 'temp' to the next node on each iteration
             * */

            //  copy the head's reference to temp
            Node temp = this.head;

            //  check if the node is not null
            while (temp != null) {

                // append the node's data to the result
                result.append(temp.getData());

                // check if there is another node present after this node
                if (temp.getNext() != null) {
                    //  append double ended arrow after the node's value
                    result.append(" <==> ");
                }

                // change the reference of temp
                temp = temp.getNext();
            }

            //  append the "<==> null ] " to the result to depict the tail node's next is null
            result.append(" <==> null ]");
        }

        return result.toString();
    }

    /*
     * Helper method to insert a node at the head of the linked list
     * */
    private void insertHead(int data) {
        /*
         * STEPS:
         * 1.  create a new node for the 'data' item.
         * 2.  set the 'next' of the new node to current HEAD.
         * 3.  set the 'prev' of the new node to null.
         * 4.  change the HEAD to new node.
         * 5.  increment the value of size by 1.
         * */

        //  create a new node for the 'data' item, set the next to current head, prev to null
        Node newNode = new Node(data, this.head, null);

        //  change the HEAD to new node
        this.head = newNode;

        //  increment the value of size by 1
        size++;
    }

    /*
     * Helper method to insert a new node after a node
     * */
    private void insertAfter(int data, Node node) {
        /*
         * STEPS:
         * 1. create a new node for the 'data' item, name it 'newNode'.
         * 2. set the newNode's next reference to node's next.
         * 3. set the node's next to 'newNode'.
         * 4. set the newNode's previous to 'node'.
         * 5. increment the value of size by 1
         * */
        /*
         * create a new node named 'newNode',
         * set the new node's next reference to the old node's next node
         * set the new node's previous reference to the old node
         * */
        Node newNode = new Node(data, node.getNext(), node);

        //  set the next reference of the old node to 'newNode'
        node.setNext(newNode);

        //  increment the value of size by 1
        this.size++;

    }

    /*
     * public method to insert a data item in a linked list
     * This is the only method available to any user of this linked list class!
     * */
    public void insert(int data) {
        /*
         * Steps:
         * 1.  Check whether the list is empty,
         *     if yes, then insert the data item at head, call insertHead()
         *     if no, insert the data item at the end of the list, call insertAfter()
         * */

        //  check if the list is empty
        if (this.head == null) {
            //  insert the data at head
            insertHead(data);
        } else {
            //  if the list is not empty, we will insert the data at the end of the list
            //  Traverse to the end of the list

            //  copy the reference of the head node
            Node temp = this.head;
            //  traverse the linked list to the end
            while (temp.getNext() != null) {
                //  update the temp to the next node
                temp = temp.getNext();
            }
            //  insert the data item after the last node in the list
            insertAfter(data, temp);
        }

    }

    private int deleteHead() {
        //  create a response variable to store the data of the deleted node
        int response = -1;

        //  check if the list is not empty
        if (this.head != null) {
            //  save the data of the node being deleted
            response = this.head.getData();
            //  shift the HEAD of the list to the next node
            this.head = this.head.getNext();

            //  decrement the value of size by 1
            size--;
        }

        //  return the value of the deleted node, or -1 if none
        return response;
    }

    private int deleteAfter(Node nodePrev) {
        //  create a response variable to store the data of the deleted node
        int response = nodePrev.getNext().getData();

        //   store the reference of the node next to the node being deleted
        Node nodeAfter = nodePrev.getNext().getNext();

        //  set the next reference of the node previous to the node being deleted
        nodePrev.setNext(nodeAfter);

        //  set the previous reference of the nodeAfter to nodePrev
        nodeAfter.setPrev(nodePrev);

        //  return the value of the deleted node, or -1 if none
        return response;
    }

    /*
     * Public method 'delete' to search for a particular data item inside the list
     * and delete the node that contains it
     * */
    public int delete(int data) {
        int response = -1;

        if (this.head == null) {
            System.out.println("The list is already empty!");
        } else {
            //  traverse the linked list and search for the node that contains 'data'

            //  copy the reference for the current HEAD to temp
            Node temp = this.head;

            while (temp.getNext() != null) {
                if (temp.getNext().getData() == data) {
                    response = deleteAfter(temp);
                    break;
                }
                temp = temp.getNext();
            }
        }

        return response;
    }

    public int search(int data) {
        int response = -1;
        int ctr = 0;

        Node temp = this.head;

        while (temp != null) {
            ctr++;
            if (temp.getData() == data) {
                response = ctr;
                break;
            }
            temp = temp.getNext();
        }

        return response;
    }

    private static class Node {

        /*
         * The 'Node' class for this doubly linked list will have the following attributes
         * 1. An integer variable to hold the 'data' for the node, named 'data'.
         * 2. A 'Node' type reference variable to hold the reference of the 'Next Node', named 'next'.
         * 3. A 'Node' type reference variable to hold the reference of the 'Previous Node', named 'prev'.
         * */

        private int data;
        private Node next;
        private Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

}