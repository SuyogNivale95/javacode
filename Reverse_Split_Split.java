package Array;

import java.util.Arrays;

public class Reverse_Split_Split 
{
	public static void main(String[] args) 
	{
		String s1="Suyog";
		System.out.println(s1.repeat(12));
		
		String s2="I am a Boy";
		String[] a1=s2.split(" ");
		System.out.println(Arrays.toString(a1));
		
		String s3="I am a Girl";
		String[] a2=s3.split(" ", 2);
		System.out.println(Arrays.toString(a2));
	}
}
