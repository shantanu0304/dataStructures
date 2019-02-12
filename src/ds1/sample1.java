package ds1;

import java.util.Date;
import java.util.Random;

public class sample1 {
    public static void main(String[] args) {

/*
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < 10 ; i++) {
            a[i] = i*i;

        }
        for (int i = 0; i < 10 ; i++) {
            System.out.println(a[i]);

        }

        int j = 0;
        for (int i : b ) {
            i = j*j;
            b[j] = i;
            j++;
        }

        for (int i : b)
        {
            System.out.println(i);
        }*/
/*
        Date[] date = new Date[10];

        date[0] = new Date(2019-1900,2-1,13);
        System.out.println(date[0]);

        for (int i = 0; i <10 ; i++)
        {
            date[i] = new Date(2019-1900 , 12-1, i+1 );
            System.out.println(date[i]);
        }*/

        int[][] arr2d = new int[20][20];
        int[] rowsum = new int[20];
        int[] colsum = new int[20];
        Random rand = new Random();
        int x = 0;
        for (int i = 0; i <20 ; i++)
        {
            for (int j = 0; j <20 ; j++) {
                arr2d[i][j] = x;
                if(x>100)
                    x = 0;
                else
                    x++;
                System.out.print(arr2d[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i <20 ; i++)
        {
            for (int j = 0; j <20 ; j++) {
                rowsum[i] += arr2d[i][j];
            }
        }

        for (int i = 0; i <20 ; i++)
        {
            for (int j = 0; j <20 ; j++) {
                colsum[i] += arr2d[j][i];
            }
        }

        int rowmax = rowsum[0];
        int rowind = 0;
        int colmax = colsum[0];
        int colind = 0;
        for (int i = 0; i <20 ; i++)
        {
            if(rowmax<rowsum[i]) {
                rowmax = rowsum[i];
                rowind = i;
            }

            if (colmax<colsum[i]) {
                colmax = colsum[i];
                colind = i;
            }
        }


        System.out.println(colind + " " + rowind);




    }
}
