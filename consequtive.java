import java.util.*;
public class consequtive
    {
        public static void main(String args[])
        {
            //System.out.println("Hi");
            Scanner in = new Scanner(System.in);
            int i = 0;
            int j = 0;
            long n = in.nextLong();
            int number = 0;
            int flag = 0;
            for(i = 0;i < n; i++)
            {
                number = in.nextInt();
                long arr[] = new long[number];
                flag = 0;
                for(j = 0;j < number; j++)
                {
                   arr[j] = in.nextLong();                     
                }
                for(j = 0;j < number-2; j++)
                {
                   if((arr[j] == arr[j+1])&&(arr[j+1] == arr[j+2]))
                   {
                       flag = 1;
                       break;
                   }
                }
                   if(flag == 1)
                   {
                       System.out.println("Yes");
                   }
                   else
                   {
                       System.out.println("No");
                   }
            }
        }
    }
                