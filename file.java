import java.io.*;
import java.util.StringTokenizer;
class file
{
public static void main() throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
int ch, answer;
String name, na="";
do
{
System.out.println("Select your option below : ");
System.out.println("a). Create file     Press - 1");
System.out.println("b). Display records Press - 2");
System.out.println("c). Search name     Press - 3");
System.out.println("d). Exit            Press - 4");
System.out.println("Input a choice : ");
ch=Integer.parseInt(br.readLine());

switch (ch)
{
// file creation
case 1 :
FileWriter F1 = new FileWriter("d:/aman/phone.txt");
BufferedWriter F2 = new BufferedWriter(F1);
PrintWriter F3 = new PrintWriter(F2);
do
{
System.out.println("Input name followed by phone number with one space :");
name = br.readLine();

// writing value of name into text file "phone.txt"

F3.println(name);
System.out.print("Do you want to input more names, press 1 for YES or 0 for NO :");
answer=Integer.parseInt(br.readLine());
}
while(answer==1);
F3.close();
break;

// reading record and printing
case 2 :
FileReader F4 = new FileReader("d:/aman/phone.txt");
BufferedReader F5 = new BufferedReader(F4);
System.out.println("Name \t\t Phone Number");
while((name=F5.readLine()) !=null)
{
StringTokenizer st = new StringTokenizer(name);
while(st.hasMoreTokens())
{
System.out.print(st.nextToken()+"\t\t");
}           // end while
System.out.println();
}           // end outer while
F5.close();
break;

// searching names
case 3 :                    // open file in reading mode
FileReader F6 = new FileReader("d:/aman/phone.txt");
BufferedReader F7 = new BufferedReader(F6);
System.out.print("Input a name to search : ");
na=br.readLine();
while((name=F7.readLine()) !=null)
{
StringTokenizer st = new StringTokenizer(name);
String str = st.nextToken();
if(na.compareTo(str)==0)
{
System.out.println("Record found, see below :");
while(st.hasMoreTokens())
{
System.out.println("It's phone number : "+st.nextToken());
}           // end while
break;
}           // end if
}           // end outer while
F7.close();
break ;
}           // end switch
}
while(ch<4);
}           // end main function
}           // end of class


