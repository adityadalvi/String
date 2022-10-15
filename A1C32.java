//32) Write a program to get lowest frequency of a character in a string
public class A1C32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome";
		int min=10000;
		char ch=' ';
		for (int i = 0; i < str.length(); i++) 
		{
			int cnt=0;
			for (int j = 0; j <i; j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				int cnt1=0;
				for (int j = 0; j < str.length(); j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						cnt1++;
					}
				}
				if(cnt1<min)
				{
					min=cnt1;
					ch=str.charAt(i);
				}

			}
		}
		System.out.println(min+" "+ch);

	}

}
