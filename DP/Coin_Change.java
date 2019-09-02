class Coin_Change
{
    private static int coinchange(int arr[], int m, int n)
    {

       
      /* if(n==0)
        return 1;
       
       if(n<0)
        return 0;
       
       if(m<=0 && n>=1)
        return 0;
       

       return coinchange(arr,m,n-arr[m-1]) + coinchange(arr,m-1,n);*/

       if(n==0)
         return 1;
       if(n<0)
         return 0;
       
       if(n>=1 && m<=0)
        return 0;

      return coinchange(arr, m,n-arr[m-1]) + coinchange(arr,m-1,n);
    }
    
    public static void main(String args[])
    {
        int arr[]={2,5,6,3};

        System.out.println(coinchange(arr, arr.length,10));
    }
}