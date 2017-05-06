import java.util.*;
class Result
{
int arr[][]=new int[3][4];
int ar[]=new int[3];
void store()
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter the marks of each subjects along with the roll numbers");
for(int i=0;i<3;i++)
{
for(int j=0;j<4;j++)
arr[i][j]=s.nextInt();
}
}
void total()
{
for(int i=0;i<3;i++)
{
for(int j=1;j<4;j++)
ar[i]+=arr[i][j];
}
}
void HM()
{
int pos=0;
int max=0;
int i=0;
int count=1;
for(int j=1;j<4;j++)
{
max=0;
for(i=0;i<3;i++)
{
if(arr[i][j]>max)
{
max=arr[i][j];
pos=i;
}
}
System.out.println("The highest marks in subject "+count+ " is "+max);
System.out.println("Roll number "+arr[pos][0]);
count++;
}
}
void HTM()
{
int max=0;
int pos=0;
int i=0;
for(i=0;i<3;i++)
{
if(ar[i]>max)
{
max=ar[i];
pos=i;
}
}
System.out.println("The roll no. of the student who got highest marks is "+arr[pos][0]);
}
public static void main(String[] args)
{
Result ob=new Result();
ob.store();
ob.total();
ob.HM();
ob.HTM();
}
}
