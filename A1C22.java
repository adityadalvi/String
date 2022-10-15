/*
22) Write a program to reverse every word in a string usingmethods.
 {i/p: You all are very very very good students
o/p1: students good very very very are all you
o/p2: uoY lla era yrev yrev yrev doog stneduts
 o/p3: stneduts doog yrev yrev yrev era lla uoY}
 */
public class A1C22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="You all are very very very good students";
		String[] s=str.split(" ");
		//students good very very very are all You
		/*String str2="";
		int i=0;
		int j=s.length-1;
		while(i<j)
		{
			String temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
		for (int j2 = 0; j2 < s.length; j2++) 
		{
			System.out.print(s[j2]+" ");
		}*/
		// uoY lla era yrev yrev yrev doog stneduts
		String str3="";
		//2
		for(int i=0;i<s.length;i++)
		{
			char[] ch=s[i].toCharArray();
			for (int j = 0; j < s.length; j++) 
			{
				for (int j2 = j+1; j2 < ch.length; j2++)
				{
					char temp=ch[j];
					ch[j]=ch[j2];
					ch[j2]=temp;
				}
			}
			String str2=new String(ch);
			str3=str3+str2+" ";
			
		}
		System.out.println(str3);
		
		//3==1+2
		/*String str4="";
		for(int i=0;i<s.length;i++)
		{
			char[] ch=s[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				for (int j2 = j+1; j2 < ch.length; j2++)
				{
					char temp=ch[j];
					ch[j]=ch[j2];
					ch[j2]=temp;
				}
			}
			String str2=new String(ch);
			str4=str4+str2+" ";
		}
		System.out.println(str4);*/
		
		
		
		
		
		
	}
}



