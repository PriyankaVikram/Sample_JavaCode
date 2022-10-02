package Test2_Package;

public class Duplicate_Characters_in__String {
	
	public static void main(String args[])
	{
		String str="Vikram Anuma";
		int length=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("The Duplicate Characters in the String is="+ch[j]);
				}
			}
		}
	}
}
