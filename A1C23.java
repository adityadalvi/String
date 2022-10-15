//23) Write a program to delete all extra blank spaces in a string by the user.
public class A1C23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="     Aditya      Ravindra      Dalvi    ";
		int i=0;
		int j=str.length()-1;
		while(true)
		{
			if(str.charAt(i)==' ')
			{
				i++;
			}
			else
			{
				break;
			}
		}
		while(true)
		{
			if(str.charAt(j)==' ')
			{
				j--;
			}
			else
			{
				break;
			}
		}
		String str2="";
		for(int k=i;k<=j;k++)
		{
			if(str.charAt(k)==' '&&str.charAt(k+1)==' ')
			{
				
			}
			else
			{
				str2=str2+str.charAt(k);
			}
		}
		System.out.println(str2);

	}

}
