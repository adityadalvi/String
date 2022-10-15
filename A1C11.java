//11) Write a program to compare two strings lexicographically, ignoring case differences.
public class A1C11 {

	public static void main(String[] args)
	{
		/*String s1="abcd";
		String s2="ABCD";
		int res=myMtd(s1,s2);
		System.out.println(res);
	}
	private static int myMtd(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		for (int i = 0; i < s1.length()&&i<s2.length(); i++) 
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();	
	}*/
		
		String s1="abcd";
		String s2="abck";
		int res=myMtd(s1,s2);
		System.out.println(res);
	}
	private static int myMtd(String s1,String s2)
	{
		int i=0;
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		return loopi(i,s1,s2);
		
	}
	private static int loopi(int i, String s1,String s2)
	{
		if(i<s1.length()&&i<s2.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
			i++;
			return loopi(i, s1, s2);
		}
		return s1.length()-s2.length();
	}

}
