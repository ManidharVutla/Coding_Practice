import java.util.*;
class LetterCommbinatons {
	public static List<String>  letterCombinations(String digits)
	{
		LinkedList <String> ans = new LinkedList<String>();
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");

		for(int i=0;i<digits.length();i++)  // This for loop is for traversing through the digits number given
		{
			int x = Character.getNumericValue(digits.charAt(i));

			while(ans.peek().length()==i) // This loop is for removing from the list and
			{
				String t=ans.remove();
				for(char s: mapping[x].toCharArray())
					ans.add(t+s);
			}
		}
		return ans;
	}

	public static void main(String args[])
	{
		String digits= "23";
		List<String> result=new LinkedList<String>();

		result= letterCombinations(digits);

		System.out.println(result);
	}
}
