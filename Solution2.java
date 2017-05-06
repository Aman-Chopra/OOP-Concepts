import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int check = 0;
        int count = 0;
        while(check<=n)
            {
            if((check+2<n)&&(c[check+2]!=1))
               
                   
                   check+=2;
               
               else
               check+=1;
               count++;
        }
        System.out.println(count);
    }
}
