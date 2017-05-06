import java.util.*;
import java.io.*;
class Patse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number n of pattern");
int n=s.nextInt();
int k=1;
for(int i=0;i<n;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(k+" ");
k++;
}
System.out.println();
} 
}
}