package Test2_Package;

public class Missing_Number_In_Array {

	public static void main(String args[])
	{
	 int a[]= {1,2,3,4,6,7,8,9,10};
	  int sum=0;
	  for(int i=0;i<a.length;i++)
	  {
		  sum=sum+a[i];
	  }
	  int sum1=0;
	  for(int i=1;i<=10;i++)
	  {
		  sum1=sum1+i;
	  }
	  System.out.println("Missing Number in the array"+(sum1-sum));
	}
}
