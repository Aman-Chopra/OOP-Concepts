import java.util.Scanner;
class base
{
void main()
{
Scanner s=new Scanner(System.in);
System.out.println("Please print the first no. x ");
int x=s.nextInt();
System.out.println("Please print the second no. y ");
int y=s.nextInt();
double arrx[]=new double[19];
double arry[]=new double[19];
int z=0;
int i=0;
int g=0;
for(i=2;i<=20;i++)
{
arrx[z]=calculate(i,x);
z++;
}
int b=0;
for(g=2;g<=20;g++)
{
arry[b]=calculate(g,y);
b++;
}
int flag=0;
double temp=0;
outer:for(int k=0;k<19;k++)
{
temp=arrx[k];
for(int j=0;j<19;j++)
{
if(arry[j]==temp)
{
System.out.println("Element " + x + " (base " + (k+2) + " ) is equal to element " + y + " (base " + (j+2)+ " ) ");
flag=1;
break outer;
}
}
}
if(flag==10)
System.out.print("Base not equal");
}
double calculate(int y,int u)
{
String h=Integer.toString(u);
double l=h.length();
double v=0;
char c=' ';
double d=0;
String f="";
double k=0;
double sum=0;
double mul=0;
for(int i=0;i<=l;i++)
{
v=l-1;
c=h.charAt(i);
f=Character.toString(c);
k=Integer.parseInt(f);
d=Math.pow(y,v);
mul=k*d;
sum=sum+mul;
l--;
}
return sum;
}
}
//Aman Chopra 
//12th Science



