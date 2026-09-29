import javax.swing.*;
import java.awt.*;


public class JavaLab2 extends JFrame{
    private JButton[] buttons = new JButton[10];
    private JTextField idk = new JTextField(20);
    private JLabel result = new JLabel();

    JavaLab2(){
        JPanel p2 = new JPanel();
        setLayout(null);
        idk.setBounds(50,25,300,50);
        idk.setEditable(false);
        setSize(400,500);
     GridLayout gl = new GridLayout(4,4,10,10);
     GridLayout gf = new GridLayout(2, 1);
     setLayout(gf);
     add(p2);
       p2.setLayout(gl);
     for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            p2.add(buttons[i]);    
        }
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
       public static void main(String[] args) {
        new JavaLab2();
       }
}
