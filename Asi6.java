//6) Write a program to get the index of all the characters of thealphabet
public class Asi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ADITYA";
		int i=0;
		loopi(i,str);
		/*for (int i = 0; i < str.length(); i++)
		{
			System.out.println(str.charAt(i)+" "+i);
		}*/
		
	}
	private static void loopi(int i, String str)
	{
		if(i<str.length())
		{
			System.out.println(str.charAt(i)+" "+i);
			i++;
			loopi(i, str);
		}
	}

}
