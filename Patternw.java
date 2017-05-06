import java.io.*;
import java.util.*;
class Patternw
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter the number of row");
int n=s.nextInt();
int a[]=new int[n];
int g=2;
int le=2;
int count=0;
String st[]=new String[n];
st[0]="1";
st[1]="11";
if(n==1)
System.out.println("1");
else if(n==2)
System.out.println("11");
else
{
while(n>g)
{
count=0;
for(int i=0;i<le-1;i+=count)
{
for(int j=i+1;j<le;j++)
{
if(st[g-1].charAt(i)==st[g-1].charAt(j))
{
count++;
}
else 
break;
g++;
st[g]+=Integer.toString(count)+st[g].charAt(i);
}
}
le=st[g].length();
}
}
System.out.println(st[g]);
}
}




