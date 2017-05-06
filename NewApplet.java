import java.applet.Applet;
import java.awt.*;

public class NewApplet extends Applet {

     int x;
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {Font f = new Font("Helvetica", Font.BOLD,10);
   
    g.setFont(f);
                g.drawString("HELLO WORLD!", (x*10)+60, 70);
                x++;
     try
     {Thread.sleep(50);
     }
     catch(Exception e)
     {}
     if(x!=10)
         repaint();
}
}

