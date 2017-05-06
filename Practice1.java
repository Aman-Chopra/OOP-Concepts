
 
import java.util.*;
class Myexception extends Exception
{   int detail;
    public Myexception(int c){
    detail = c;}
    @Override
    public String toString(){
    return "Too much repetition!";
   }
}
class Palin extends Thread
{ String str;

  Palin(String s)
  { str = s;
  
  }
  @Override
  public void run()
  { int flag = 0;
      for(int i=0, j=str.length()-1 ; i<str.length()/2 ; i++, j-- )
      { char a = str.charAt(i);
        char b = str.charAt(j);
        if(a!=b)
        {flag=1;
         break;
        }      
      }
      if(flag==0)
      {System.out.println("The string is a palindrome");
      
      }
      else
          System.out.println("Not a palindrome");
      
   }
}
class Strin extends Thread
{ String str;
  Strin(String s)
  { str = s;
  }
  @Override
  public void run()
  { int count=0;
    int j=0 , i=0 , k=0;
    String result = "";
    while(j<str.length()-1)
    { char a = str.charAt(i);
      char b = str.charAt(i+1);
      if(a==b)
      { i++;
        count++;
        j++;
          continue;
      }
      try{
      if(count>5)
          throw new Myexception(count);
      }
      catch(Myexception e)
      {System.out.println(e);
       return;
      }
      
      count=0;
      result += str.substring(k,i+1);
      k=i+1;
      if(i==0)
      {j++;i++;
          continue;}
      char c = str.charAt(i-1);
      if(a==c)
      {  result += str.charAt(i);
         i++;
      }
      else
      {i++;}
      j++;
    }
    result += str.charAt(k);
    for(int d=0 ; d<=count ; d++)
    { result += str.charAt(k);}
    System.out.println("new string : " + result);
    
  }
}
public class Practice1 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        String str = s.next();
     Palin obj1 = new Palin(str);
     
     System.out.println("enter a string");
     String st = s.next();
     Strin obj2 = new Strin(st);
     obj1.start();
     obj2.start();
     try
     { obj1.join();
       obj2.join();
     }
     catch(InterruptedException e)
     {}
     System.out.println("Main Thread Ends");
     }
    }
    

