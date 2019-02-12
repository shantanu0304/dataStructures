package ds1;

import java.util.Scanner;

public class rainfall {
    static void total(double[] a){
        double sum = 0;
        for (int i = 0; i <a.length ; i++)
        {
            sum+=a[i];
        }
        System.out.println("Total Rainfall = "+sum);
    }

    static void avg ( double[] a ){
        double sum = 0;
        for (int i = 0; i <a.length ; i++)
        {
            sum+=a[i];
        }
        System.out.println("Average rainfall = "+sum/12);
    }

    static void max(double[] a){
        double maximum = a[0];
        int ind = 0;
        for (int i = 0; i <a.length ; i++)
        {
            if(maximum<a[i]) {
                maximum = a[i];
                ind = i;
            }
        }
        ind+=1;
        System.out.println("Maximum rainfall is in "+ ind +"th month and is ="+ maximum);
    }

    static void min(double[] a){
        double minimum = a[0];
        int ind = 0;
        for (int i = 0; i <a.length ; i++)
        {
            if(minimum>a[i])
                minimum = a[i];
        }
        ind+=1;
        System.out.println("Maximum rainfall is in "+ ind +"th month and is ="+ minimum);
    }


    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        double[] rain = new double[12];
        for (int i = 0; i <12 ; i++) {
            rain[i] = ob.nextDouble();
        }

        total(rain);
        avg(rain);
        max(rain);
        min(rain);


    }


}
