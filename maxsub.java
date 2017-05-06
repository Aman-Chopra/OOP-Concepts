import java.util.*;

class maxsub
           {
               public static void main(String args[])
               {
                   System.out.println("Hello!");
                   Scanner s = new Scanner(System.in);
                   int n = s.nextInt();
                   int i,j,no,ans;
                   for(i = 0;i<n;i++)
                   {
                       no = s.nextInt();
                       if(no==0)
                       continue;
                       int arr[] = new int[no];
                       for(j=0;j<no;j++)
                       {
                         arr[j] = s.nextInt();
                       }
                       ans = maxs(arr);
                       System.out.println(ans);
                   }
                }
                public static int maxs(int ar[])
                {
                 
                    int max = 0,val = 0;
                    int negmax = ar[0], flag=0;
                    if(ar.length==1)
                    return ar[0];
                    for(int j = 0;j<ar.length;j++)
                    {
                        if(ar[j]>=0)
                        {
                            flag = 1;
                            break;
                        }
                        if(ar[j]>negmax)
                        negmax = ar[j];
                    }
                    if(flag == 0)
                    return negmax;
                    int a[];
                    int n = ar.length;
                    int maximum[] = new int[n];
                    
                    for(int i =0;i<ar.length;i++)
                            {
                             val+=ar[i];
                             if(val<0)
                             val = 0;
                             if(val>max)
                             max = val;
                            }
                            int comp = max;
                    
                    
                    
                    
                    for(int k = 0;k<n;k++)  
                    {
                    a = removele(ar,k);
                    val = max = 0;       
                            for(int i =0;i<a.length;i++)
                            {
                             val+=a[i];
                             if(val<0)
                             val = 0;
                             if(val>max)
                             max = val;
                            }
                    maximum[k] = max;
                    }
                    int retvalue = maximum[0];
                    for(int u = 0;u<n;u++)
                    {
                        if(maximum[u]>retvalue)
                        retvalue = maximum[u];
                    }
                    if(comp>retvalue)
                    return comp;
                    else
                    return retvalue;
            }
            public static int[] removele(int ar[], int k)
            {
                int n = ar.length;
                int a[] = new int[n-1];
                int j =0;
                for(int i=0;i<k;i++)
                {
                    
                    a[j] = ar[i];
                    j++;
                }
                for(int y = k+1;y<n;y++)
                {
                    a[j] = ar[y];
                    j++;
                }
                return a;
                
            }
        }
                   
        