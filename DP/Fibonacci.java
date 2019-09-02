import java.util.*;
class Fibonacci 
{
    private static int fib(int n)
    {
       int arr[]=new int[n+2];
       arr[0]=0;
       arr[1]=1;

       for(int i=2;i<=n;i++)
       {
           arr[i]=arr[i-1] +arr[i-2];
       }
       System.out.println(Arrays.toString(arr));
       return arr[n];

    }
    public static void main(String args[])
    {
        int n=8;
        System.out.println(fib(n));
    }
} 