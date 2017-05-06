import java.util.*;
import java.io.*;
class Rect
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
double area=0;
double circ=0;
System.out.println("Enter length of the rectangle");
int l=s.nextInt();
System.out.println("Enter breadth of the rectangle");
int b=s.nextInt();
area=l*b;
circ=2*(l+b);
System.out.println("Area : "+area);
System.out.println("Circumference : "+circ);
}
}