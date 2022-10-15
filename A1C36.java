
public class A1C36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdefgffhiabc";
		String max="";
		for (int i = 0; i < s.length(); i++)
		{
			String str="";
			for (int j = i; j < s.length(); j++) 
			{
				char ch=s.charAt(j);
				boolean new1=myMtd(str,ch);
				if(new1==false)
				{
					str=str+ch;
				}
				if(str.length()>max.length())
				{
					max=str;
				}
				else
				{
					break;
				}
			}
		}
		System.out.println(max);
	}

	private static boolean myMtd(String str, char ch) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i)==ch)
			{
				return true;
			}
		}
		return false;
	}
}

