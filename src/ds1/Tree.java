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

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class bst{

    private Node root;

    bst(){
        root = null;
    }

    public void displayTree(){
        System.out.println(root);
    }

    public void insert(int data){
        root = insertData(root,data);
    }

    private Node createNewNode(int data){
        return new Node(data);
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

    private void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

    public void search(int data){
        boolean response = false;
        Node temp = root;

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
        System.out.println(response);
    }

    public void depth(){
        System.out.println(maxDepth(root));
    }

    private int maxDepth(Node node){
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

    public void delete(int data){
        delete(root,data);
    }

    private Node delete(Node node, int data)
    {
        if(node == null){
            return null;
        }
        if(data<node.data){
            node.left = delete(node.left,data);
        }
        else if(data>node.data){
            node.right = delete(node.right,data);
        }
        else{
            if(node.right == null){
                return node.left;
            }
            else if(node.left == null){
                return node.right;
            }
            node.data = minValue(node.right);
            node.right = delete(root.right,node.data);

        }
        return node;
    }

    public void minimum(){
        System.out.println(minValue(root));
    }

    private int minValue(Node node)
    {
        while(node.left != null){
            node = node.left;
        }
        return node.data;

    }

    public void maximum(){
        System.out.println(maxValue(root));
    }

    private int maxValue(Node node){
        while(node.right != null){
            node = node.right;
        }
        return node.data;
    }
}

public class Tree
{
    public static void main(String[] args) {
        bst t1 = new bst();
        //8,3,6,7,1,4,10,14,13
        t1.insert(8);
        t1.insert(3);
        t1.insert(6);
        t1.insert(7);
        t1.insert(1);
        t1.insert(4);
        t1.insert(10);
        t1.insert(14);
        t1.insert(13);

        t1.displayTree();

        t1.preorder();
        System.out.println();

        t1.inorder();
        System.out.println();

        t1.postorder();
        System.out.println();

        t1.search(5);

        t1.depth();

        t1.search(10);
        t1.delete(10);
        t1.search(10);

        t1.minimum();
        t1.maximum();
    }
}
