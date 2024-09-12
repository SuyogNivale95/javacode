package Array;

import java.util.Arrays;

public class String_Slipt 
{
	public static void main(String[] args) 
	{
		String s1="I am a Boy";
		String[] a1=s1.split(" ");
		System.out.println(Arrays.toString(a1));
		
		String s2="I am a Boy";
		String[] a2=s2.split(" ",3);
		System.out.println(Arrays.toString(a2));
	}
}
