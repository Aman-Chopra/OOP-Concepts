import java.util.*;
class stringtok
{
void main()
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter the string");
String st=s.nextLine();
StringTokenizer str=new StringTokenizer(st,"!?.");
int c=str.countTokens();
String newst="";
int v=0;
String ast="";
int f=0;
int word=0;
System.out.println("Sentence"+"         "+"No. of Vowels"+"           "+"No. of Words");
System.out.println("------------------------------------------------------------- ");
for(int i=1;i<=c;i++)
{
newst=str.nextToken();
v=countvowel(newst);
word=countwords(newst);
System.out.print(i+"\t"+"\t"+"\t"+v+"\t"+"\t"+"\t"+word+"\t"+"\t"+"\t");
System.out.println();
}
newst="";
int d=0;
String aste="";
System.out.println("Sentence"+"\t"+"\t"+"No.of vowel/words");
System.out.println("----------------------------------");
String ha=st;
StringTokenizer stre=new StringTokenizer(ha,"!?.");
for(int i=1;i<=c;i++)
{
newst=stre.nextToken();
v=countvowel(newst);
word=countwords(newst);
f=v*3;
d=word*3;
for(int j=0;j<f;j++)
{
ast=ast+"V";
}
for(int k=0;k<d;k++)
{
aste=aste+"W";
}
System.out.println(i+"\t"+"\t"+"\t"+ast);
System.out.println("\t"+"\t"+"\t"+aste);
ast="";
aste="";
}
}
int countvowel(String ase)
{
ase=ase.toLowerCase();
int l=ase.length();
char c;
int count=0;
for(int i=0;i<l;i++)
{
c=ase.charAt(i);
if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
{
count++;
}
}
return count;
}
int countwords(String asee)
{
asee=asee.trim();
asee=asee+" ";
int l=asee.length();
char c;
int coun=0;
for(int i=0;i<l;i++)
{
c=asee.charAt(i);
if(c==' ')
{
coun++;
}
}
return coun;
}
}
//Aman Chopra
//12th Science





