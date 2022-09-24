import java.awt.*;
import java.awt.event.*;

public class renderer extends Frame {
   public renderer(String title){
      super(title);
      
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   } 

   public renderer setsize(int width, int height) {
        setSize(width,height);
        return this;
   }

   @Override
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
         RenderingHints.VALUE_ANTIALIAS_ON);
      Font font = new Font("Serif", Font.PLAIN, 24);
      g2.setFont(font);
      g2.drawString("overide paint to do it", 50, 70); 
   }
}