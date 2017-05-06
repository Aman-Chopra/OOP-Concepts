import java.util.*;
class Permutation
{
void main()
{
Scanner s=new Scanner(System.in);
String st="";
String str=" ";
char ar[]=new char[4];
char arr[]=new char[4];
char ra[]=new char[8];

int l=0;
int flag=0;
do
{
flag=0;
System.out.println("Please enter the string of four letters only");
st=s.next();
l=st.length();
if(l!=4)
{
flag=1;
System.out.println("Please enter a four letter string only");
continue;
}
}while(flag==1);
System.out.println("The permutations of the given string are:-");
System.out.println();
char C;
for(int i=0;i<4;i++)
{
C=st.charAt(i);
ar[i]=C;
arr[i]=C;
}
for(int i=0;i<4;i++)
{
ra[i]=ar[i];
}
for(int i=4;i<8;i++)
{
ra[i]=arr[i-4];
}
for(int i=0;i<8;i++)
{
if(i==4)
break;
else
{
str=Character.toString(ra[i])+Character.toString(ra[i+1])+Character.toString(ra[i+2])+Character.toString(ra[i+3]);
System.out.println(str);
}
}
for(int i=7;i>=0;i--)
{
if(i==3)
break;
else
{
str=Character.toString(ra[i])+Character.toString(ra[i-1])+Character.toString(ra[i-2])+Character.toString(ra[i-3]);
System.out.println(str);
}
}
}
}







//Aman Chopra
//12th Science