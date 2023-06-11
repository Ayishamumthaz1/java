import java.util.Scanner;
interface a
{
int pid,pqnty,price,tot;
String pname;
void show();
void display():
}
class bill impliment a
{
public void show()
{
System.out.println("Product Id      Name      Quantity      unitnprice      Total");
}
{
public void display()
{
system.out.println(pid+"         "+pname+"        "+pqnty+"        "+price+"          "+tot);
}
class main
{public static void maain(String args[])
{
int pid,pqnty,price,tot;
String pname;
Scanner input=new Scanner(System.in)
bill arr[]=new bill[2];
for(i=0;i<2;i++)
{
system.out.println("enter product id");
int pid=input.nextInt();
system.out.println("enter product name");
String pname=input.next();
system.out.println("enter quantity");
int pqnty=input.nextInt();
system.out.println("enter unit price");
int price=input.nextInt();
system.out.println("enter Total");
int tot=input.nextInt();
tot=tot++;
}bill B=new bill();
System.out.println("Order No.");
System.out.println("Date:");
B.show();
System.out.println("_______________________________________________________________");
B1 arr[i]=new bill();
for(i=0;i<2;i++)
{B1.display();
}
System.out.println("_______________________________________________________________");
System.out.println("                                                                   Net.amount         "+tot);

}}