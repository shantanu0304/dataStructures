package ds1;

public class recursionfib
{

    public static int fibo(int number)
    {
        if(number == 1){
            return 0;
        }
        if(number == 2)
        {
            return 1;
        }
        return fibo(number-1)+ fibo(number-2);

    }

    public static void main(String[] args) {
        System.out.println((fibo(4)));
    }
}
