import java.util.*;
class check 
{
    static int a = 0;
    public static void main(String[] args)
    {
        a=5;
        String caps = "aman";
        String noncaps = "bcd";
        if((caps.compareTo(noncaps))<1)
        System.out.println("Hi");
        int max = Integer.MAX_VALUE;
        String b = a+"";
        System.out.println(b);
        long v = 0;
        Scanner s = new Scanner(System.in);
        //v = s.nextLong();
        String conver = Long.toString(v);
        long bv = Long.parseLong(conver);
        int iArr[] = {2, 1, 9, 6, 4};
        String aman = "aman";
        char[] arr = aman.toCharArray();
        Arrays.sort(arr,0,arr.length);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        int number = al.get(0);
        Iterator itr = al.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());
        for(Integer aa:al)
        System.out.println(aa);//addAll,removeAll,retainAll
        
    }
}