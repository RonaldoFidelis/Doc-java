import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetData {
  public static void main(String[] args) {
    try {
      Connection connection = FactoryConnection.connection();
      Statement statement = connection.createStatement();

      String querySQL = "SELECT * FROM CLIENTE WHERE NOME = 'GANDALF';";
      ResultSet resultQuery = statement.executeQuery(querySQL);

      List<InterfaceUser> user = new ArrayList<>();

      while (resultQuery.next()){
        String name = resultQuery.getString("NOME");
        String sex = resultQuery.getString("SEXO");
        String cpf = resultQuery.getString("CPF");
        String email = resultQuery.getString("EMAIL");
        String telefone = resultQuery.getString("TELEFONE");
        String endereco = resultQuery.getString("ENDERECO");

        user.add(new User(name, sex, cpf, email, telefone, endereco));
      }

      for (InterfaceUser currentUser : user){
        System.out.println(currentUser.name);
        for (String contact : currentUser.getContact()){
          System.out.println(contact);
        }
      }

      statement.close();
      connection.close();
    }catch (SQLException error) {
      throw new RuntimeException(error.getMessage());
    } finally {
      System.out.println("Connection closed.");
    }
  }
}
