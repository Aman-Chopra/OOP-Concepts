import java.io.*;
import java.util.*;
class Res
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of a");
int a=s.nextInt();
System.out.println("Enter the value of a");
int b=s.nextInt();
double ans=(a<<2)+(b>>2);
boolean ans1=(b>0);
double ans2=(a+b*100)/10;
double ans3=a&b;
System.out.println("Answers :");
System.out.println(ans);
System.out.println(ans1);
System.out.println(ans2);
System.out.println(ans3);
}
}
