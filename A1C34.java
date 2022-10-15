//34) Write a program to count and print all the duplicates in the inputstring
public class A1C34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="csgcchjchydscmcjucwa";
		String s="";
		for (int i = 0; i < str.length(); i++)
		{
			int cnt=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					cnt++;
					break;
				}
			}
			if(cnt!=0)
			{
				s=s+str.charAt(i);
			}
		}
		System.out.println(s.length()+"\n"+s);
	}

}
