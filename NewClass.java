/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
/**
 *
 * @author win-8
 */
public class NewClass {
    public static void main(String args[])
    {
        System.out.println("Hi");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[][] = new int[n][2];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<2;j++)
            {
              ar[i][j] = s.nextInt();  
            }
        }
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(ar[i][1]>ar[j][0]&&ar[j][1]>ar[i][1])
                {
                System.out.println(ar[i][0]+","+ar[j][1]);
                break;
            }
            }
        }
        int flag = 0;
    }
}
