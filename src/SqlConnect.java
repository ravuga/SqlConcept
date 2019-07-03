import java.sql.*;
import java.util.Scanner;

public class SqlConnect {
    public static void main(String args[])
    {
        try{
            System.out.println("Driver Loaded");

            // Connection Establishment
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","xixeon");
/*
             Insert Data into  HELP table


            //Taking User Input
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter Help ID : ");
            int helpId = obj.nextInt();
            System.out.print("Enter Help Description ");
            String helpDesc = obj.next();

            //prepared Statement
            PreparedStatement ps = con1.prepareStatement("Insert into help values (?,?);");
            ps.setInt(1,helpId);
            ps.setString(2,helpDesc);

            // Execute And Update
            int status = ps.executeUpdate();

            // Checking whether data is updated or not
            if(status > 0)
            {
                System.out.println("Data Updated");
            }

 */
            // View Data in The table
            PreparedStatement ps1 = con1.prepareStatement("SELECT * from HELP;");
            ResultSet rs = ps1.executeQuery();
            System.out.println("/n");
            while (rs.next())
            {
                System.out.println("Help Id is "+ rs.getInt(1));
                System.out.println("Help Description "+rs.getString(2));
            }



        }catch (SQLException e) {
            System.out.println(e);
        }
    }
}
