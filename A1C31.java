//31) Write a program to find frequency of character in a string
public class A1C31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="eacdaaabcacbbddde";
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
				System.out.println(str.charAt(i)+" "+cnt1);
			}


		}

		//recursion
		/*String str="abcdabcaba";
		int i=0;
		loopi(i,str);
	}

	private static void loopi(int i, String str) {
		// TODO Auto-generated method stub
		if(i<str.length())
		{
			int cnt=0;
			int j=0;
			cnt=loopj(i,j,cnt,str);
			int cnt1=0;
			if(cnt==0)
			{
				int j1=0;
				cnt1=loopj1(i,j1,str,cnt1);
				System.out.println(str.charAt(i)+" "+cnt1);
			}
			i++;
			loopi(i, str);
		}

	}

	private static int loopj1(int i,int j1, String str, int cnt1) {
		// TODO Auto-generated method stub
		if(j1<str.length())
		{
			if(str.charAt(i)==str.charAt(j1))
			{
				cnt1++;
			}
			j1++;
			return loopj1(i,j1, str, cnt1);
		}
		return cnt1;
		
	}

	private static int loopj(int i, int j, int cnt, String str) {
		// TODO Auto-generated method stub
		if(j<i)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				cnt++;
			}
			j++;
			return loopj(i, j, cnt, str);
		}
		return cnt;*/
			
		
	}

}


