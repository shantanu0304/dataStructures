package ds1;

import java.util.Scanner;

class ShoppingBag
{
    private int numItems;
    private float totalCost;
    private float tCostOne;

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public float gettCostOne() {
        return tCostOne;
    }

    public void settCostOne(float tCostOne) {
        this.tCostOne = tCostOne;
    }

    @Override
    public String toString() {
        return numItems + " " + totalCost + " " + tCostOne;
    }
}

public class shoppingADT {
    private int tItems=0;
    private float tCostAll=0;
    private float taxRate;
    private int itemCount=0;
    private ShoppingBag[] bag;
    private ShoppingBag bag1 = new ShoppingBag();

    shoppingADT(int n, float rate){
        taxRate = rate;
        bag = new ShoppingBag[n];
    }

    void place(int item, float cost){

        float CostOfOneItemWithTax = ((item*cost) + ((taxRate/100)*item*cost));

        tItems = tItems + item;
        tCostAll = tCostAll + CostOfOneItemWithTax;

        bag1.setNumItems(item);
        bag1.settCostOne(cost);
        bag1.setTotalCost(CostOfOneItemWithTax);
        System.out.println(bag1);
        bag[itemCount] = bag1;
        itemCount++;
    }

    void display()
    {
        /*for (int i = 0; i <itemCount ; i++) {
            System.out.println(bag[i]);
        }*/
        System.out.println(tItems + " " + tCostAll);
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        float rate = ob.nextFloat();
        int n = ob.nextInt();
        int numitem;
        float totalcost;
        shoppingADT list = new shoppingADT(n,rate);

        for (int i = 0; i <n ; i++)
        {
            numitem = ob.nextInt();
            totalcost = ob.nextFloat();
            list.place(numitem,totalcost);
        }

        list.display();

    }



}
