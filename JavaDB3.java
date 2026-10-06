import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;

public class JavaDB3 {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded ...");

            String url = "jdbc:mysql://localhost:3306/JAVATEST";

            Connection con = DriverManager.getConnection(
                    url, "root", "Orange@1"
            );

            System.out.println("DB Connected...");

            Statement st = con.createStatement();

            System.out.println("Welcome.");

            String opt = "";
            String htno = "", sname = "", mobile = "", sql = "";

            Scanner sc = new Scanner(System.in);

            while (!opt.equals("5")) {

                System.out.println("\n-----MENU-----");
                System.out.println("1.Insert");
                System.out.println("2.Edit");
                System.out.println("3.Delete");
                System.out.println("4.Display");
                System.out.println("5.Exit");
                System.out.println("-------------");

                System.out.println("Enter your option");
                opt = sc.next();

                switch (opt) {

                    case "1":
                        System.out.println("Enter HTNO");
                        htno = sc.next();

                        System.out.println("Enter Name");
                        sname = sc.next();

                        System.out.println("Enter Mobile");
                        mobile = sc.next();

                        sql = "insert into students values ('"
                                + htno + "','"
                                + sname + "','"
                                + mobile + "')";

                        if (st.executeUpdate(sql) > 0) {
                            System.out.println("Record Inserted");
                        }

                        break;

                    case "2":
                        System.out.println("Edit option selected");
                        break;

                    case "3":
                        System.out.println("Delete option selected");
                        break;

                    case "4":
                        ResultSet rs = st.executeQuery(
                                "select * from students"
                        );

                        System.out.println("\nHTNO\tNAME\tMOBILE");
                        System.out.println("-----------------------------");

                        while (rs.next()) {
                            System.out.println(
                                    rs.getString("htno") + "\t" +
                                    rs.getString("sname") + "\t" +
                                    rs.getString("mobile")
                            );
                        }

                        rs.close();
                        break;

                    case "5":
                        System.out.println("Exit");
                        break;

                    default:
                        System.out.println("Invalid option");
                }
            }

            con.close();
            sc.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}