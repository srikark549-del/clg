import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class Lab8 extends JFrame implements ItemListener {
    private JLabel l1;
    private JRadioButton red;
    private JRadioButton green;
    private JRadioButton yellow;
    public Lab8() {
        setSize(700, 300);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        l1 = new JLabel();
        l1.setFont(new Font("Arial", Font.BOLD, 24)); 
        red = new JRadioButton("Red");
        green = new JRadioButton("Green");
        yellow = new JRadioButton("Yellow");
        GridLayout gl = new GridLayout(2, 1);
        ButtonGroup bg = new ButtonGroup();
        bg.add(red);
        bg.add(green);
        bg.add(yellow);
        red.addItemListener(this);
        green.addItemListener(this);
        yellow.addItemListener(this);
        red.setForeground(Color.RED);
        green.setForeground(new Color(0, 150, 0));
        yellow.setForeground(new Color(220, 160, 0));
        setLayout(gl);
        add(p1);
        add(p2);
        p1.add(l1);
        p2.add(green);
        p2.add(yellow);
        p2.add(red);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
    @Override 
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (e.getSource() == red) {
                l1.setText("STOP");
                l1.setForeground(Color.RED);
            } else if (e.getSource() == green) {
                l1.setText("GO");
                l1.setForeground(new Color(0, 150, 0));
            } else if (e.getSource() == yellow) {
                l1.setText("READY");
                l1.setForeground(new Color(220, 160, 0));
            }
        }
    }
}
public class TrafficLab {
    public static void main(String[] args) {
      new Lab8();
}
}

