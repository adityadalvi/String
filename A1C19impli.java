//19) Write a program to convert all the characters in a string tolowercase
public class A1C19impli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="AdITya";
		/*String str="";
		for (int i = 0; i <s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				str=str+(char)(ch+32);
			}
			else
			{
				str=str+ch;
			}
		}
		System.out.println(str);*/
		int i=0;
		String str="";
		str=loopi(i,s1,str);
		System.out.println(str);
	}

	private static String loopi(int i, String s1, String str) {
		// TODO Auto-generated method stub
		if(i<s1.length())
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				str=str+(char)(ch+32);
			}
			else
			{
				str=str+ch;
			}
			i++;
			return loopi(i, s1, str);
		}
		return str;
		
	}
}
