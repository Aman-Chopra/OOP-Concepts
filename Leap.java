import java.io.*;
import java.util.*;
class Leap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the year");
int yr=s.nextInt();
boolean a;
if(yr%4!=0)
a=false;
else if(yr%100!=0)
a=true;
else if(yr%400!=0)
a=false;
else 
a=true;
if(a==true)
System.out.println("It is a leap year");
else
System.out.println("It is not a leap year");
}
}
