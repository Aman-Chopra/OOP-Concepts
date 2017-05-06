import java.util.*;
public class Binary
{
Scanner s=new Scanner(System.in);
int A[]=new int[100];
int n=0;
int l=0;
int u=0;
Binary(int nn)
{
n=nn;
l=0;
u=0;
u=nn;
for(int oi=0;oi<100;oi++)
{
A[oi]=0;
}
}
public void readdata()
{int nul=0;
int min=0;
System.out.println("Please enter the element");
int kjk=s.nextInt();
A[0]=kjk;
min=kjk;
for(int lkl=1;lkl<n;lkl++)
{
System.out.println("Please enter the element");
int kjks=s.nextInt();
if(kjks<min)
{
System.out.println("Not a valid number");
System.exit(0);
}
else{
A[lkl]=kjks;
}
}}
int binary_search(int v)
{
if(n==0)
return 0;
else
{
int imid=l+u;
imid=imid/2;
if(A[imid-1]>v)
{
l=0;
u=imid-1;
return binary_search(v);
}
if(A[imid-1]<v)
{
l=imid+1;
u=u;
return binary_search(v);
}
else
return imid;
}}
void main()
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter the number of element you want to enter");
int aa=s.nextInt();
Binary ob=new Binary(aa);
readdata();
System.out.println("Please enter the number you want to search in the list");
int x=s.nextInt();
int p=binary_search(x);
if(p==0)
System.out.println("Element not found");
else
System.out.println("Element found at " + p + " position ");
}
}

//Aman Chopra 
//12th Science