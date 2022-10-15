//20) Write a program to convert all the characters in a string touppercase.
public class A1C20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="adiTYa";
		String strn="";
//		String str2=str.toUpperCase();
//		System.out.println(str2);
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				strn=strn+(char)(ch-32);
			}
			else
			{
				strn=strn+str.charAt(i);
			}
		}
		System.out.println(strn);*/
		
		
		//recursion
		String str="adiTYa";
		String str2="";
		int i=0;
		str2=loopi(i,str,str2);
		System.out.println(str2);

	}

	private static String loopi(int i, String str, String str2) {
		// TODO Auto-generated method stub
		if(i<str.length())
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				str2=str2+(char)(ch-32);
			}
			else
			{
				str2=str2+ch;
			}
			i++;
			return loopi(i, str, str2);
		}
		return str2;
		
	}

}
