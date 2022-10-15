import java.util.Iterator;

public class String123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hi there, my name is rajendra";
		String[] a=s.split(" ");
		String str1="";
		for (int i = 0; i < a.length; i++) 
		{
			String s1=a[i];
			String str="";
			for (int j = 0; j < s1.length(); j++)
			{
				if(j==0)
				{
					str=str+(char)(s1.charAt(j)-32);
				}
				else
				{
					str=str+s1.charAt(j);
				}
			}
			String str2=new String(str);
			str1=str1+str2;
		}
		System.out.println(str1);

	}


}
