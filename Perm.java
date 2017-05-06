import java.io.*;
import java.util.*;
class Perm
{
public static void main()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the four digit number");
int n=s.nextInt();
char ar[]=new char[4];
String st=Integer.toString(n);
ar[0]=st.charAt(0);
ar[1]=st.charAt(1);
ar[2]=st.charAt(2);
ar[3]=st.charAt(3);
int count=0;
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
for(int k=0;k<4;k++)
{
for(int l=0;l<4;l++)
{
System.out.print(ar[i]);
System.out.print(ar[j]);
System.out.print(ar[k]);
System.out.print(ar[l]);
System.out.println();
count++;
}
}
}
}
System.out.println(count);
}
}

