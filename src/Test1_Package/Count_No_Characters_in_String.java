package Test1_Package;

public class Count_No_Characters_in_String {
	
	public static void main(String args[])
	{
		String str="Vikram Working in Value Momentum";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			count++;
	    }
        System.out.println("Total number of characters in a string: " + count);    
        
	}
}