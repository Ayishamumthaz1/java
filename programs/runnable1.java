import java.util.Scanner;
class Fibonacci implements Runnable
{	int a;
	Fibonacci(int x)
	{
		a=x;
	}
	

	public void run()
	{
		int n1=0,n2=1;
		System.out.println("fibonacci series:");
		for(int i=0;i<a;i++)
		{
			
			System.out.println("fibonacci: "+n1);
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Even implements Runnable
{	int l;
	Even(int b)
	{
		l=b;
	}
	public void run()
	{
		
		System.out.println("even numbers up to limit"+l);
		for(int i=1;i<=l;i++)
		{
			if(i%2==0)
			{
				System.out.println("even numbers: "+i);
			}
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		}	
	}
}
class Main14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit of fibonacci series:");
		int n=sc.nextInt();
		System.out.println("enter the limit of even number:");
		int l=sc.nextInt();
		Fibonacci f1=new Fibonacci(n);
		Thread t1=new Thread(f1,"first");
		Even e1=new Even(l);
		Thread t2=new Thread(e1,"second");
		t1.start();
		t2.start();
	}
}