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

    public Node(int data){
        this.data = data;
        left = right = null;
    }

}

class bst{

    Node root;

    bst(){
        root = null;
    }

    public Node createNewNode(int data){
        Node newnode = new Node(data);
        return newnode;
    }

    public void displayTree(){
        System.out.println(root);
    }

    public void insert(int data){
        root = insertData(root,data);
    }

    public Node insertData(Node node, int data){
        if(node == null){
            return createNewNode(data);
        }
        else if(node.data == data){
            return node;
        }
        else if(data<node.data){
            node.left = insertData(node.left,data);
        }
        else{
            node.right = insertData(node.right,data);
        }
        return node;
    }


    public void preorder(){
        preorder(root);
    }

    public void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(){
        inorder(root);
    }

    public void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public void postorder(){
        postorder(root);
    }

    public void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

    public boolean search(int data){
        return search(root,data);
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

    int maxDepth(){
        return maxDepth(root);
    }

    int maxDepth(Node node){
        if(node == null){
            return 0;
        }
        else{

            int ldepth = maxDepth(node.left);
            int rdepth = maxDepth(node.right);
            if(ldepth>rdepth){
                return (ldepth+1);
            }
            else{
                return (rdepth+1);
            }
        }
    }

    /*public void delete(Node node, int data)
    {


    }*/
}

public class Tree
{
    public static void main(String[] args) {
        bst t1 = new bst();
        //8,3,6,7,1,4,10,14,13
        t1.insert(8);
        t1.insert(3);
        t1.insert(2);
        t1.insert(1);
        t1.insert(4);
        t1.insert(13);
        t1.insert(14);
        t1.insert(10);

        t1.displayTree();

        t1.preorder();
        System.out.println();

        t1.inorder();
        System.out.println();

        t1.postorder();
        System.out.println();

        boolean ans = t1.search(5);
        System.out.println(ans);

        int depth = t1.maxDepth();
        System.out.println(depth);
    }
}