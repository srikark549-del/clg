import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HelloWorld implements ActionListener {
    static JTextField x2;
    static JTextField y2;
    static JTextField resField;
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        FlowLayout fw = new FlowLayout();
        frame.setLayout(fw);
        frame.setSize(750, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel x1 = new JLabel("Number 1:");
        frame.add(x1);
        x2 = new JTextField(15);
        frame.add(x2);
        JLabel y1 = new JLabel("Number 2:");
        frame.add(y1);
        y2 = new JTextField(15);
        frame.add(y2);
        JLabel res = new JLabel("Result:");
        frame.add(res);
        resField = new JTextField(20);
        frame.add(resField);
        JButton a = new JButton("DIVIDE");
        frame.add(a);
        HelloWorld obj = new HelloWorld();
        a.addActionListener(obj);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(x2.getText());
        int b = Integer.parseInt(y2.getText());
        float c = (float) a / b;
        resField.setText(c + "");
    }
}