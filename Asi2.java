//2) Write a program to create a new String object with the contents of a character array
public class Asi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'A','D','I','T','Y','A'};
		String str="";
		for (int i = 0; i < ch.length; i++) 
		{
			str=str+ch[i];
		}
		System.out.println(str);
	}

}
