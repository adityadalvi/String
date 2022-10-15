//27) Write a program to sort in ascending and descending order by length of the given array of strings
public class A1C27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to the world of java";
		//to of the java world Welcome 
		String[] s=str.split(" ");
		/*for (int i = 0; i < s.length; i++) 
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
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(s[i]+" ");
		}*/
		int i=0;
		loopi(i,s);
		int j2=0;
		loopj2(j2,s);
	}
	private static void loopj2(int j2, String[] s) {
		// TODO Auto-generated method stub
		if(j2<s.length)
		{
			System.out.print(s[j2]+" ");
			j2++;
			loopj2(j2, s);
		}
		
	}
	private static void loopi(int i,String[] s)
	{
		if(i<s.length)
		{
			int j=i+1;
			loopj(i,j,s);
			i++;
			loopi(i,s);
			
		}
	}
	private static void loopj(int i, int j, String[] s)
	{
		if(j<s.length)
		{
			if(s[i].length()>s[j].length())
			{
				String temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
			j++;
			loopj(i,j,s);
		}
	}

}
