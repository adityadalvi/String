//10) Write a program to compare two strings lexicographically.
public class A1C10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Abcd";
		String s2="abcd";
		int res=myMtd(s1,s2);
		System.out.println(res);
	

	
		
	}

	private static int myMtd(String s1, String s2) {
		// TODO Auto-generated method stub
		int i=0;
		return loopi(i,s1,s2);
		/*for (int i = 0; i < s1.length()&&i<s2.length(); i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();*/
	}

	private static int loopi(int i, String s1, String s2) {
		// TODO Auto-generated method stub
		if(i < s1.length()&&i<s2.length())
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

