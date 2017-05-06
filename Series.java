import java.io.*;
import java.util.*;
class Series
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit n");
int n=s.nextInt();
System.out.println("Enter the value of x");
int x=s.nextInt();
double num=0;
double den=0;
double div=0;
double ans=0;
int m=1;
int l=1;
for(int i=1;i<=n;i++)
{
num=Math.pow(x,l);
num=num*m;
den=fact(l);
div=num/den;
ans=ans+div;
m=-m;
l+=2;
}
System.out.println("The answer is "+ans);
}
public static double fact(int u)
{
double fac=1;
for(int i=1;i<=u;i++)
fac*=i;
return fac;
}
}