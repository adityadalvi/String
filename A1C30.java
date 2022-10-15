//30) Write a program to find the maximum occurring character in a string
public class A1C30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="adaaabcacbbbbbbbbdddaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
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
					break;
				}
			}
			int cnt1=0;
			if(cnt==0)
			{
				for (int j1 = 0; j1 < str.length(); j1++) 
				{
					if(str.charAt(i)==str.charAt(j1))
					{
						cnt1++;
					}
				}
			}
			if(cnt1>max)
			{
				max=cnt1;
				ch=str.charAt(i);
			}
		}
		System.out.println(max+"\n"+ch);


		//recursion
		/*	String str="abcdabcaba";
		int max=0;
		char ch=' ';
		int i=0;
		Data obj=null;
		obj=loopi(i,max,ch,str,obj);
		System.out.println(obj.max+" "+obj.ch);

	}

	private static Data loopi(int i, int max, char ch, String str,Data obj) {
		// TODO Auto-generated method stub
		if(i<str.length())
		{
			int cnt=0;
			int j=0;
			cnt=loopj(i,j,cnt,max,str);
			int cnt1=0;
			if(cnt==0)
			{
				int j1=0;
				cnt1=loopj1(j1,i,j,cnt1,str);
				if(cnt1>max)
				{
					max=cnt1;
					ch=str.charAt(i);
					obj=new Data(max,ch);
				}

			}
			i++;
			return loopi(i, max, ch, str,obj);
		}
		return obj;

	}

	private static int loopj1(int j1, int i, int j, int cnt1, String str) {
		// TODO Auto-generated method stub
		if(j1<str.length())
		{
			if(str.charAt(i)==str.charAt(j1))
			{
				cnt1++;
			}
			j1++;
			return loopj1(j1, i, j, cnt1, str);
		}
		return cnt1;

	}

	private static int loopj(int i, int j, int cnt, int max, String str) {
		// TODO Auto-generated method stub
		if(j<i)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				cnt++;

			}
			j++;
			return loopj(i, j, cnt, max, str);
		}
		return cnt;*/


	}
}


/*class Data
{
	int max;
	char ch;
	Data(int max,char ch)
	{
		this.max=max;
		this.ch=ch;
	}
}*/