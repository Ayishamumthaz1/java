import java.util.Scanner;
class Invalid extends Exception
{
	Invalid(String m)
	{
		super(m);
	}
}
class Validation
{
	String username="ayisha";
	String password="abcd";
	
	void check(String u,String p) throws Invalid
	{
		
		if((u.equals(username))&&(p.equals(password)))
		{
			System.out.println("login");
		}
		else
		{
			throw new Invalid("invalid");
		}
	}
}
class Main1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			
			System.out.println("enter user name:");
			String u=sc.next();
			System.out.println("enter password:");
			String p=sc.next();
			Validation v=new Validation();
			v.check(u,p);
		}
		catch(Exception e)
		{
			System.out.println("exception cought"+e);
		}
	}
}


