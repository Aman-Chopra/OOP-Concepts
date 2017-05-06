import java.io.*;
import java.util.*;
class Bitw
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int a=n>>1;
int b=n<<1;
System.out.println(n+"*2="+b);
System.out.println(n+"/2="+a);
}
}
