 
import java.util.*;
class Lab7que1
{
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Eneter the word.");
            String word=s.nextLine();
            int b;
            try
            {
                b=Integer.parseInt(word);
                System.out.println("The integer is :"+b);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Error illegal type conversion");
            }
        }
}