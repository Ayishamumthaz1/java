import java.util.Scanner;
class Rev
{
public static void main(String args[])
{
int i=0,r;
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
int n=input.nextInt();
while(n!=0)
{
r=n%10;
i=i*10+r;
n=n/10;
}
System.out.println(i);
}
}
