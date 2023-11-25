import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FactoryConnection {
  public static Connection connection() {
    try {
      Properties prop = getProperties();
      final String url = prop.getProperty("database.path");
      final String user = prop.getProperty("database.user");
      final String password = prop.getProperty("database.password");

      return DriverManager.getConnection(url, user, password);
    } catch (SQLException | IOException e) {
      throw new RuntimeException(e);
    }
  }
  private static Properties getProperties() throws IOException {
    String path = "/configDatabase.properties";
    Properties prop = new Properties();
    prop.load(FactoryConnection.class.getResourceAsStream(path));
    return prop;
  }
}
