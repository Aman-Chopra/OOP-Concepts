import java.util.*;
class vampire_no
{
int n=0;
public void main()
{
Scanner s=new Scanner(System.in);
int flag=0;
String sd="";
int b=0;
do
{
flag=0;
System.out.println("Enter the number");
n=s.nextInt();
sd=Integer.toString(n);
b=sd.length();
if((b%2)!=0)
{
flag=1;
System.out.println("Please enter an even length number.Re-enter");
continue;
}
}while(flag==1);  
int m=b/2;
String ss="";
int count=0;
for(int i=2;i<n;i++)
{
ss=Integer.toString(i);
if((n%i==0)&&(ss.length()==m))
{
count++;
}
}
String sss="";
int coun=0;
String ar[]=new String[count];
for(int i=2;i<n;i++)
{
sss=Integer.toString(i);
if((n%i==0)&&(sss.length()==m))
{
ar[coun]=sss;
coun++;
}
}
int d=0;
int jk=0;
int f=0;
int ci=0;
for(int i=0;i<count;i++)
{
d=Integer.parseInt(ar[i]);
for(int j=0;j<count;j++)
{
jk=Integer.parseInt(ar[j]);
f=d*jk;
if(f==n)
{
ci=ci+2;
}
}
}
int arr[]=new int[ci];
int fd=0;
for(int i=0;i<count;i++)
{
d=Integer.parseInt(ar[i]);
for(int j=0;j<count;j++)
{
jk=Integer.parseInt(ar[j]);
f=d*jk;
if(f==n)
{
arr[fd]=d;
fd++;
arr[fd]=jk;
fd++;
}
}
}
System.out.println();
int hj=ci/2;
String gf="";
String hg[]=new String[hj];
for(int i=0;i<hj;i++)
{
gf=Integer.toString(arr[i]);
hg[i]=gf;
}


int u=n;
String df="";
String fg="";
int l=0;
int o=b;
char cg[]=new char[o];
int county=0;
boolean vb;
for(int i=0;i<(hj-1);i++)
{
df=hg[i];
fg=hg[i+1];
l=df.length();
if((df.charAt(l-1)=='0')&&(fg.charAt(l-1)=='0'))
{
i=i+2;
continue;
}
else
{
for(int h=0;h<l;h++)
{
cg[h]=df.charAt(h);

}
for(int g=0;g<l;g++)
{
cg[g+m]=fg.charAt(g); 
}

vb=check(cg);
if(vb==true)
{
System.out.println("The number is a vampire number");
System.out.println("Its factors are " + df + " and " + fg);
county++;
}
i++;
}
}
if(county==0)
{
System.out.println("The number is not a vampire number");
}
}
boolean check(char fs[])
{
String jh=Integer.toString(n);
int y=jh.length();
char cha[]=new char[y];
for(int i=0;i<y;i++)
{
cha[i]=jh.charAt(i);
}
int gd=fs.length;
char temp;

for(int i=0;i<gd;i++)
{
for(int j=0;j<(gd-i-1);j++)
{
if(fs[j]>fs[j+1])
{
temp=fs[j];
fs[j]=fs[j+1];
fs[j+1]=temp;
}
}
}
String sss=new String(fs);

int gt=cha.length;

char tempi=' ';
for(int i=0;i<gt;i++)
{
for(int j=0;j<(gt-i-1);j++)
{
if(cha[j]>cha[j+1])
{
temp=cha[j];
cha[j]=cha[j+1];
cha[j+1]=temp;
}
}
}
String sss1=new String(cha);


if(sss.equalsIgnoreCase(sss1))
{
return true;
}
else
{
return false;
}
}
}








