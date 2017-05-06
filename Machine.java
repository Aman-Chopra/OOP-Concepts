import java.util.*;
class Machine
{
void main()
{
Scanner s=new Scanner(System.in);
int n=0;
int flag=0;
do
{
flag=0;
System.out.print("Number of users : ");
n=s.nextInt();
if(n>100)
{
flag=1;
System.out.println("Number of users cannot exceed 100 ");
System.out.println("Please re-enter ");
continue;
}
}while(flag==1);   
int ui=0;
String lit="";
String lid="";
String lot="";
String lod="";
int fa=0;
int fag=0;
int fat=0;
int fam=0;
String litar[]=new String[n];
String lidar[]=new String[n];
String lotar[]=new String[n];
String lodar[]=new String[n];
int uiiar[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Please enter the user identification number of " + (i+1) + " user");
ui=s.nextInt();
uiiar[i]=ui;
do
{
fa=0;
System.out.println("Please enter the login time in format hours:minutes :");
lit=s.next();
if(lit.length()!=5)
{
fa=1;
System.out.println("Invalid time.Please re-enter");
continue;
}
if((Integer.parseInt(lit.substring(0,2))>24)||(Integer.parseInt(lit.substring(3,5))>60)||(lit.charAt(2))!=':')
{
fa=1;
System.out.println("Invalid time.Please re-enter");
continue;
}
litar[i]=lit;
}while(fa==1);
do
{
fag=0;
System.out.println("Please enter the login date in format day-month :");
lid=s.next();
if(lid.length()!=5)
{
fag=1;
System.out.println("Invalid date.Please re-enter");
continue;
}
if((Integer.parseInt(lid.substring(0,2))>31)||(Integer.parseInt(lid.substring(3,5))>12)||(lid.charAt(2))!='-')
{
fag=1;
System.out.println("Invalid date.Please re-enter");
continue;
}
lidar[i]=lid;
}while(fag==1);
do
{
fat=0;
System.out.println("Please enter the logout time in format hours:minutes :");
lot=s.next();
if(lot.length()!=5)
{
fat=1;
System.out.println("Invalid time.Please re-enter");
continue;
}
if((Integer.parseInt(lot.substring(0,2))>24)||(Integer.parseInt(lot.substring(3,5))>60)||(lot.charAt(2))!=':')
{
fat=1;
System.out.println("Invalid time.Please re-enter");
continue;
}
lotar[i]=lot;
}while(fat==1);
do
{
fam=0;
System.out.println("Please enter the logout date in format day:month :");
lod=s.next();
if(lod.length()!=5)
{
fam=1;
System.out.println("Invalid date.Please re-enter");
continue;
}
if((Integer.parseInt(lod.substring(0,2))>31)||(Integer.parseInt(lod.substring(3,5))>12)||(lod.charAt(2))!='-')
{
fam=1;
System.out.println("Invalid date.Please re-enter");
continue;
}
lodar[i]=lod;
}while(fam==1);
}
int dif=0;
String ds="";
String df="";
String dg="";
String dh="";
String in="";
String ou="";
String inu="";
String ouu="";
int min=0;
int minutes=0;
int ho=0;
int hou=0;
int hours=0;
String sd="";
String difar[]=new String[n];
int difq=0;
for(int i=0;i<n;i++)
{
ds=lidar[i];
df=litar[i];
dg=lotar[i];
dh=lodar[i];
ds=ds.substring(0,2);
dh=dh.substring(0,2);
in=df.substring(0,2);
ou=dg.substring(0,2);
inu=df.substring(3,5);
ouu=dg.substring(3,5);
dif=(Integer.parseInt(dh)-Integer.parseInt(ds));
if((ds.equals(dh))&&(in.equals(ou)))
{
hours=0;
minutes=(Integer.parseInt(ouu)-Integer.parseInt(inu));
}
else if((ds.equals(dh)==false)&&(in.equals(ou)))
{
if(Integer.parseInt(ouu)>=Integer.parseInt(inu))
{
minutes=(Integer.parseInt(ouu)-Integer.parseInt(inu));
hours=24*dif;
}
else
{
min=60-Integer.parseInt(inu);
minutes=min+Integer.parseInt(ouu);
hours=(24*dif)-1;
}
}
else if((ds.equals(dh))&&(in.equals(ou)==false))
{
hours=(Integer.parseInt(ou)-Integer.parseInt(in));
if(Integer.parseInt(ouu)>=Integer.parseInt(inu))
{
minutes=(Integer.parseInt(ouu)-Integer.parseInt(inu));
}
else
{
System.out.println("4");
min=60-Integer.parseInt(inu);
minutes=min+Integer.parseInt(ouu);
hours=hours-1;
}
}
else if((ds.equals(dh)==false)&&(in.equals(ou)==false))
{
difq=dif-1;
ho=24*difq;
hou=24-Integer.parseInt(in);
hours=hou+Integer.parseInt(ou)+ho;
if(Integer.parseInt(ouu)>=Integer.parseInt(inu))
{
minutes=(Integer.parseInt(ouu)-Integer.parseInt(inu));
}
else
{
min=60-Integer.parseInt(inu);
minutes=min+Integer.parseInt(ouu);
hours=hours-1;
}
}
sd=Integer.toString(hours)+":"+Integer.toString(minutes);
difar[i]=sd;
}
System.out.println("User id" + " " + "Login time" + " " + "Login date" + " " + "Logout time" + " " + "Logout date" + " " + "Time spent by user");
for(int i=0;i<n;i++)
{
System.out.println(uiiar[i] + "      " + litar[i] + "      " + lidar[i] + "      " + lotar[i] + "      " + lodar[i] + "       " + difar[i]);
}
String das=" ";
int max=0;
int pos=0;
int dis=0;
int le=0;
int maxi=0;
String dasi=" ";
String dasa=" ";
for(int i=0;i<n;i++)
{
das=difar[i];
le=das.length();
dis=das.indexOf(':');
dasi=das.substring(0,dis);
dasa=das.substring((dis+1),le);
if(Integer.parseInt(dasi)>max)
{
max=Integer.parseInt(dasi);
maxi=Integer.parseInt(dasa);
pos=i;
}
else if(Integer.parseInt(dasi)==max)
{
if(Integer.parseInt(dasa)>maxi)
{
maxi=Integer.parseInt(dasa);
pos=i;
}
}
}
System.out.println("The details of the user who has logged in for maximum time are given below : ");
System.out.println("User id" + " " + "Login time" + " " + "Login date" + " " + "Logout time" + " " + "Logout date" + " " + "Time spent by user");
System.out.println(uiiar[pos] + "      " + litar[pos] + "      " + lidar[pos] + "      " + lotar[pos] + "      " + lodar[pos] + "       " + difar[pos]);
}
}
