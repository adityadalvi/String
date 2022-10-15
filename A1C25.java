//25) Write a program to remove a specified character from a given string (1. Using Concat 2. Using toCharArray)

public class A1C25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdbbdefh";
		char ch1='b';
		//char[] ch=str.toCharArray();
		String str2="";
		for (int i = 0; i <str.length(); i++) 
		{
			if(str.charAt(i)!=ch1)
			{
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);
		//recursion
		/*int i=0;
		str2=loopi(i,ch,ch1,str2);
		System.out.println(str2);
	}

	private static String loopi(int i, char[] ch, char ch1,String str2) {
		// TODO Auto-generated method stub
		if(i<ch.length)
		{
			if(ch[i]!=ch1)
			{
				str2=str2+ch[i];	
			}
			i++;
			return loopi(i, ch, ch1, str2);
		}
		return str2;*/

	}

}
