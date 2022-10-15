//13) Write a program to check whether a given string ends with the contents of another string.
public class A1C13impli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Aditya";
		String s2="ya";
		//System.out.println(s1.endsWith(s2));\
		if(s2.length()<=s1.length())
		{
			int cnt=0;
			int s1ind=s1.length()-1;
			int s2ind=s2.length()-1;
			int i=0;
			cnt=loopi(i,s1ind,s2ind,cnt,s1,s2);
			/*for (int i = 0; i <s2.length(); i++)
			{
				if(s1.charAt(s1ind)==s2.charAt(s2ind))
				{
					cnt++;
				}
				s1ind--;
				s2ind--;
				
			}*/
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

	private static int loopi(int i, int s1ind, int s2ind, int cnt, String s1, String s2) {
		// TODO Auto-generated method stub
		if(i <s2.length())
		{
			if(s1.charAt(s1ind)==s2.charAt(s2ind))
			{
				cnt++;
			}
			s1ind--;
			s2ind--;
			i++;
			return loopi(i, s1ind, s2ind, cnt, s1, s2);
		}
		return cnt;
		
	}
}
