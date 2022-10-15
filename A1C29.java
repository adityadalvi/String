//29) Write a program to find largest & smallest word in a string
public class A1C29 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="Welcome to the world of java";
		String[] s=str.split(" ");
		for (int i = 0; i < s.length; i++)
		{
			for (int j = i+1; j < s.length; j++)
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("small:"+s[0]);
		System.out.println("larg:"+s[s.length-1]);



	}

}
