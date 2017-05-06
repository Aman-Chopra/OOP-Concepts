import java.util.*;
class Encryption
{
Scanner s=new Scanner(System.in);
String arr[];
int n;
void input()
{
System.out.println("Please enter size of Array");
n=s.nextInt();
if(n<1||n>=10)
{
System.out.println("Error-Not a valid size");
System.exit(0);
}
else{
arr=new String[n];String tr=s.nextLine();
for(int it=0;it<n;it++)
{
System.out.println("Please enter sentence number"+(it+1)+" Ended with full stop");

String str=s.nextLine();
int len=str.length();
if(str.charAt(len-1)!='.')
{
System.out.println("Sentence didn't end with full stop");
System.exit(0);
}
else
{
arr[it]=str;
}}
output();
}}
void output()
{
for(int xt=0;xt<n;xt++)
{
String ty=arr[xt];
if((xt+1)%2==0)
{
String tyy=rev(ty);
System.out.println(tyy);
}
else
{
String tyy=en(ty);
System.out.println(tyy);
}}}
String rev(String tu)
{int uy=tu.length();
String hj=tu.substring(0,uy-1);
StringTokenizer reverse=new StringTokenizer(hj);
String tto=" ";
int count=reverse.countTokens();
for(int uyy=1;uyy<=count;uyy++)
{
String gh=reverse.nextToken();
tto=" "+gh+tto;
}
tto=tto.trim();
tto=tto+".";
return tto;
}
String en(String yu)
{String ttyu=yu.substring(0,yu.length()-1);
String enc=" ";
StringTokenizer ghg=new StringTokenizer(ttyu);
int count=ghg.countTokens();
for(int hj=1;hj<=count;hj++)
{String wor=" ";
String yuu=ghg.nextToken();
int lengths=yuu.length();
for(int xc=0;xc<(lengths);xc++)
{

char xv=yuu.charAt(xc);
int xvv=(int)xv;
xvv=xvv+2;
if(xvv>90)
{int tyu=xvv-90;
xvv=65+(tyu-1);
char tyyy=(char)xvv;
wor=wor+tyyy;
}
else if(xvv>122)
{int tyu=xvv-122;
xvv=97+(tyu-1);
char tyyy=(char)xvv;
wor=wor+tyyy;
}
else{
char tyyy=(char)xvv;
wor=wor+tyyy;
}}wor=wor.trim();
enc=enc+wor+" ";
}
enc=enc.trim();
enc=enc+".";
return enc;
}}

