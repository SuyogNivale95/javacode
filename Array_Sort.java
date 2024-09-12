package Array;

import java.util.Arrays;

public class Array_Sort 
{
	public static void main(String[] args)
	{
		String name="suyog";
		char [] c1=name.toCharArray();
		//System.out.println(c1[4]);
		//System.out.println(Arrays.toString(c1));
		Arrays.sort(c1);                          //sort the array alphabetically
		System.out.println(Arrays.toString(c1));		
	}
}
