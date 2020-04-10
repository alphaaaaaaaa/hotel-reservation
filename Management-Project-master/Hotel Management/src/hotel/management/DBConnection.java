package hotel.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection 
{
    private static Connection connection=getConnection();
    private DBConnection()
    {

    }
    public static Connection getConnection()
    {
        if(connection==null)
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/HotelMangement","root","");
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null,"Exception in DBConnection "+ e);
            
        }}
        return connection;
    }
}
