import java.util.*;
import java.io.*;
class Magic
{
public static void main()
{
Scanner s=new Scanner(System.in);
int i,j,row,col; 
int pd=0,sd=0,k,x=0;
System.out.println("Enter dimensions");
row=s.nextInt();
col=s.nextInt();
int mag[][]=new int[row][col];
int rowsum[]=new int[row];
int colsum[]=new int[col];
int b[]=new int[100];
if(row!=col)  // checking for square matrix
{
System.out.println("Matrix is not magic square");
System.exit(0);
}
//inputting elements to the array
System.out.println("Enter elements for a");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
mag[i][j]=s.nextInt();
}
//checking for uniqueness
for(i=0;i<row;i++) 
	for(j=0;j<col;j++)
	b[x++]=mag[i][j]; //copying elements to 1D
for(k=0;k<x-1;k++)
for(j=k+1;j<x;j++)
	if(b[k]==b[j])
	  { 
	  System.out.println("Elements are not distinct"); 
	  System.out.println("Matrix is not magic");
	  System.exit(0);
}
	  
	  
	  for(i=0; i<row; i++)
    pd=pd + mag[i][i];

//Row sum
for(i=0; i<row; i++)
{
	rowsum[i]=0;
	for(j=0;j< col; j++)
	    rowsum[i]=rowsum[i]+mag[i][j];
//comparing rowsum and principal diagonal sum
	if(rowsum[i]!=pd)
	{
	   System.out.println("Matrix is not magic");
	   System.exit(0);
	}
}
//Finding column sum
for(i=0;i<col;i++)
{	colsum[i]=0;
	for(j=0;j<row;j++)
	    colsum[i]=colsum[i]+mag[j][i];

//comparing Columnsum and principal diagonal sum
	if(colsum[i]!=pd){ System.out.println("Matrix is not magic");
	    System.exit(0); } 
} 
//finding secondary diagonal sum
i=row-1;
k=i;
for(j=col-1;j>=0;j--,i--)     
sd=sd+mag[i][k-j];
if(sd!=pd)
{ 
System.out.println("Matrix is not magic");
System.exit(0);
}   
System.out.println("Matrix is magic");  
}
}
