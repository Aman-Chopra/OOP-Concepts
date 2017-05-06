
 

import java.util.*;
import java.io.*;
public class Practice4 {

    
    public static void main(String[] args) {
        String str = "";int words ;
        try{
        File f = new File("D:/syr","practice.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello how are you doing?");
        bw.newLine();
        bw.write("Somemore text");
        bw.newLine();
        bw.write("text rep");
        bw.close();
        fw.close();
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String st ="", temp=""; String[] sort = new String[10];
        int j=0;
        while((st=br.readLine())!=null)
        { str = "";words=1;
          str += st;
          for(int i=0 ; i<str.length() ; i++)
          {  sort[j]+= str.charAt(i);
               if(str.charAt(i)==' ')
               {words++;
               j++;
               }
              }
          for(int i=0;i<sort.length;i++)
          { for(j=0 ; j<sort.length;j++)
           {   int l =sort[j].length();int h= sort[j+1].length();
               if(l>h)
               {
               temp = sort[j];
               sort[j] = sort[j+1];
               sort[j+1] = temp;
           }
          }
          }
         System.out.println("new sentence :" );
         for(int i=0 ; i<sort.length ; i++)
         { System.out.println(sort[i]);
         
         }
        
        
          System.out.println("Words = " + words);
        }
        }
        catch(IOException e)
        {}
    
}
}