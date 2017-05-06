import java.io.*;
import java.util.*;
public class Pract{

    
    public static void main(String[] args)//throws IOException {
        {
            Scanner s = new Scanner(System.in);
            try
            {
        System.out.println("Starting now");
        File f = new File("C:/Aman","Input.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        String st="";
        for(int i=0;i<5;i++)
        {
            st=s.nextLine();
            bw.write(st);
            bw.newLine();
        }
        bw.close();
        fw.close();
        File fq = new File("C:/Aman","Input.txt");
        FileReader fr = new FileReader(fq);
        BufferedReader br = new BufferedReader(fr);
        String str="";
        String sr[]=new String[5];
        int y=0;
        while((str=br.readLine())!=null)
        { 
            System.out.println(str);
            sr[y]=str;
            y++;
        }
        br.close();
        fr.close();
        File fi = new File("C:/Aman","MIT.txt");
        FileWriter fww = new FileWriter(fi);
        BufferedWriter bww = new BufferedWriter(fww);
        for(int u=0;u<5;u++)
        {
            if(sr[u].indexOf("MIT")!=-1)
            {
                bww.write(sr[u]);
                bww.newLine();
            }
        }
        bww.close();
        fww.close();
        
    }
    catch(IOException e)
    {
        System.out.println("IOException is thrown");
    }
    }
}