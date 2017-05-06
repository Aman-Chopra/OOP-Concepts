import java.io.*;
import java.util.*;
class Seriest
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit n");
int n=s.nextInt();
double num=1;
double den=0;
double div=0;
double ans=0;
for(int i=1;i<=n;i++)
{
den=i;
div=num/den;
div=Math.pow(div,i);
ans=ans+div;
}
System.out.println("The answer is "+ans);
}
}