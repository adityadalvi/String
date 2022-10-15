//24) Write a program to print after removing duplicates from a given string
public class A1C24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//you arevgdstnY
		String str="you are very very good studentsY";
		String strn="";
		for (int i = 0; i <str.length(); i++)
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
			if(cnt==0)
			{
				strn=strn+str.charAt(i);
			}
		}
		System.out.println(strn);
		
		//recursion
		/*String str="You are very very good students";
		String str2="";
		int i=0;
		str2=loopi(i,str,str2);
		System.out.println(str2);
		
	}

	private static String loopi(int i, String str, String str2) {
		// TODO Auto-generated method stub
		if(i<str.length())
		{
			int cnt=0;
			int j=0;
			cnt=loopj(i,j,cnt,str,str2);
			if(cnt==0)
			{
				str2=str2+str.charAt(i);
			}
			i++;
			return loopi(i, str, str2);
		}
		return str2;
		
	}

	private static int loopj(int i, int j, int cnt, String str, String str2) {
		// TODO Auto-generated method stub
		if(j<i)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				cnt++;
				
			}
			j++;
			return loopj(i, j, cnt, str, str2);
		}
		return cnt;*/
		
	}

}
