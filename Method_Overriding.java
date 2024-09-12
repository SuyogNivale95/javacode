package overriding;
class Google
{
	void Login()
	{
		System.out.println("Login with Mobile Number");
	}
}
public class Method_Overriding extends Google
{
	void Login()
	{
		System.out.println("Login with Email ID");
	}
	public static void main(String[] args)
	{
		Method_Overriding m1=new Method_Overriding();   //parent class is getting overridden 
		m1.Login();
	}
}
