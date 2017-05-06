import java.util.*;
public class Collection
{
int arr[];
int len;
public Collection()
{
len=100;
arr=new int[100];
}
public Collection(int n)
{
len=n;
arr=new int[n];
}
public void inparr()
{
Scanner s=new Scanner(System.in);
for(int i=0;i<len;i++)
{
System.out.println("Enter array element at "+(i+1));
arr[i]=s.nextInt();
}
}
public Collection common(Collection a)
{
a.inparr();
Collection c=new Collection(a.arr.length);
c.inparr();
Collection b=new Collection(a.arr.length);
int x=0,z=0;
while(x<c.arr.length)
{
for(int y=0;y<a.arr.length;y++)
{
if(c.arr[x]==a.arr[y])
{
b.arr[z]=c.arr[x];
z++;
break;
}
}
x++;
}
for(int i=0;i<a.arr.length;i++)
{
System.out.println(c.arr[i]+"\t"+a.arr[i]+"\t"+b.arr[i]);
}
return b;
}
void arrange()
{
int t;
for(int i=0;i<len;i++)
{
for(int j=0;j<len-i-1;j++)
{
if(arr[j]>arr[j+1])
{
t=arr[j];
arr[j]=arr[j+1];
arr[j+1]=t;
}
}
}
}
void main()
{
//Collection c=new Collection(5);
//c.inparr();
Collection d=new Collection(4);
common(d);
}
}
//Aman Chopra 
//12th Science
