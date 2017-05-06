import java.util.*;
class buffer
{
void main()
{
Scanner s=new Scanner(System.in);
String str="";
System.out.println("Please enter the sentence");
String st=s.nextLine();
st=st.trim();
st=st+" ";
int l=st.length();
String nes="";
String strm="";
System.out.println("The palindrome words are:-");
int k=0;
int flag=0;
for(int i=0;i<l;i++)
{
if(st.charAt(i)==' ')
{
str=st.substring(k,i);
k=i+1;
strm=stringbuff(str);
if(strm.equalsIgnoreCase(str))
{
System.out.println(strm);
flag++;
}
nes=nes+" "+strm;
}
}
if(flag==0)
{
System.out.println("There are no palindrome words in the string");
}
nes=nes.trim();
System.out.println("The reversed sentence is");
System.out.println(nes);
}
String stringbuff(String ha)
{
StringBuffer d=new StringBuffer(ha);
d.reverse();
String n=new String(d);
return n;
}
}
//Aman Chopra
//12th Science


