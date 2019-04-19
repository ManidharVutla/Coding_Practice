class Add_Expect
{
  public static void main(String args[])
  {
    int [] arr=new int [] {1,2,3,4,5};
    int [] temp=new int [5];
    int actual_sum=arr[0];
    for(int i=0;i<arr.length;i++)
    {

      temp[i]=actual_sum;
      actual_sum*=arr[i];
    }
    actual_sum=arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--)
    {


      temp[i]*=actual_sum;
      actual_sum*=arr[i];
    }

    for(int i: temp)
      System.out.println(i);

  }
}
