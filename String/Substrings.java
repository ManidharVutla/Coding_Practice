import java.util.*;
class Substrings
{
    public static void main(String args[])
    {
        String s="man";
        List<String> lst=new ArrayList<String>();
        for(int i=0;i<s.length();i++)
        {
            String temp=s.charAt(i) + "";
            lst.add(temp);
            for(int j=i+1;j<s.length();j++)
            {
                temp+=s.charAt(j)+"";
                lst.add(temp);
            }
        }

        System.out.println(lst);
    }
}