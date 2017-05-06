import java.io.*;
import java.util.*;
class Filehand
{
void main()throws IOException
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter 1 to read the file,enter 2 to append the file and enter 3 to exit");
int ch=s.nextInt();
if(ch==1)
{
FileReader Fr=new FileReader("A.txt");
BufferedReader br=new BufferedReader(Fr);
String si="";
while((si=br.readLine())!=null)
{
System.out.println(si);
}
br.close();
Fr.close();
System.out.println();
System.out.println("Please enter 1 to go back to the main menu and 2 to exit");
int chi=s.nextInt();
if(chi==1)
{
main();
}
else
{
System.exit(0);
}
}
if(ch==2)
{
FileWriter Fw=new FileWriter("A.txt",true);
PrintWriter Pr=new PrintWriter(Fw);
System.out.println("Please enter the item code of the new item");
double itco=s.nextDouble();
System.out.println("Please enter the item name of the new item");
String itna=s.next();
System.out.println("Please enter the item price of the new item");
double itpr=s.nextDouble();
Pr.println(itco+"\t"+itna+"\t"+itpr);
Fw.close();
Pr.close();
System.out.println();
System.out.println("The files contents are successfully appended");
System.out.println();
System.out.println("Please enter 1 to go back to the main menu and 2 to exit");
int chi=s.nextInt();
if(chi==1)
{
main();
}
else
{
System.exit(0);
}
}
if(ch==3)
{
System.exit(0);
}
}
}