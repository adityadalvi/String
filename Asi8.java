//8) Write a program to test if a given string contains only digits
public class Asi8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="123p7";
		int cnt=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				cnt=0;
			}
			else
			{
				cnt++;
				break;
			}
		}
		if(cnt==0)
		{
			System.out.println("String contains only digits");
		}
		else
		{
			System.out.println("String contains other characters also");
		}*/
		
//recursion
		String str="123p7";
		int i=0;
		int cnt=0;
		cnt=loopi(i,str,cnt);
		if(cnt==0)
		{
			System.out.println("String contains only digits");
		}
		else
		{
			System.out.println("String contains other characters also");
		}

	}

	private static int loopi(int i, String str, int cnt) {
		// TODO Auto-generated method stub
		if(i<str.length())
		{
			char ch=str.charAt(i);
			if(ch<'0'||ch>'9')
			{
				cnt++;
			}
			i++;
			return loopi(i,str,cnt);
		}
		return cnt;
		
	}

}
