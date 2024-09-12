package overriding;

public class OverLoad_MainMethod_NonStatic 
{
	void main()
	{
		System.out.println("1");
	}
	void main(String d)
	{
		System.out.println("2");
	}
	void main(char e)
	{
		System.out.println("3");
	}
	void main(int c)
	{
		System.out.println("4");
	}

	public static void main(String[] args)
	{
		OverLoad_MainMethod_NonStatic o1=new OverLoad_MainMethod_NonStatic();
		o1.main();
		o1.main("Suyog");
		o1.main('G');
		o1.main(12);
	}
}
