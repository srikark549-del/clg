import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JavaLab10 {
    JavaLab10(){
        try{
        FileInputStream fin = new FileInputStream("table.txt");
        Scanner scn = new Scanner(fin);
        while(scn.hasNextLine()){
        System.out.print(scn.nextLine()+"\n");
        }
        scn.close();
    }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new JavaLab10();
    }
}
