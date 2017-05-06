class Convert
{
    int N;
    int ar[];
    int count,c;
    Convert()
    {
        N=0;
        count=0;
        c=0;
    }
    void inpnum(int n)
    {
        N=n;
    }
    void num_to_words()
    {
        String name="";
        int count=0;
        int n=N;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        c=count-1;
       
        int ar[]=new int[count];
     
        int nn=N;
        for(int i=c;i>=0;i--)
        {
            ar[i]=nn%10;
            nn=nn/10;
        }
        if(count==1)
        name=toName(N);
        else if(count==2)
        name=twoDigit(ar[0],ar[1]);
        else if(count==3)
        name=toName(ar[0])+" hundred "+twoDigit((ar[count-2]),(ar[count-1]));
        else if(count==4)
        name=toName(ar[0])+" thousand "+toName(ar[1])+" hundred "+twoDigit((ar[count-2]),(ar[count-1]));
        else if(count==5)
        name=twoDigit(ar[0],ar[1])+" thousand "+toName(ar[2])+" hundred "+twoDigit((ar[count-2]),(ar[count-1]));
        else if(count==6)
        name=toName(ar[0])+" lac "+twoDigit(ar[1],ar[2])+" thousand "+toName(ar[3])+" hundred "+twoDigit((ar[count-2]),(ar[count-1]));
        System.out.println(name);
    }
    String twoDigit(int a,int b)
    {
        String name="";
        if(a==1)
        {
            if(b==0)
            name="ten";
            else if(b==1)
            name="eleven";
            else if(b==2)
            name="twelve";
            else if(b==3)
            name="thirteen";
            else if(b==5)
            name="fifteen";
            else if(b==8)
            name="eighteen";
            else
            name=toName(b)+"teen";
        }
        else if(a==2)
        name="twenty "+toName(b);
        else if(a==3)
        name="thirty "+toName(b);
        else if(a==5)
        name="fifty "+toName(b);
        else if(a==8)
        name="eighty "+toName(b);
        else
        name=toName(a)+"ty "+toName(b);
        return name;
    }
    String toName(int a)
    {
        String str="";
        switch(a)
        {
            case 1:
            str="one";
            break;
            case 2:
            str="two";
            break;
            case 3:
            str="three";
            break;
            case 4:
            str="four";
            break;
            case 5:
            str="five";
            break;
            case 6:
            str="six";
            break;
            case 7:
            str="seven";
            break;
            case 8:
            str="eight";
            break;
            case 9:
            str="nine";
            break;
            default:
            str="";
        }
        return str;
    }
    
    }
//Aman Chopra 
//12th Science
