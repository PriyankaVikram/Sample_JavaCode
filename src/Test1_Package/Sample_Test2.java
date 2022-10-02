package Test1_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sample_Test2 {
	public static void main(String args[])
	{
	
	String[]arr= {"x","a","b","c"};
	for(String str:arr)
	{
		System.out.println("Print the values in the array="+str);
	}
	ArrayList al=new ArrayList(Arrays.asList(arr));
	Collections.sort(al);
	System.out.println("Print the Arraylist in ascending order"+al);
	Collections.reverse(al);
	System.out.println("Print the Arraylist in Decending order"+al);
	Collections.shuffle(al);
	System.out.println("Print the Arralylist in Randome order"+al);

}	}