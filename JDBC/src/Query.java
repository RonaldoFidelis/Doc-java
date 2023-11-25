import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {
  public static void main(String[] args) {
    final String url = "jdbc:mysql://localhost:3306/LearnJava";
    final String user = "root";
    final String password = "root1234567";

    try {
      Connection connection = DriverManager.getConnection(url, user, password);
      System.out.println("Conexão bem-sucedida!");

      Statement statement = connection.createStatement();

      // Executar a consulta SELECT
      ResultSet resultSet = statement.executeQuery("SELECT * FROM CLIENTE WHERE NOME = 'JORGE';");

      // Verificar se há resultados antes de tentar executar o UPDATE
      if (resultSet.next()) {
        // Executar a atualização
        statement.executeUpdate("ALTER TABLE CLIENTE MODIFY CPF VARCHAR(11);");
        statement.executeUpdate("UPDATE CLIENTE SET CPF = 11111111122 WHERE NOME = 'JORGE';");
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
