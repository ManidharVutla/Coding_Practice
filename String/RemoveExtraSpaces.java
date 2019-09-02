import java.util.*;
class RemoveExtraSpaces
{
    public static void main(String args[])
    {
        String str=" Hello  Manidhar    .      ";
        System.out.println(removeSpaces(str));
    }

    public static String removeSpaces(String str)
    {
        int n=str.length()-1, i=0, j=-1;
        boolean spaceFound=false;
        char arr[]=str.toCharArray();
        
        while(++j < n && arr[j]==' ');
        
        while(j<n)
        {
            if(arr[j]!=' ')
            {
                if((arr[j]=='.' || arr[j]=='?' || arr[j]==',' ) && i-1 >=0 && arr[i-1]==' ')
                {
                    arr[i-1]=arr[j++];
                }
                else
                {
                    arr[i++]=arr[j++];
                }
                spaceFound=false;
               
            }

            else if(arr[j++]==' ')
            {
                if(!spaceFound)
                {
                    arr[i++]=' ';
                    spaceFound=true;
                }
            }
             //System.out.println(arr[i]);
        }

        if(i<=1)
        {
            return new String(arr,0, i);
        }
        else{
            return new String(arr,0, i-1);
        }
        
    }
}