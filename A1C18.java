//18) Write a program to replace all the 'd' characters with 'f'characters
public class A1C18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="Aditddddadkkdd";
		String str2="";
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i)=='d')
			{
				str2=str2+'f';
			}
			else
			{
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);*/
		
		//recursion
		String str="Aditddddadkkdd";
		String str2="";
		int i=0;
		str2=loopi(i,str,str2);
		System.out.println(str2);
	}

	private static String loopi(int i, String str, String str2) {
		// TODO Auto-generated method stub
		if(i<str.length())
		{
			if(str.charAt(i)=='d')
			{
				str2=str2+'f';
			}
			else
			{
				str2=str2+str.charAt(i);
			}
			i++;
			return loopi(i, str, str2);
		}
		return str2;
		
	}

}
