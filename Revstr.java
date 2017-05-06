import java.util.*;
class Revstr
{
Scanner s=new Scanner(System.in);
String Str;
String Revst=" ";
public void getstr()
{
System.out.println("Please enter the String");
Str=s.nextLine();
Str=Str.toLowerCase();

recReverse(Str);
check();
}
public void recReverse(String l)
{
int len=l.length();
if(len<=1)
Revst=Revst+l.charAt(0);
else{
Revst=Revst+l.charAt(len-1);
String ztr=" ";
ztr=ztr+l.substring(0,len-1);
ztr=ztr.trim();
recReverse(ztr);
}}
public void check()
{
Revst=Revst.trim();
System.out.println("Orignal String is-"+" "+Str);
System.out.println("Reverse String is-"+" "+Revst);
if(Str.equalsIgnoreCase(Revst))
{
System.out.println("Pallindrome");
}
else
System.out.println("Not a Pallindrome");
}}
//Aman Chopra 
//12th Science

