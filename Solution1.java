import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a,0,n);
            int ans = 0;
            int count = 0;
            if(n<2)
                ans = 2;
        else if(n==2)
            {
            if(a[0]==a[1])
                ans = 2;
            else 
                ans = 1;
                
        }
            else
                {
                for(int i=0;i<n-1;i++)
                    count+=a[i];
                    if(count<=a[n-1])
                    ans = 1;
                    else
                    ans = 0;
            }
            System.out.println(ans);
        
    }
}
