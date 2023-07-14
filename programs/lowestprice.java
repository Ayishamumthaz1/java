import java.util.Scanner;
class Product
{
	int pcode,price;
	String pname;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product code:");
		pcode=sc.nextInt();
		System.out.println("enter product name:");
		pname=sc.next();
		System.out.println("enter product price:");
		price=sc.nextInt();
	}
}
class Main5
{
	public static void main(String args[])
	{
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		p1.read();
		p2.read();
		p3.read();
		if((p1.price<p2.price)&&(p1.price<p3.price))
		{
			System.out.println("product"+p1.pname+"has the lowest price"+p1.price);
		}
		else if(p2.price<p3.price)
		{
			System.out.println("product"+p2.pname+"has the lowest price"+p2.price);
		}
		else
		{
			System.out.println("product"+p3.pname+"has the lowest price"+p3.price);
		}
	}
}