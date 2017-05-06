/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

/**
 *
 * @author student
 */
public class NewAppletss extends Applet 
{
Image i,j;
           int c=0,b=0;
             int y,x=20;
             int z=500;
             int a=255;
            int count=0;
            int u=12;
            int l=150;
            Random t = new Random();
             Random k = new Random();
            
            
            

    public void init() 
    {
       
        i = getImage(getCodeBase(),"duckling3.png");
         j = getImage(getCodeBase(),"bird.png");
       
         
    }
    public void paint(Graphics g)
    {
        
        count=count+10;
        if(x>50 && a>20)
        {
           Color color=new Color(a=a-8,a,a);
            setBackground(color);
                       
        }  
      
         y= 2*(x-19)*2+4;
  
        g.setColor(Color.orange);
        g.fillOval(x+=2, y, 70,70);
        
        if(x>100 && z<570)
       {
      
        g.setColor(Color.white);
        g.fillOval(500, 20, 70,70);
        g.setColor(Color.black);
        g.fillOval(z+=2, 20, 70,70);
       
     
       }
         if(x>100 && z>=570)
       {
      
        g.setColor(Color.white);
        g.fillOval(500, 20, 70,70);
        g.setColor(Color.black);
        g.fillOval(z-=2, 20, 70,70);
       
     
       }
        
     
          try
         {
               if(count>350)
         {
             
           int v=  t.nextInt(500);
           int b=  k.nextInt(500);
           g.setColor(Color.white);
            g.fillOval(v, b, 5,5);
         v=  t.nextInt(500);
            b=  k.nextInt(500);
             g.setColor(Color.white);
            g.fillOval(v, b, 5,5); 
             v=  t.nextInt(500);
            b=  k.nextInt(500);
             g.setColor(Color.white);
            g.fillOval(v, b, 5,5);
            v=  t.nextInt(500);
            b=  k.nextInt(500);
             g.setColor(Color.white);
            g.fillOval(v, b, 5,5);
             v=  t.nextInt(500);
            b=  k.nextInt(500);
             g.setColor(Color.white);
            g.fillOval(v, b, 5,5);
       
            
           
             
         }
           //Thread.sleep(100);
         }
         catch(Exception e)
         {
             
         }
          
          
          
          
    
        
         
      
         
      
     
         
             
         
        
        g.setColor(Color.blue);
        g.fillRect(0, 300, 700, 100);
        if(x<70)
        {
         g.setColor(Color.cyan);
          g.fillOval(u++,250 , 20,20);
            g.setColor(Color.ORANGE);
        g.fillRect(u++, 270, 20, 30);
          g.setColor(Color.cyan);
          g.fillOval(l--,250 , 20,20);
            g.setColor(Color.ORANGE);
        g.fillRect(l--, 270, 20, 30);
                }
         g.setColor(Color.cyan);
          g.fillOval(u,250 , 20,20);
            g.setColor(Color.black);
        g.fillRect(u, 270, 20, 30);
          g.setColor(Color.cyan);
          g.fillOval(l,250 , 20,20);
            g.setColor(Color.black);
    //         g.setColor(Color.red);
    //         int n=l;
     //     g.fillOval(n--,250 , 5,5);
          
        g.fillRect(l, 270, 20, 30);
        g.setColor(Color.magenta);
        g.fillOval(190, 150, 100, 100);
        g.setColor(Color.yellow);
        g.fillRect(190, 200, 100, 100);
        g.setColor(Color.black);
        g.fillRect(200, 230, 20, 20);
        g.setColor(Color.black);
        g.fillRect(260, 230, 20, 20);
        g.setColor(Color.black);
        g.fillRect(230, 250, 20, 50);
        
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(400, 200, 50, 100);
        g.setColor(Color.GREEN);
        g.fillOval(450, 150, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(400, 150, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(450, 180, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(450, 120, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(450, 120, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(350, 120, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(350, 150, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(400, 120, 50, 50);
         g.setColor(Color.GREEN);
        g.fillOval(350, 190, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(380, 80, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(430, 80, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(400, 40, 50, 50);
        g.drawImage(i, c+=15,290,this);
           g.drawImage(j, b+=10,90,this);

         try
         {
             Thread.sleep(500);
         }
         catch(Exception e)
         {
             
         }
    
        repaint();
    // TODO overwrite start(), stop() and destroy() methods

}
}