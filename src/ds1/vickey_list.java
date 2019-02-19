package ds1;

import java.io.*;
import java.util.*;
import java.util.Scanner;

class viskey_list {
    public static void insertionSort(int[] arr , String[] str, int n,int x, String s) {
        int N = arr.length;
        for(int i = 1; i < N; i++) {
            int j = i - 1;
            int temp = arr[i];
            String temp1 = str[i];
            while(j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                str[j+1] = str[j];
                j--;
            }
            arr[j + 1] = temp;
            str[j+1] = temp1;


        }
        for(int k=0 ;k<arr.length;k++ )
        {
            System.out.println(arr[k] + " " + str[k]);
        }

        int size = arr.length;

        if(n==2){
            size--;
        }

        for(int k=0 ;k<size;k++ )
        {
            if(n==1)
            {
                if(x==arr[k])
                {
                    System.out.println(x+" "+s);
                }
                else
                {
                    System.out.println(arr[k]+" "+str[k]);
                }

            }
            else
            {
                System.out.println(arr[k]+" "+str[k]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        int[] arr = new int[t];
        String[] str = new String[t];
        for(int i=0;i<t;i++)
        {
            arr[i] = ob.nextInt();
            str[i] = ob.next();
        }

        int n = ob.nextInt();
        int x = 0;
        String s = "";

        if(n==1){
            x = ob.nextInt();
            s = ob.next();
            insertionSort(arr, str, n, x, s);
        }
        else{
            insertionSort(arr, str, n, x, s);
        }
    }
}
