//12) Write a program to check whether a given string starts with the contents of another string
public class A1C12impli {

	public static void main(String[] args)
	{
		String str="Aditya";
		String str2="";
		//System.out.println(str.startsWith(str2));
		if(str2.length()<=str.length())
		{
			int cnt=0;
			int i=0;
			cnt=loopi(i,cnt,str,str2);
			/*for (int i = 0; i <str2.length(); i++)
			{
				if(str2.charAt(i)==str.charAt(i))
				{
					cnt++;
				}
			}*/
			if(cnt==str2.length())
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

	private static int loopi(int i, int cnt, String str, String str2) {
		// TODO Auto-generated method stub
		if(i <str2.length())
		{
			if(str2.charAt(i)==str.charAt(i))
			{
				cnt++;
			}
			i++;
			return loopi(i, cnt, str, str2);
		}
		return cnt;
		
	}

}
