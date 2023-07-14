import Arithmetic.*;
import java.util.Scanner;
class Main4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
		Arithmetic.Add a1=new Arithmetic.Add();
		Arithmetic.Sub s1=new Arithmetic.Sub();
		Arithmetic.Mul m1=new Arithmetic.Mul();
		Arithmetic.Div d1=new Arithmetic.Div();
		a1.display(a,b);
		s1.display(a,b);
		m1.display(a,b);
		d1.display(a,b);
	}
}
		