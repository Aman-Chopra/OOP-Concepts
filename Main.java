import java.util.*;
public class Main
    {
        int start;
        int end;
        public static void main(String args[])
        {
            System.out.println("Hi");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            Main expected[] = new Main[a];
            Main planned[] = new Main[b];
            int i,j;
            for(i = 0;i<a; i++)
            {
                expected[i] = new Main();
                expected[i].start = in.nextInt();
                expected[i].end = in.nextInt();
            }
            for(i = 0;i<b; i++)
            {
                planned[i] = new Main();
                planned[i].start = in.nextInt();
                planned[i].end = in.nextInt();
            }
        }
    }
                