class MaxSum_NonAdjacent
{
  public static void main(String args[])
  {
    int arr[]=new int[] {5, 1, 1, 5};
    int j=maxSum(arr);
    System.out.println(j);
  }
  static int maxSum(int [] arr)
  {
      int include=arr[0];
      int exclude=0;

      for(int i=1;i<arr.length;i++)
      {
          int excl= (include>exclude) ? include : exclude;

          include=exclude+arr[i];
          exclude=excl;
      }

      return (include>exclude) ? include : exclude;
  }
}
