package Test1_Package;

public class Duplicate_Numbers {
	public static void main(String args[])
	{
		int [] arr={4,3,2,1,4,3,5,6,7,4};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}

}
