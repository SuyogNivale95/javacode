package string_stringbuffer_stringbuilder;

public class String_Buffer_Builder 
{
	public static void main(String[] args) 
	{
		String s=new String("Suyog");
		s.concat("Nivale");
		System.out.println(s);
		//Immutable
		StringBuffer s1=new StringBuffer("Suyog");
		s1.append(" Nivale");
		System.out.println(s1);
		//Mutable
		StringBuilder s2=new StringBuilder("Aditi");
		s2.append(" Suyog");
		System.out.println(s2);
		//Mutable
	}
}
