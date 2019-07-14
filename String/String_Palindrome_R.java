class String_Palindrome_R
{
    public static void main(String args[])
    {
        String str="";

        System.out.println(reverse_str(str));
    }

    static String reverse_str(String str)
    {
        if(str.length()==0)
            return "";
        
        return str.substring(str.length()-1) + reverse_str(str.substring(0, str.length()-1));
    }
}