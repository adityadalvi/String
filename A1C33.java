//33) Write a program to find the second most frequent character in a given string
public class A1C33 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="aabbbccccddddd";
		String str2="";
		int max=0;
		char ch=' ';
		for (int i = 0; i < str.length(); i++)
		{
			int cnt=0;
			for (int j = 0; j < i; j++) 
			{
				if(str.charAt(i)==str.charAt(j))
				{
					cnt++;
				}
			}
			int cnt1=0;
			if(cnt==0)
			{

				for (int j = 0; j < str.length(); j++) 
				{
					if(str.charAt(i)==str.charAt(j))
					{
						cnt1++;
					}
				}
				if(max<cnt1)
				{
					max=cnt1;
				}

			}
		}
		int max1=0;
		for (int i = 0; i < str.length(); i++)
		{
			int cnt=0;
			for (int j = 0; j < i; j++) 
			{
				if(str.charAt(i)==str.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				int cnt2=0;
				for (int j = 0; j < str.length(); j++) 
				{
					if(str.charAt(i)==str.charAt(j))
					{
						cnt2++;
					}
				}
				if(cnt2!=max&&cnt2>max1)
				{
					max1=cnt2;
					ch=str.charAt(i);
				}

			}
		}
		System.out.println(max1+" "+ch);
		

	}
}
