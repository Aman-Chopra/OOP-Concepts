class primrfactor
{
void main(int n)
{
int y=n;
int i=2;
int g=0;
boolean f;
String st="";
while(n!=1)
{
g=n%i;
if(g==0)
{
f=prime(i);
if(f==true)
{
n=n/i;
st=st+i+"*";
}
}
else
i++;
}
int l=st.length();
st=st.substring(0,l-1);
System.out.println(y+"="+st);
}
boolean prime(int h)
{
int flag=0;
if(h==2)
flag=0;
for(int i=2;i<h;i++)
{
if(h%i==0)
{
flag=1;
}
}
if(flag==0)
return true;
else
return false;
}
}