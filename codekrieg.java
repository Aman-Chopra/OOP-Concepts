import java.io.*;
import java.util.*;
public class codekrieg
{
    public static void main(String args[])
    {
        Scanner  s = new Scanner(System.in);
        System.out.println("Code");
        int n =s.nextInt();
        int l;
        int count=0;
        int flag=0;
        int k;
        for(int i=0;i<n;i++)
        {
            count=0;
            flag=0;
            int a = s.nextInt();
            int b = s.nextInt();
            for(int j=a;j<=b;j++)
            {
                double a1 = j;
                double a2 = j*2;
                String a11 = Double.toString(a1);
                String a12 = Double.toString(a2);
                int ar[] = new int[10];
                int ar1[] = new int[10];
                if(a11.length()==a12.length())
                {
                  for(k=0;k<a11.length();k++)
                  {
                      if(a11.charAt(k)=='0')
                      ar[0]++;
                      else if(a11.charAt(k)=='1')
                      ar[1]++;
                      else if(a11.charAt(k)=='2')
                      ar[2]++;
                      else if(a11.charAt(k)=='3')
                      ar[3]++;
                      else if(a11.charAt(k)=='4')
                      ar[4]++;
                      else if(a11.charAt(k)=='5')
                      ar[5]++;
                      else if(a11.charAt(k)=='6')
                      ar[6]++;
                      else if(a11.charAt(k)=='7')
                      ar[7]++;
                      else if(a11.charAt(k)=='8')
                      ar[8]++;
                      else if(a11.charAt(k)=='9')
                      ar[9]++;
                    }
                    for(k=0;k<a11.length();k++)
                  {
                      if(a12.charAt(k)=='0')
                      ar1[0]++;
                      else if(a12.charAt(k)=='1')
                      ar1[1]++;
                      else if(a12.charAt(k)=='2')
                      ar1[2]++;
                      else if(a12.charAt(k)=='3')
                      ar1[3]++;
                      else if(a12.charAt(k)=='4')
                      ar1[4]++;
                      else if(a12.charAt(k)=='5')
                      ar1[5]++;
                      else if(a12.charAt(k)=='6')
                      ar1[6]++;
                      else if(a12.charAt(k)=='7')
                      ar1[7]++;
                      else if(a12.charAt(k)=='8')
                      ar1[8]++;
                      else if(a12.charAt(k)=='9')
                      ar1[9]++;
                    }
                    for(k=0;k<10;k++)
                    {
                        if(ar[k]!=ar1[k])
                        {
                            flag = 1;
                            break;
                        }
                    }
                    if(flag==0)
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}