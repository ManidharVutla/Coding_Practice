import java.util.*;
class Count_Set_Bits
{
    public static void main(String args[])
    {
        int number=13;
        List<Integer> lst=new ArrayList<Integer>();
        for(int i=1;i<=number;i++)
        {   
            int temp=i, count=0;
            while(temp!=0)
            {
                temp &= temp-1;
                count++;
            }
            lst.add(count);
        }

        System.out.println(lst);
    }
}