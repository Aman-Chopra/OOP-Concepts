import java.io.*;
import java.util.*;
class Jconv
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter integer");
int i=s.nextInt();
System.out.println("Enter double");
double d=s.nextDouble();
System.out.println("Enter char");
char c=s.next().charAt(0);
byte b=(byte)i;
int g=c;
byte bw=(byte)d;
int gw=(int)d;
System.out.println("Int to byte "+b);
System.out.println("Char to int "+g);
System.out.println("Double to byte "+bw);
System.out.println("Double to int "+gw);
}
}
