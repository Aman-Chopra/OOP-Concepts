import java.util.*;
import java.io.*;
class Sumanu
{
public void main()
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter the string");
String st=s.next();
int l=st.length();
String fi=ChangeCase(st,l);
System.out.println(fi);
}
public String ChangeCase(String st,int ll)
{
char a;
String fii="";
for(int i=0;i<ll;i++)
{
a=st.charAt(i);
if((int)a>=65 && (int)a<=90)
fii+=Character.toLowerCase(a);
else
fii+=Character.toUpperCase(a);
}
return fii;
}
}

