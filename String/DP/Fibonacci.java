import java.util.Scanner;
class Fibonacci 
{
    private static void fib(int n)
    {
       int a=0, b=1, c=a+b;
       System.out.println(a);
       System.out.println(b);
       for(int i=0;i<n;i++)
       {
           c=a+b;
           System.out.println(c);
           a=b;
           b=c;
       }
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");

        fib(n);
    }
} 