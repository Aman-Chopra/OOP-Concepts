import java.io.*;
import java.util.*;
class sq
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter the number");
double n=s.nextDouble();
double ans=square(n);
System.out.println("Square :- "+ans);
}
public static double square(double a)
{
double as=a*a;
return as;
}
}