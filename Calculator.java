import java.util.*;
import java.io.*;
class Calculator
{
void main()
{
System.out.println("\n");
Scanner s=new Scanner(System.in);
System.out.println("Please enter your choice");
System.out.println("Press 1 to add two numbers");
System.out.println("Press 2 to subtract two numbers");
System.out.println("Press 3 to multiply two numbers");
System.out.println("Press 4 to divide two numbers");
System.out.println("Press 5 for exponential of two numbers");
int choice=s.nextInt();
int ch=0;
double a=0;
double b=0;
double ans=0;
if(choice==1)
{
System.out.println("Please enter the first number");
a=s.nextDouble();
System.out.println("Please enter the first number");
b=s.nextDouble();
ans=a+b;
System.out.println("The answer is "+ans);
System.out.println();
System.out.println("Press 1 to continue");
System.out.println("Press 2 to exit");
ch=s.nextInt();
if(ch==1)
main();
else
System.exit(0);
}
if(choice==2)
{
System.out.println("Please enter the first number");
a=s.nextDouble();
System.out.println("Please enter the first number");
b=s.nextDouble();
ans=a-b;
System.out.println("The answer is "+ans);
System.out.println();
System.out.println("Press 1 to continue");
System.out.println("Press 2 to exit");
ch=s.nextInt();
if(ch==1)
main();
else
System.exit(0);
}
if(choice==3)
{
System.out.println("Please enter the first number");
a=s.nextDouble();
System.out.println("Please enter the first number");
b=s.nextDouble();
ans=a*b;
System.out.println("The answer is "+ans);
System.out.println();
System.out.println("Press 1 to continue");
System.out.println("Press 2 to exit");
ch=s.nextInt();
if(ch==1)
main();
else
System.exit(0);
}
if(choice==4)
{
System.out.println("Please enter the first number");
a=s.nextDouble();
System.out.println("Please enter the first number");
b=s.nextDouble();
ans=a/b;
System.out.println("The answer is "+ans);
System.out.println();
System.out.println("Press 1 to continue");
System.out.println("Press 2 to exit");
ch=s.nextInt();
if(ch==1)
main();
else
System.exit(0);
}
if(choice==5)
{
System.out.println("Please enter the base");
a=s.nextDouble();
System.out.println("Please enter the power");
b=s.nextDouble();
ans=1;
for(int i=1;i<=b;i++)
{
ans=ans*a;
}
System.out.println("The answer is "+ans);
System.out.println();
System.out.println("Press 1 to continue");
System.out.println("Press 2 to exit");
ch=s.nextInt();
if(ch==1)
main();
else
System.exit(0);
}
}
}


