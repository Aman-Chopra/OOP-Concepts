import java.io.*;
import java.util.*;
class Matrix
{
public static void main()
{
int i,j,k;
Scanner s=new Scanner(System.in);
System.out.println("Enter dimension for a");
int m=s.nextInt();
int n=s.nextInt();
System.out.println("\n enter dimension for b\n");
int p=s.nextInt();
int q=s.nextInt();
int a[][]=new int[m][n];
int b[][]=new int[p][q];
int c[][]=new int[m][q];
int d[][]=new int[p][q];
if(n!=p){
  System.out.println("Not multiplicable");
  System.exit(0); 
}
System.out.println("Enter elements for a");
for (i=0;i<m;i++){ 
   for(j=0;j<n;j++)
      a[i][j]=s.nextInt(); 
}
System.out.println("Enter elements for b"); 
for(i=0;i<p;i++){
for(j=0;j<q;j++)
b[i][j]=s.nextInt();
}
for(i=0;i<m;i++) {
   for(j=0;j<q;j++) {
     c[i][j]=0;
     d[i][j]=a[i][j]+b[i][j];
     for(k=0;k<n;k++)
        c[i][j]=c[i][j]+a[i][k]*b[k][j];
   }
}
System.out.println("The product matrix is ");
for(i=0;i<m;i++){
  for(j=0;j<q;j++)
    System.out.print(c[i][j]+" ");
  System.out.println();
}
System.out.println("The sum of the matrix is ");
for(i=0;i<p;i++){
  for(j=0;j<q;j++)
    System.out.print(d[i][j]+" ");
  System.out.println();
}
}
}