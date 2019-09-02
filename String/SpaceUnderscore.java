class SpaceUnderscore
{
    public static void main(String args[])
    {
        String str="hello world manidhar";

        removeSpacebyUnderscore(str);
    }

    static void removeSpacebyUnderscore(String str)
    {
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==' ')
                arr[i]='_';
        }

        System.out.println(new String(arr));
    }
}