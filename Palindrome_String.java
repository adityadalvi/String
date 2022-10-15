
public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdedcba";
		/*int i=0;
		int j=s1.length()-1;
		boolean isItPalindrome=true;
		while(i<j)
		{
			if(s1.charAt(i)!=s1.charAt(j))
			{
				isItPalindrome=false;
				break;
			}
			i++;
			j--;
		}
		if(isItPalindrome)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}*/
		
		String s2="";
		for (int i = s1.length()-1; i >=0; i--) 
		{
			s2=s2+s1.charAt(i);
		}
		boolean res=s1.equals(s2);
		if(res)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
