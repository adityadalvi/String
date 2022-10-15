//26) Write a program to sort numbers in a String. Display the result as aString. E.g. if number in String is “43521” result is: “12345”. (April Monthly)

public class A1C26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="7536335";
		char[] ch=s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++)
		{
			for (int j = i+1; j < ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		String s=new String(ch);
		System.out.println(s);
		
		//recursion
		/*String s1="43521";
		char[] ch=s1.toCharArray();
		int i=0;
		ch=loopi(i,ch);
		String str2=new String(ch);
		System.out.println(str2);
		
	}

	private static char[] loopi(int i, char[] ch) {
		// TODO Auto-generated method stub
		if(i<ch.length)
		{
			int j=i+1;
			ch=loopj(i,j,ch);
			i++;
			return loopi(i,ch);
		}
		return ch;
		
	}

	private static char[] loopj(int i, int j, char[] ch) {
		// TODO Auto-generated method stub
		if(j<ch.length)
		{
			if(ch[i]>ch[j])
			{
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
			j++;
			return loopj(i, j, ch);
		}
		return ch;*/
	}

}
