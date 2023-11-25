import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {

  public static Connection connection() {
    try {
      final String url = "jdbc:mysql://localhost:3306/LearnJava";
      final String user = "root";
      final String password = "root1234567";

      return DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
