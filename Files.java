import java.util.*;
import java.io.*;
class sup
{
    public static void main(String args[])throws IOException
    {
        Scanner s=new Scanner(System.in);
        System.out.println("1.Write\n2.Read\n3.Copy");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
                FileWriter ss=new FileWriter("rateregister.txt");
                BufferedWriter hl=new BufferedWriter(ss);
                PrintWriter pw=new PrintWriter(hl);
                System.out.println("Enter the contents");
                s.nextLine();
                String str=s.nextLine();
                pw.println(str);
                pw.close();
                hl.close();
                break;
            case 2:
                FileReader ul=new FileReader("rateregister.txt");
                BufferedReader oq=new BufferedReader(ul);
                String yo="";
                while((yo=oq.readLine())!=null)
                    System.out.println(yo);
                break;
            case 3:
                 FileWriter f1=new FileWriter("getrateregister.txt");
                BufferedWriter b1=new BufferedWriter(f1);
                PrintWriter pa=new PrintWriter(b1);
                FileReader ull=new FileReader("rateregister.txt");
                BufferedReader oqq=new BufferedReader(ull);
                String yoo="";
                String ui="";
                while((yoo=oqq.readLine())!=null)
                    ui+=yoo;
               // System.out.println(ui);
                pa.println(ui);
                pa.close();
                b1.close();
                System.out.println("Contents of copied file are: ");
                 FileReader fr=new FileReader("getrateregister.txt");
                BufferedReader brr=new BufferedReader(fr);
                String con="";
                while((con=brr.readLine())!=null)
                    System.out.println(con);
                break;
            default:System.out.println("Enter a valide choice");
                
           
                
                
        }
        
        
    }
}




import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.*;
class L1
{
public static void main(String args[])throws IOException
{

int i;

int count=0;

int vowel=0;
int k=0;
String str="";
Scanner s = new Scanner(System.in);
 FileReader ul=new FileReader("rateregister.txt");
 BufferedReader oq=new BufferedReader(ul);
 String yo="";
 while((yo=oq.readLine())!=null)
 {
 str+=yo;
 k++;
 }
int l = str.length();

for(i=0;i<l;i++)

{

if(str.charAt(i)==' ')

count++;

if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||

str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')

{

vowel+=1;

}

}

int chars = l-count;

int words = count;

System.out.println("No. of words : "+words);

System.out.println("No. of characters : "+(chars));

System.out.println("No. of vowels : "+(vowel));
System.out.println("No. of lines : "+(k));

}

}





















import java.io.*;
import java.util.*;

 class RandomAccessFileDemoo {

   public static void main(String[] args)throws IOException
           
   {
       Scanner s =new Scanner(System.in);
      try {
          /* FileWriter ss=new FileWriter("rateregisters.txt");
                BufferedWriter hl=new BufferedWriter(ss);
                PrintWriter pw=new PrintWriter(hl);
                System.out.println("Enter the contents");
                s.nextLine();
                String str=s.nextLine();
                pw.println(str);
                pw.close();
                hl.close();*/
         // create a new RandomAccessFile 
         RandomAccessFile raf = new RandomAccessFile("anything.txt","rw");

         // write something in the file
         raf.writeUTF("Hello World");

         // set the file pointer at 0 position
         raf.seek(0);

         // print the line
         System.out.println("" + raf.readLine());

         // set the file pointer at 0 position
         raf.seek(0);

         // write something in the file
         raf.writeUTF("This is an example ");

         raf.seek(0);
         // print the line
         System.out.println("" + raf.readLine());
      } catch (IOException ex) {
         ex.printStackTrace();
      }

   }
}


















import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.*;
import java.io.*;

class HelloWorld{
    public static void main(String[] args) {
Scanner st = new Scanner(System.in);
        try{
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();

            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");
             FileWriter ss=new FileWriter("rateregister.txt");
                BufferedWriter hl=new BufferedWriter(ss);
                PrintWriter pw=new PrintWriter(hl);
                System.out.println("Enter the contents");
                st.nextLine();
                String str=st.nextLine();
                 byte[] text = str.getBytes("UTF8");


            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(text);

            String s = new String(textEncrypted);
            System.out.println(s);
                pw.println(s);
                pw.close();
                hl.close();
               
               
                  FileReader ul=new FileReader("rateregister.txt");
                BufferedReader oq=new BufferedReader(ul);
                String yo="";
                while((yo=oq.readLine())!=null)
                {
                     desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            byte[] textDecrypted = desCipher.doFinal(textEncrypted);

            yo = new String(textDecrypted);
                    System.out.println(yo);
                }

           

            
          
        }catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
}