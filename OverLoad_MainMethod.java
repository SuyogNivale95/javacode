package overriding;

public class OverLoad_MainMethod 
{
	public static void main()
	{
		System.out.println("1");
	}
	public static void main(String a)
	{
		System.out.println("2");
	}
	public static void main(char s)
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		main();
		main("Suyog");
		main('S');
	}
}
