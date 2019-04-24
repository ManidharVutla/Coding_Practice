class SmallestPositiveNumber{

  public static void main(String args[])
  {
      int arr[]=new int [] {2,3,4,5,-1,-2,-10};

      int j=findSmall(arr);

      System.out.println(j);
  }

  static int findSmall(int arr[])
  {
      int n=arr.length;
      for(int i=0;i<n;i++)
      {
          if(arr[i]<=0 || arr[i]>n)
            continue;

           int val =arr[i];

           while(arr[val-1]!= val)
           {
              int nextval=arr[val-1];
              arr[val-1]=val;
              val=nextval;

              if(val<=0 || val > n)
                break;
           }
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]!=i+1)
              return i+1;
        }
        return n+1;
      }
  }
