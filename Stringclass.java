import java.io.*;
import java.util.StringTokenizer;
class Stringclass
{
public static void main() throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
int c=0;
String str[] = new String[100]; // declaration of array of string
String text;
System.out.print("Input a sentence : ");
text = br.readLine();

// convert the string into upper case
String st = text.toUpperCase();

// creation of string tokenizer object
StringTokenizer temp = new StringTokenizer(st);
// extracting words from text and storing in array ot string str[]
while(temp.hasMoreTokens())
{
str[c++]=temp.nextToken();
} // end of while

// printing words in cyclic form

System.out.println("OUTPUT ");
System.out.println("Input sentence in upper case form :"+st);
System.out.println("Cyclic form of the sentence :");
for(int i=0; i<c;i++)
{
for(int j = i; j<c;j++)
{
System.out.print(str[j]+" ");
} // end for i loop
if(i != 0)
{
for(int k=0;k<i;k++)
{
System.out.print(str[k]+" ");
} // end for k loop
} // end if
System.out.println(); // shift to new line
} // end for i loop
} // end main function
} // end of class




