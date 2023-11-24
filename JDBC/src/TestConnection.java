import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
  public static void main(String[] args) {
    final String url = "jdbc:mysql://localhost:3306";
    final String user = "root";
    final String password = "root1234567";

    try {
      Connection connection = DriverManager.getConnection(url, user, password);
      System.out.println("Connection have be success!");

      connection.close();
    } catch (SQLException e) {
      System.out.println("Erro de conexão: " + e.getMessage());
    } finally {
      System.out.println("The connection has been closed.");
    }
  }
}
