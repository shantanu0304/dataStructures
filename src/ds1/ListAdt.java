package ds1;

import java.util.Arrays;

public class ListAdt {
    int[] list = new int[5];

    void insert(int value)
    {
        for (int i = 0; i < list.length; i++)
        {
            if(list[i] == 0)
            {
                list[i] = value;
                break;
            }
        }
    }

    void show()
    {
        System.out.println(Arrays.toString(list));
    }

    void delete(int value)
    {
        for (int i = 0; i <list.length ; i++)
        {
            if(list[i]==value)
            {
                for (int j = i; j < list.length - 1 ; j++)
                {
                    list[j]=list[j+1];
                }
                list[list.length-1] = 0;
            }
        }
    }

    boolean IsEmpty()
    {
        if(list[0] == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean IsFull()
    {
        if(list[list.length-1] != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        ListAdt list1 = new ListAdt();

        list1.insert(10);
        list1.insert(11);
        list1.insert(12);

        System.out.println(list1.IsFull());

        list1.insert(13);
        list1.insert(14);

        System.out.println(list1.IsFull());

        list1.show();

        list1.delete(14);
        list1.delete(10);
        list1.delete(12);

        System.out.println(list1.IsEmpty());
        list1.show();

        list1.delete(13);
        list1.delete(11);

        System.out.println(list1.IsEmpty());


    }

}
