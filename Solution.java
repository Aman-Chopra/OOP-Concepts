import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int cookies = 0;
        if(n>m)
            {
            cookies = n-m;
        }
        else if(n==m)
            System.out.println("0");
        else
            cookies = n-(m%n);
        
        System.out.println(cookies);
    }
}
