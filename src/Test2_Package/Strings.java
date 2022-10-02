package Test2_Package;

public class Strings {

	public static void main(String[] args) {
		String str="Welcome to indus 2014 chenna 98480235898 vikramr athod";
		//int a=str.length();
		String b="";
		String c="";
		for(int i = 0;i<str.length(); i++)
		{
			b=str.substring(i,(i+1));	
			
			if(b.matches("-?\\d+(\\.\\d+)?"))
		
			{
				c=c+b;
			}
		
		}
		System.out.println(c);
	}

	}
