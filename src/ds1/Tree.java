package ds1;

class Node
{
    int data;
    Node left;
    Node right;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}


class bst{

    public Node createNewNode(int data){
        Node newnode = new Node();
        newnode.data = data;
        newnode.left = null;
        newnode.right = null;
        return newnode;
    }

    public Node insert(Node node, int data){
        if(node == null){
            return createNewNode(data);
        }

        if(data<node.data){
            node.left = insert(node.left,data);
        }
        else{
            node.right = insert(node.right,data);
        }

        return node;

    }

    public void preorder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data+" ");

        preorder(node.left);

        preorder(node.right);

    }

    public void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);

        System.out.print(node.data+" ");

        inorder(node.right);

    }

    public void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);

        postorder(node.right);

        System.out.print(node.data+" ");
    }

    public boolean search(Node node, int data){
        boolean response = false;

        Node temp = node;

        while(temp!=null){
            if(data == temp.data){
                response = true;
                break;
            }
            else if(data<temp.data)
            {
                temp = temp.left;
            }
            else{
                temp = temp.right;
            }
        }

        return response;

    }
}

public class Tree
{
    public static void main(String[] args) {
        bst t1 = new bst();
        Node root = null;
        //8,3,6,7,1,4,10,14,13

        root = t1.insert(root, 8);
        root = t1.insert(root,3);
        root = t1.insert(root,6);
        root = t1.insert(root,1);
        root = t1.insert(root,4);
        root = t1.insert(root,13);
        root = t1.insert(root,14);
        root = t1.insert(root,10);

        System.out.println(root);

        t1.preorder(root);
        System.out.println();

        t1.inorder(root);
        System.out.println();

        t1.postorder(root);
        System.out.println();

        boolean ans = t1.search(root, 5);
        System.out.println(ans);
    }

}
