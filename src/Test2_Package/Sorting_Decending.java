package Test2_Package;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_Decending {
	public static void main(String args[])
	{
		int[] arr= {1,2,3,4,5,6};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
			System.out.println("The Array is sorted in decending order");
			for( int i=0;i< arr.length;i++)
			System.out.print(arr[i] + " ");
	}
	}
		 
	
