import java.util.Scanner;
class CPU
{
	int price;
	CPU(int price)
	{
		this.price=price;
	}
	class Processor
	{
		String m;
		int ncores;
		Processor(String m,int ncores)
		{
			this.m=m;
			this.ncores=ncores;
		}
		void display()
		{
			System.out.println("price:"+price);
			System.out.println("manufacturer:"+m);
			System.out.println("number of cores:"+ncores);
		}
	}
}
class RAM
{
	static int mem;
	static String mname;
	static void get(int a,String b)
	{
		mem=a;
		mname=b;
	}	
	static void display()
	{
		System.out.println("memmory"+mem);
		System.out.println("manufacturer:"+mname);
	}
}
class Main10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter price");
		int price=sc.nextInt();
		System.out.println("enter no of cores");
		int ncores=sc.nextInt();
		System.out.println("enter manufacturer:");
		String m=sc.next();
		System.out.println("enter size of memmory");
		int mem=sc.nextInt();
		System.out.println("enter manufacturer:");
		String mname=sc.next();
		CPU c1=new CPU(price);
		CPU.Processor p1=c1.new Processor(m,ncores);
		p1.display();
		RAM.get(mem,mname);
		RAM.display();
	}
}
	