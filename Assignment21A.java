package assignments;
class One
{
	static void Addition()
	{
		int a=12;
		int b=21;
		int c=a+b;	
		System.out.println(c);
	}
}
class Two extends One
{
	static void Sub()
	{
		int d=55;
		int e=22;
		int f=d-e;
		System.out.println(f);
	}
}
public class Assignment21A extends Two
{
	static void mul()
	{
		int g=11;
		int h=2;
		int i=g*h;
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		Addition();
		Sub();
		mul();
	}
}
