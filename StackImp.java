import java.util.*;
class arrayStack
{
    int arr[];
    int top, size, len;
    public arrayStack(int n)
    {
        size = n;
        len = 0;
        arr = new int[size];
        top = -1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == size -1 ;        
    }
    public int getSize()
    {
        return len ;
    }
    public void push(int i)
    {
        if(top + 1 >= size)
            System.out.println("Overflow");
        if(top + 1 < size )
            arr[++top] = i;
        len++ ;
    }
    public int pop()
    {
        if( isEmpty() )
            System.out.println("Underflow");
        len-- ;
        return arr[top--]; 
    }    
    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }    
}
public class StackImp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);        
        System.out.println("Stack Test\n");
        System.out.println("Enter Size of Integer Stack ");
        int n = scan.nextInt();
        arrayStack stk = new arrayStack(n);
        char ch;
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. size");
            System.out.println("4. display");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push");
                try 
                {
                    stk.push( scan.nextInt() );
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }                         
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = " + stk.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                                        
            case 3 : 
                System.out.println("Size = " + stk.getSize());
                break; 
            case 4 : 
                System.out.println("Elements");
                stk.display(); 
                break; 
            default : 
                System.out.println("Wrong Entry \n ");
            }        
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');                 
    }
}