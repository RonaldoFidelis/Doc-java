import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {
  public static void main(String[] args) {

    try {
      Connection connection = FactoryConnection.connection();
      Statement statement = connection.createStatement();
      System.out.println("Conexão bem-sucedida!");

      ResultSet resultSet = statement.executeQuery("SELECT * FROM CLIENTE WHERE NOME = 'JORGE';");

      if (resultSet.next()) {
        statement.executeUpdate("UPDATE CLIENTE SET CPF = 22233344450 WHERE NOME = 'JORGE';");
        System.out.println("Update bem-sucedido!");
      } else {
        System.out.println("Nenhum resultado encontrado para o nome 'JORGE'.");
      }

      resultSet.close();
      statement.close();
      connection.close();
    } catch (SQLException e) {
      System.out.println("Erro de conexão: " + e.getMessage());
    } finally {
      System.out.println("A conexão foi fechada.");
    }
  }
}
