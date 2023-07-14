package Arithmetic;
import java.util.Scanner;
interface operation3
{
	public void display(int a,int b);	
}
public class Mul implements operation3
{
	
	public void display(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplication:"+c);
	}
}