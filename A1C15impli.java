//14) Write a program to compare a given string to the specified character sequence.
public class A1C15impli {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1="Aditya";
		String s2="Aditya";
		/*int cnt=0;
		if(s1.length()==s2.length())
		{
			for (int i = 0; i < s1.length(); i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					cnt++;
				}
			}
			if(cnt==s2.length())
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			System.out.println(false);
		}*/
		
		//recursion
		int cnt=0;
		if(s1.length()==s2.length())
		{
			int i=0;
			cnt=loopi(i,s1,s2,cnt);
			
			if(cnt==s2.length())
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			System.out.println(false);
		}
		
	}

	private static int loopi(int i, String s1, String s2,int cnt) {
		// TODO Auto-generated method stub
		if(i<s1.length())
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				cnt++;
			}
			i++;
			return loopi(i, s1, s2,cnt);
		}
		return cnt;
		
	}

}
