class FirstThread extends Thread
{
  
  public void run()
  {
 
    
     for (int i=1; i<=10; i++)
     {
        System.out.println( "Messag from First Thread : " +i);
        try
        {
           Thread.sleep(1000);
        }
        catch (InterruptedException  interruptedException)
        {
          System.out.println(  "First Thread is interrupted when it is  sleeping" +interruptedException);
        }
      }
   }
}

class SecondThread extends Thread
{
 
  
  public void run()
  {
    
    for (int i=1; i<=10; i++)
    {
       System.out.println( "Messag from Second Thread : " +i);
       
       try
       {
          Thread.sleep (1000);
       }
       catch (InterruptedException interruptedException)
       {
          
           System.out.println( "Second Thread is interrupted when it is sleeping" +interruptedException);
       }
    }
  }
}

public class ThreadDemo
{
 
  public static void main(String args[])
  {
 
    
    FirstThread   firstThread = new FirstThread();
 
    
    SecondThread   secondThread = new SecondThread();
 
    
    firstThread.start();
 
    
    secondThread.start();
  }
}