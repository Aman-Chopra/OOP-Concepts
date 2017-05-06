import java.io.*;
import java.lang.*;

class Quiz
    {
        public static void main()throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int choice=0;          
            System.out.println("   *******         ***        ***    ***********    ***************         ");
            System.out.println("  ***   ***        ***        ***    ***********    ***************         ");
            System.out.println(" ***     ***       ***        ***        ***                   ***          ");
            System.out.println(" ***     ***       ***        ***        ***                  ***              ");
            System.out.println("***       ***      ***        ***        ***                 ***               ");
            System.out.println("***       ***      ***        ***        ***                ***                ");
            System.out.println("***  **   ***      ***        ***        ***               ***                 ");
            System.out.println("***   **  ***      ***        ***        ***              ***                  ");
            System.out.println("***    ******      ***        ***        ***             ***                   ");
            System.out.println("***     *****      ***        ***        ***            ***                    ");
            System.out.println(" ***    *****      ***        ***        ***           ***                     ");
            System.out.println(" ***    *** **     ***        ***        ***          ***                      ");
            System.out.println("  ***  ***   **     ***      ***         ***         ***                       ");
            System.out.println("  ***  ***    **     ***    ***      ***********   ****************                        ");
            System.out.println("   ******      **     ********       ***********   ****************                         ");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Hi let us test your knowledge with a small quiz.");
            System.out.println("The moment you get a wrong answer the quiz will automatically terminate.");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
            
            
            
            
            
            System.out.println("\t\t\tCHOOSE ANY ONE OF THE SUBJECTS TO ASK QUESTIONS FROM.");
            System.out.println("ENTER");
            System.out.println("1 for Geography");
            System.out.println("2 for Biology");
            System.out.println("3 for Physics");
            System.out.println("4 for History");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
            int a=0;int b=0;int c=0;int d=0;int e=0;int total=0;
                       
            choice=Integer.parseInt(br.readLine());
            
            System.out.println("Here comes the questions.");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            if(choice==1)
            {
                System.out.println("================GEOGRAPHY===================");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("Ques-a:-Which is the southern most tip of Indian mainland?");
                System.out.println("\t1-Indra Point\t2-Tuticorin\t3-Trivandrum\t4-Kanyakumari");
                
                a=Integer.parseInt(br.readLine());
                
                if(a!=4) 
                {
                    System.out.println("");
                    System.out.println("");
                    
                    
                    System.out.println("Sorry Wrong Answer");
                    System.out.println("Correct answer was;- Kanyakumari");
                    System.out.println("You got "+total+" answers correct.");
                    

                }
                else
                {
                    total++;
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Ques-b:-Which canal shortened the distance between India and Europe?");
                    System.out.println("\t1-Buckingam canal\t2-Suez canal\t3-Gandhi canal\t4-Panama canal");
                    
                    b=Integer.parseInt(br.readLine());
                    
                    if(b!=2)
                    {
                        System.out.println("");
                        System.out.println("");
                        
                        System.out.println("Sorry Wrong Answer");
                        System.out.println("Correct answer was;- Suez canal.");
                        System.out.println("You got "+total+" answers correct.");

                    }
                    else
                    {
                        total++;
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Ques-c:-Which is the second highest peak in the world?");
                        System.out.println("\t1-Mt Everest\t2-K2\t3-Kanchenjenga\t4-Nanga Parbat");
                        
                        c=Integer.parseInt(br.readLine());
                        
                        if(c!=2)
                        {   System.out.println("");
                            System.out.println("");
                            
                            System.out.println("Sorry Wrong Answer");
                            System.out.println("Correct answer was;- K2");
                            System.out.println("You got "+total+" answers correct.");

                        }
                        else
                        {   total++;
                            System.out.println("");
                            System.out.println("");
                            System.out.println("Ques-d:-Which of the following is distributory river of Ganga?");
                            System.out.println("\t1-Yamuna\t2-Gangotri\t3-Ghagra\t4-Hooghly");
                            
                            d=Integer.parseInt(br.readLine());
                            
                            if(d!=4)
                            {   System.out.println("");
                                System.out.println("");
                                
                                System.out.println("Sorry Wrong Answer");
                                System.out.println("Correct answer was;- Hooghly");
                                System.out.println("You got "+total+" answers correct.");

                            }
                            else
                            {   total++;
                                System.out.println("");
                                System.out.println("");
                                System.out.println("Ques-e:-Name the new alluvium which is very fertile.");
                                System.out.println("\t1-Khadar\t2-Bhangar\t3-Bhabar\t4-Tarai");
                                
                                e=Integer.parseInt(br.readLine());
                                
                                if(e!=4)
                                {
                                    System.out.println("");
                                    System.out.println("");
                                    
                                    System.out.println("Sorry Wrong Answer");
                                    System.out.println("Correct answer was;- Tarai");
                                    System.out.println("You got "+total+" answers correct.");

                                    
                                }
                                else
                                {   total++;
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("Congratulations you got all 5 answers in geography section correct.");
   
                                    
                                }
                                     
                            }
                            
                        }
                    }
                }
            }
            
            else if(choice==2)
            {
                System.out.println("====================BIOLOGY======================");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("Ques-a:-Cell wall is...");
                System.out.println("\t1-permeable\t2-semi-permeable\t3-differentially permeable\t4-impermeable");
                
                a=Integer.parseInt(br.readLine());
                
                if(a!=1)
                {               System.out.println("");
                                System.out.println("");
                                
                                System.out.println("Sorry Wrong Answer");
                                System.out.println("Correct answer was;- permeable");
                                System.out.println("You got "+total+" answers correct.");
                }
                
                else
                {
                                total++;
                                System.out.println("");
                                System.out.println("");
                                System.out.println("Ques-b:-Lysosomes are generally found in...");
                                System.out.println("\t1-animal cells\t2-plant cells\t3-both 1 and 2\t4-bacterial cells");
                                
                                b=Integer.parseInt(br.readLine());
                                
                                if(b!=1)
                                {
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("Sorry Wrong Answer");
                                    System.out.println("Correct answer was:- animal cells");
                                    System.out.println("You got "+total+" answers correct.");
                                }
                                else
                                {   total++;
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("Ques-c:-Chromosomes are made up of....");
                                    System.out.println("\t1-DNA and RNA\t2-DNA\t3-RNA\t4-DNA and proteins");
                                    
                                    c=Integer.parseInt(br.readLine());
                                    
                                    if(c!=4)
                                    {
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("Sorry Wrong Answer");
                                        System.out.println("Correct answer was:- DNA and proteins");
                                        System.out.println("You got "+total+" answers correct.");
                                    }
                                    else
                                    {
                                        total++;
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("Ques-d:-Blood is....");
                                        System.out.println("\t1-acidic\t2-alkaline\t3-variable\t4-neutral");
                                        
                                        d=Integer.parseInt(br.readLine());
                                        
                                        if(d!=2)
                                        {
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Sorry Wrong Answer");
                                            System.out.println("Correct answer was:- alkaline");
                                            System.out.println("You got "+total+" answers correct.");
                                        }
                                        else
                                        {   total++;
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Ques-e:-Leprosy is due to:-");
                                            System.out.println("\t1-Monocytis\t2-TMV\t3-Salmonella\t4-Mycobacterium");
                                            
                                            e=Integer.parseInt(br.readLine());;
                                            
                                            if(e!=4)
                                            {   
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("Sorry Wrong Answer");
                                                System.out.println("Correct answer was:- Mycobacterium");
                                                System.out.println("You got "+total+" answers correct.");
                                            }
                                            else
                                            {
                                                total++;
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("Congatulations you got all 5 answers.");
                                                
                                            }
                                            
                                            
                                        }
                                        
                                    }
                                    
                                    
                                }
                }
                    
            }
            
            
            else if(choice==3)
            {
                System.out.println("=======================PHYSICS========================");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                
                System.out.println("Ques-a:-Who gave the laws of motion?");
                System.out.println("\t1-Newton\t2-Einstein\t3-Darwin\t4-Dickens");
                
                a=Integer.parseInt(br.readLine());
                
                if(a!=1)
                {
                                            System.out.println("");
                                            System.out.println("");
                                            
                                            System.out.println("Sorry Wrong Answer");
                                            System.out.println("Correct answer was:- Newton");
                                            System.out.println("You got "+total+" answers correct.");
                }
                else
                {
                                                total++;
                                                System.out.println("");
                                                System.out.println("");
                                                System.out.println("Ques-b:-A streched spring posesses.......energy");
                                                System.out.println("\t1-kinetic\t2-elastic potential\t3-electric\t4-magnetic");
                                                
                                                b=Integer.parseInt(br.readLine());
                                                
                                                if(b!=2)
                                                {
                                                    System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Sorry Wrong Answer");
                                                        System.out.println("Correct answer was:- elastic potential");
                                                        System.out.println("You got "+total+" answers correct.");
                                                }
                                                
                                                else
                                                {
                                                   total++;
                                                   System.out.println("");
                                                   System.out.println("");
                                                   System.out.println("Ques-c:-Shaving mirrors are.........mirrors");
                                                   System.out.println("\t1-convex\t2-concave\t3-plane\t4-none of these"); 
                                                   
                                                   c=Integer.parseInt(br.readLine());
                                                   
                                                   if(c!=2)
                                                   {
                                                       System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Sorry Wrong Answer");
                                                        System.out.println("Correct answer was:- concave");
                                                        System.out.println("You got "+total+" answers correct.");
                                                    }
                                                    
                                                    else
                                                    {
                                                        total++;
                                                        System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Ques-d:-Good conductors have many loosely bound...");
                                                        System.out.println("\t1-atoms\t2-molecules\t3-protons\t4-electrons");
                                                        
                                                        d=Integer.parseInt(br.readLine());
                                                        
                                                        if(d!=4)
                                                        {
                                                            System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Sorry Wrong Answer");
                                                        System.out.println("Correct answer was:- electrons");
                                                        System.out.println("You got "+total+" answers correct.");
                                                        }
                                                        
                                                        else
                                                        {
                                                            total++;
                                                            System.out.println("");
                                                            System.out.println("");
                                                            System.out.println("Ques-e:-The conductance can't be expressed in...");
                                                            System.out.println("\t1-mho\t2-1/ohm\t3-siemen\t4-ohm*(1/m)");
                                                            
                                                            e=Integer.parseInt(br.readLine());
                                                            
                                                            if(e!=4)
                                                            {
                                                                System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Sorry Wrong Answer");
                                                        System.out.println("Correct answer was:- ohm*(1/m)");
                                                        System.out.println("You got "+total+" answers correct.");
                                                            }
                                                            else
                                                            {
                                                                total++;
                                                        System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Congratulations you have got all the answers.");
                                                            }
                                                        }
                                                    }
                                                    
                                                }
                                                
                }
            }
            
            else if(choice==4)
            {
                System.out.println("===================HISTORY==================");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                
                System.out.println("Ques-a:-Who was the founder of Indian National Congress?");
                System.out.println("\t1-M K Gandhi\t2-W C Banerjee\t3-A O Hume\t4-Motilal Nehru");
                
                a=Integer.parseInt(br.readLine());
                
                if(a!=3)
                {
                        System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Sorry Wrong Answer");
                                                        System.out.println("Correct answer was:- A O Hume");
                                                        System.out.println("You got "+total+" answers correct.");
                }
                
                else
                {
                   total++;
                                                            System.out.println("");
                                                            System.out.println(""); 
                                                            System.out.println("Ques-b:-Vande Matram was written by..");
                                                            System.out.println("\t1-Mohd.Iqbal\t2-B C Chaterjee\t3-B G Tilak\t4-M K Gandhi");
                                                            
                                                            b=Integer.parseInt(br.readLine());
                                                            
                                                            if(b!=2)
                                                            {System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Sorry Wrong Answer");
                                                        System.out.println("Correct answer was:- B C Chatterjee");
                                                        System.out.println("You got "+total+" answers correct.");
                                                                
                                                            }
                                                        
                                                        else
                                                        {
                                                            total++;
                                                            System.out.println("");
                                                            System.out.println(""); 
                                                            System.out.println("Ques-c:-In which year INC was established...."); 
                                                            System.out.println("\t1-1865\t2-1875\t3-1885\t4-1895");
                                                            
                                                            c=Integer.parseInt(br.readLine());
                                                            
                                                            if(c!=3)
                                                            {
                                                                System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Sorry Wrong Answer");
                                                        System.out.println("Correct answer was:- 1885");
                                                        System.out.println("You got "+total+" answers correct.");
                                                            }
                                                            
                                                            else
                                                            {
                                                                total++;
                                                            System.out.println("");
                                                            System.out.println("");
                                                            System.out.println("Ques-d:-Who was known as 'Lion of Punjab'");
                                                            System.out.println("\t1-Lala Lajpat Rai\t2-M K Gandhi\t3-Mohd Iqbal\t4-Motilal Nehru");
                                                            
                                                            d=Integer.parseInt(br.readLine());
                                                            
                                                            if(d!=1)
                                                            {
                                                                System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Sorry Wrong Answer");
                                                        System.out.println("Correct answer was:- Lala Lajpat Rai");
                                                        System.out.println("You got "+total+" answers correct.");
                                                            }
                                                            else
                                                            {
                                                                total++;
                                                            System.out.println("");
                                                            System.out.println("");
                                                            System.out.println("Ques-e:-What was the nationality of A O Hume");
                                                            System.out.println("\t1-Irish\t2-Englishmen\t3-German\t4-Scotish");
                                                            
                                                            e=Integer.parseInt(br.readLine());
                                                            
                                                            if(e!=4)
                                                            {
                                                                System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("Sorry Wrong Answer");
                                                        System.out.println("Correct answer was:- Scotish");
                                                        System.out.println("You got "+total+" answers correct.");
                                                            }
                                                            
                                                            else
                                                            {
                                                                System.out.println("");
                                                        System.out.println("");System.out.println("");
                                                        System.out.println("Congratulations you got all the answers correct");
                                                            }
                                                            }
                                                            
                                                            }
                                                        }
                                                    }
                
        }
        else
        System.out.println("Wrong choice entered.");
    }}
                        
                    
                    