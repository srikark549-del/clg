import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Javalab13 {
    public static void main(String[] args) {
        Hashtable<String, String> phoneToName = new Hashtable<>();
        try {
            FileInputStream fin = new FileInputStream("student.txt");
            Scanner fileScanner = new Scanner(fin);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] fields = line.split("\\s+");
                    String name = fields[0];
                    String phone = fields[1];
                    phoneToName.put(name,phone);
                    System.out.println("Name: " + name + ", Phone: " + phone);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt file not found.");
            return;
        }
        int trig =0;
        while(trig == 0){
        System.out.println("------MENU------");
        System.out.println("1. Search by Name");
        System.out.println("2. Search by Phone Number");
        System.out.println("3. Exit");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter name to search: ");
                String name = scanner.next();
                String phone = phoneToName.get(name);
                if (phone != null) {
                    System.out.println("Phone number for " + name + ": " + phone);
                } else {
                    System.out.println("Name not found.");
                }
                break;
            case 2:
                break;
            case 3:
                trig = 1;
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
        System.out.println(phoneToName);
    }
}