
public class cipherExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCDZYXW";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			str2=str2+((char)(155-ch));
		}
		System.out.println(str2);

	}

}
