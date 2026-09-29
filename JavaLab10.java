import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridLayout;


public class JavaLab10 extends JFrame{
    JavaLab10(){
        setSize(400,400);
        GridLayout gl = new GridLayout(4,3);
        setLayout(gl);
        String s;
        String arr[];
        try{
        FileInputStream fin = new FileInputStream("table.txt");
        Scanner scn = new Scanner(fin);
        while(scn.hasNextLine()){
        s = scn.nextLine();
        arr =s.split(",");
        
        for(String i:arr){
            JLabel l1 = new JLabel(i);
            add(l1);
        }
    }
        scn.close();
    }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JavaLab10();
    }
}
