import java.util.*;
import java.io.*;

public class filehandling{
public static void main(String[] args) throws FileNotFoundException 

    {
        
        File f = new File("C:/Aman","aman.txt");
        File fi = new File("C:/Aman","next.txt");
        try{
        FileWriter Fw=new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(Fw);
        bw.write("The ship is slowly sinking.");
        bw.close();
        Fw.close();
    }
    catch(Exception e)
       {
       System.out.println("File not found.");
       }
       
       try{
        File fir = new File("C:/Aman","aman.txt");
        System.out.println(new File(".").getAbsoluteFile());
        FileReader Fr=new FileReader(fir);
        BufferedReader br=new BufferedReader(Fr);
        String si="";
        while((si=br.readLine())!=null);
        String a = new StringBuilder(si).reverse().toString();
        FileWriter Fww=new FileWriter(fi);
        BufferedWriter bww = new BufferedWriter(Fww);
        bww.write(a);
        System.out.println(a);
       }
       catch(Exception e)
       {
       System.out.println("File not found.");
       }
    }
}