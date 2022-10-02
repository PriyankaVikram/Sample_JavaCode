package Test1_Package;

public class Sample_Test1 {
	
	public static void main(String args[])
	{
		String str="hfjadfhasfhj adhfhhhhadfas virkam@gmail.com fahfjadhsfhah vihas@gmail.com fadfhajdshfah vijra@gmail.com";
		String [] str1=str.split(" ");
		for(String str2:str1)
		{
			if(str2.contains("gmail.com"))
			{
				System.out.println("Print the text which contains gmail="+str2);
			}
		}
	}


}
