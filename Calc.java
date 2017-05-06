import java.util.*;
import java.io.*;
class Calc
{
public static void main(String[] args)
{
System.out.println("\n");
Scanner s=new Scanner(System.in);
double a=0;
double b=0;
char choice;
double ans=0;
char ch;
do
{
System.out.println("Please enter the first number");
a=s.nextDouble();
System.out.println("Please enter the first number");
b=s.nextDouble();
System.out.println("Please enter your choice");
System.out.println("Press + to add two numbers");
System.out.println("Press - to subtract two numbers");
System.out.println("Press * to multiply two numbers");
System.out.println("Press / to divide two numbers");
System.out.println("Press ^ for exponential of two numbers");
choice=s.next().charAt(0);
switch(choice)
{
case '+' :
ans=a+b;
System.out.println("The answer is "+ans);
System.out.println();
System.out.println("Press y to continue");
System.out.println("Press n to exit");
ch=s.next().charAt(0);
break;
case '-' :
ans=a-b;
System.out.println("The answer is "+ans);
System.out.println();
System.out.println("Press y to continue");
System.out.println("Press n to exit");
ch=s.next().charAt(0);
break;
case '*' :
ans=a*b;
System.out.println("The answer is "+ans);
System.out.println();
System.out.println("Press y to continue");
System.out.println("Press n to exit");
ch=s.next().charAt(0);
break;
case '/' :
ans=a/b;
System.out.println("The answer is "+ans);
System.out.println();
System.out.println("Press y to continue");
System.out.println("Press n to exit");
ch=s.next().charAt(0);
break;
case '^' :
ans=1;
for(int i=1;i<=b;i++)
{
ans=ans*a;
}
System.out.println("The answer is "+ans);
System.out.println();
System.out.println("Press y to continue");
System.out.println("Press n to exit");
ch=s.next().charAt(0);
break;
default :
System.out.println("Please enter a valid choice");
ch='y';
}
}while(ch=='y');
}
}


