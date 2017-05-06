import java.io.*;
import java.util.*;
class Tern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter the first number");
int a=s.nextInt();
System.out.println("Please enter the first number");
int b=s.nextInt();
System.out.println("Please enter the first number");
int c=s.nextInt();
int largest=((a>b)?(a>c?a:c):(b>c?b:c));
int smallest=((a<b)?(a<c?a:c):(b<c?b:c));
System.out.println("The largest number is "+largest);
System.out.println("The smallest number is "+smallest);
}
}

