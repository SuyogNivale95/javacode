package overriding;
class Facebook
{
	void login()
	{
		System.out.println("Login with Mobile Number");
	}
}
public class Super_Keyword_program extends Facebook
{
	void login()
	{
		super.login();
		System.out.println("Login with Email ID");
	}

	public static void main(String[] args) 
	{
		Super_Keyword_program s1=new Super_Keyword_program();
		s1.login();
	}
}
