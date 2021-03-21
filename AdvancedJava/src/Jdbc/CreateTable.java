import java.sql.*;
public class CreateTable{
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost/welcome";

  static final String USER = "root";
  static final String PASS = "";

  public static void main(String[] args) throws Exception {
    Connection conn = null;
    Statement stmt = null;

    Class.forName(JDBC_DRIVER);
    conn = DriverManager.getConnection(DB_URL, USER, PASS);
    System.out.println("table creation");
    stmt = conn.createStatement();

    conn = DriverManager.getConnection(DB_URL, USER, PASS);

    stmt = conn.createStatement();

    String sql = "CREATE TABLE result" 
            + "(id INTEGER not NULL, "
             + " rollno int, " 
        + "name VARCHAR(50), " 
            + " result VARCHAR(50), "
        + " grade VARCHAR(250), " 
            + " PRIMARY KEY ( id ))";

    stmt.executeUpdate(sql);
    System.out.println("table is created");
    stmt.close();
    conn.close();
  }
}
