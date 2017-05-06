import java.applet.*;
import java.awt.*;
public class Faces extends Applet{
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(50,50,75,75);
        g.setColor(Color.black);
        g.fillOval(65,65,15,15);
        g.fillOval(95,65,15,15);
        g.drawOval(90,63,25,25);
        g.drawOval(60,63,25,25);
        for(int x = 0;x<=180;x+=10)//can use screen and overlay buffers.
        {
        g.drawArc (70,90,40,20,x,180);
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {}
    }
    }
}
        
        
       
        
        