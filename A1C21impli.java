//21) Write a program to trim any leading or trailing whitespace from a givenstring
public class A1C21impli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="    Aditya              Ravindra Dalvi            ";
		//String str2=str.trim();
		//System.out.println(str2);
		String str2="";
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
		for (int j2 = i; j2 <= j; j2++) 
		{
			str2=str2+str.charAt(j2);
		}
		System.out.println(str2);
		
		

	}

}
