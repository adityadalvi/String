//7) Write a program to repeat each of the character twice in a given string
public class Asi7 {

	public static void main(String[] args) 
	{
		String str="abcd";
		String str2="";
		int i=0;
		str2=loopi(i,str,str2);
		/*for (int i = 0; i <str.length(); i++) 
		{
			char c=str.charAt(i);
			str2=str2+c+c;
		}*/
		System.out.println(str2);
		
	}

	private static String loopi(int i, String str, String str2) {
		// TODO Auto-generated method stub
		if(i<str.length())
		{
			char c=str.charAt(i);
			str2=str2+c+c;
			i++;
			return loopi(i, str, str2);
		}
		return str2;
		
	}

}
