
public class A1C28_dict {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a= "Aditya Ravindra Dalvi aditya";
		String[] s=a.split(" ");
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = i+1; j < s.length; j++)
			{
				if(myMtd(s[i],s[j])>0)
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
		}
	}
	private static int myMtd(String s1,String s2)
	{
		//s1=s1.toLowerCase();----------------------------------ignore case
		//s2=s2.toLowerCase();----------------------------------ignore case
		for(int i=0;i<s1.length()&&i<s2.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}
		
}


