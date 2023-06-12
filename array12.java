import java.util.Scanner;
class Student
{int n,mark,i;
String name;
Scanner sc=new Scanner(System.in);
Student s1[]=new Student[2];

void read()
{
System.out.println("enter rollno:");
n=sc.nextInt();
System.out.println("enter name:");
name=sc.next();
System.out.println("enter mark:");
mark=sc.nextInt();
}

class Sports
{
int point;
String sname;
Scanner sc=new Scanner(System.in);


void get()
{
System.out.println("enter sports name:");
sname=sc.next();
System.out.println("enter activity point:");
point=sc.nextInt();
}
void show()
{
for(i=0;i<2;i++)
{System.out.println(" Roll no:"+n);
System.out.println(" name:"+name);
System.out.println(" mark:"+mark);

System.out.println("sports name:"+sname);
System.out.println("activity point:"+point);
}}}}
class Main6

{
public static void main(String args[])
{int i
Student r1[]=new Student[2];
Sports r2[]=new Sports[2]
r1[i]=new Student();

-- INSERT --                            