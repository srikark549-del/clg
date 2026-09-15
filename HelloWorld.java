import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class HelloWorld {
    public static void main(String[] args){
          JFrame frame = new JFrame();
          JLabel label = new JLabel("Hello World",SwingConstants.CENTER);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(400,400);
          frame.add(label);
    }
}