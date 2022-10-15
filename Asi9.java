//9) Write a program to return the sum of the digits present in the given string.If there is no digits the sum return is 0
public class Asi9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="12jjj34hag";
		/*int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				sum=sum+(char)(ch-48);
			}
		}
		System.out.println(sum);*/
		
		int i=0;
		int sum=0;
		sum=loopi(i,sum,str);
		System.out.println(sum);
		
	}

	private static int loopi(int i, int sum,String str) {
		// TODO Auto-generated method stub
		if(i<str.length())
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				sum=sum+(char)(ch-48);
			}
			
			i++;
			return loopi(i, sum, str);
		}
		return sum;
		
	}
}
