package Test2_Package;

public class ReverseString
{
	public static void main(String args[])
	{
		String str="Viraj Anuma and Viahs Anuma";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		System.out.println("The String is reversed has"+reverse);
	}
}