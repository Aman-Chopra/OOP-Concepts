class Lucas
{
void main()
{
System.out.print("2 ");
int count=0;
int a=2;
int b=1;
int c=0;
boolean t;
while(count<9)
{
c=a+b;
t=prime(c);
if(t==true)
{
count++;
}
a=b;
b=c;
}
}
boolean prime(int w) 
{
int flag=0;
if(w==1)
{
flag=1;
}
else
{
for(int i=2;i<w;i++)
{
if(w%i==0)
{
flag=1;
}
}
}
if(flag==0)
{
System.out.print(w+" ");
return true;
}
else
return false;
}
}
