package ds1;

public class StackUsingListAdt {
    int[] stack = new int[3];
    int top=-1;
    int size = stack.length;

    boolean isFull()
    {
        if(top == size-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void push(int value)
    {
        if(! isFull())
        {
            top++;
            stack[top] = value;
        }
        else
        {
            System.out.println("Overflow");
        }
    }

    void pop()
    {
        if(!isEmpty())
        {
            System.out.print("\n"+stack[top--]);
        }
        else
        {
            System.out.println("\n"+"Underflow");
        }
    }

    void show()
    {
        for (int i = 0; i <=top ; i++)
        {
            System.out.print(stack[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        StackUsingListAdt stack1 = new StackUsingListAdt();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        stack1.show();

        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();

    }

}
