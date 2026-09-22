import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
public class Adapter extends MouseAdapter{
    JLabel x;
    public Adapter(){
        JFrame fr = new JFrame();
        fr.setSize(400,400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x =new JLabel();
        fr.add(x);
        Font f = new Font("Arial",Font.BOLD,20);
        x.setForeground(Color.red);
        x.setAlignmentX(Component.CENTER_ALIGNMENT);
        x.setAlignmentY(Component.CENTER_ALIGNMENT);
        x.setFont(f);
        fr.addMouseListener(this);
        fr.addMouseMotionListener(this);
        fr.setLayout(new GridBagLayout());
        fr.setVisible(true);
    }
    @Override 
    public void mouseClicked(MouseEvent e){
        x.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e){
        x.setText("Mouse Pressed");  
    }
    public void mouseReleased(MouseEvent e){
        x.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent e){
        x.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        x.setText("Mouse Exited");
    }
    public void mouseDragged(MouseEvent e){
        x.setText("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent e){
        x.setText("Mouse Moved");
    }
    public static void main(String[] args){
            new Adapter(); 
    }
}
