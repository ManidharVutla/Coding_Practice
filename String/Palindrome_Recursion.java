class Palindrome_Recursion
{
    public static void main(String args[])
    {
        String str="madam";

        System.out.println(isPalindrome(str, 0, str.length()-1));
    }

    static boolean isPalindrome(String str, int i, int j)
    {
        if(i>j) return true;
        
        return str.charAt(i) == str.charAt(j) && isPalindrome(str, ++i, --j);
        
    }
}