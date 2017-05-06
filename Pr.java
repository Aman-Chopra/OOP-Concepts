import java.util.*;
import java.io.*;
class Pr
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
boolean a;
System.out.println("List of prime numbers ");
int count=0;
int i=2;
while(count<n)
{
a=isPrime(i);
if(a==true)
{
System.out.print(i+" ");
count++;
}
i++;
}
}
public static boolean isPrime(int u)
{
int flag=0;
if(u==1)
return false;
else if(u==2)
return true;
else
{
for(int i=2;i<=(u/2);i++)
{
if(u%i==0)
{
flag=1;
break;
}
}
}
if(flag==1)
return false;
else 
return true;
}
}