import java.util.*;
class replace
{
void main()
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter the String of not more than 10 words");
int flag=0;
int h=0;
String stt="";
do
{
flag=0;
stt=s.nextLine();
stt=stt.toLowerCase();
StringTokenizer stq=new StringTokenizer(stt);
h=stq.countTokens();
if(h>10)
{
System.out.println("Please enter the String of not more than 10 words");
flag=1;
continue;
}
}while(flag==1);
StringTokenizer st=new StringTokenizer(stt);
String se="";
int l=0;
String see="";
int k=0;
String arr[]=new String[h];
int p=0;
char c;
String sr="";
for(int i=0;i<h;i++)
{
se=st.nextToken();
if((se.equals("a"))||(se.equals("an"))||(se.equals("the")))
{
arr[i]="ss";
continue;
}
l=se.length();
p=l-1;
for(int j=0;j<p;j++)
{
if((se.charAt(j)=='a')||(se.charAt(j)=='e')||(se.charAt(j)=='i')||(se.charAt(j)=='o')||(se.charAt(j)=='u'))
{
k=j;
c=se.charAt(k+1);
sr=se.substring(p-1,l);
if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
{
see=see+'e';
j++;
}
else
{
see=see+se.charAt(j);
}
}
else
{
see=see+se.charAt(j);
}
}
boolean ew=check(sr.charAt(0));
boolean we=check(sr.charAt(1));
if((ew==true)&&(we==true))
{
see=see;
}
else
{
see=see+se.charAt(p);
}
arr[i]=see;
see="";
}
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
}
boolean check(char fg)
{
int fla=0;
if((fg=='a')||(fg=='e')||(fg=='i')||(fg=='o')||(fg=='u'))
return true;
else
return false;
}
}



