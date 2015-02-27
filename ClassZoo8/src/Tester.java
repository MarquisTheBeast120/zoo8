import javax.swing.*;
import java.awt.*;

final public class Tester {

    JFrame frame;
    DrawPanel drawPanel;

    private int oneX = 7;
    private int oneY = 7;
    
    private int twoX = 200;
    private int twoY = 7;

    boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;
    
    boolean up2 = true;
    boolean	down2 = false ;
    boolean left2 =  true;
    boolean right2 = false;
    
    public static void main(String[] args) {
        new Tester().go();
    }

    private void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setLocation(575, 55);
        moveIt();
    //    moveIt2();
    }

    class DrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.RED);
            g.fillRect(3, 3, this.getWidth()-6, this.getHeight()-6);
            g.setColor(Color.WHITE);
            g.fillRect(6, 6, this.getWidth()-12, this.getHeight()-12);
            g.setColor(Color.BLACK);
            g.fillOval(oneX, oneY, 15, 15);
            
            g.fillOval(twoX, twoY, 15, 15);
            
            
        }
    }

    private void moveIt() {
        while(true){
            if(oneX >= 483){
                right = false;
                left = true;
            }
            if(oneX <= 7){
                right = true;
                left = false;
            }
            if(oneY >= 460){
                up = true;
                down = false;
            }
            if(oneY <= 7){
                up = false;
                down = true;
            }
            if(up){
                oneY--;
            }
            if(down){
                oneY++;
                
            }
            if(left){
                oneX--;
            }
            if(right){
                oneX++;
            }
        
        
    
  
                    if(twoX >= 480){
                        right2 = false;
                        left2 = true;
                  }
                    if(twoX <= 7){
                        right2 = true;
                        left2 = false;
                    }
                    if(twoY >= 460){
                        up2 = true;
                        down2 = false;
                    }
                    if(twoY <= 7){
                        up2 = false;
                        down2 = true;
                    }
                    if(up2){
                        twoY--;
                    }
                    if(down2){
                        twoY++;     
                    }
                    if(left2){
                        twoX--;
                    }
                    if(right2){
                        twoX++;
                    }
                    
      
            try{
                Thread.sleep(1);
            } catch (Exception exc){}
            frame.repaint();
        }
    }
}
