import java.sql.*;
public class CreateDatabase {

    private static String jdbcDriver = "com.mysql.jdbc.Driver";
    private static String dbName = "Welcome";


    public static void main(String[] args) throws Exception {
        Class.forName(jdbcDriver);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=");
        Statement s = conn.createStatement();
        int Result = s.executeUpdate("CREATE DATABASE "+dbName);
       
    }
}