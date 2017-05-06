import java.util.*;
import java.io.*;
public class question{
        public static void main(String[] args){
            System.out.println("Hello");
                        Scanner s = new Scanner(System.in);
                        int n = s.nextInt();
                        double distance = s.nextInt();
                        int count=0;
                        int sum=0;
                        for(int i=0;i<n;i++)
                        {   double dist = distance;
                            count=0;
                            sum=0;
                            int p=s.nextInt();
                             int q=s.nextInt();
                              int l=s.nextInt();
                               int r=s.nextInt();
                                int t=s.nextInt();
                                 int b=s.nextInt();
                                 double val = 1.41*p;
                            if(p==q){
                            while(dist>=0)
                            {
                               dist-=val;
                               if(dist>=0)
                               count++;
                            }
                            if(count==0)
                            sum=0;
                            else
                            {
                            for(int j=0;j<=count/2;j++)
                            sum=sum+t+r;
                            count=count/2;
                            for(int k=0;k<count;k++)
                            sum=sum+l+b;
                        }
                        }
                            System.out.println(sum);
                        }
                    }
                }
                                
                        
	