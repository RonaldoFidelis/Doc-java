package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UseDAO implements ModelDAO {
  @Override
  public List<ModelUser> getByName(String name) {
    try {
      Connection connection = FactoryConnection.connection();
      String querySQL = "SELECT * FROM CLIENTE WHERE NOME = ?;";

      try (PreparedStatement statement = connection.prepareStatement(querySQL)) {
        statement.setString(1, name);

        try (ResultSet resultQuery = statement.executeQuery()) {
          List<ModelUser> users = new ArrayList<>();

          while (resultQuery.next()) {
            String nameUse = resultQuery.getString("NOME");
            String sex = resultQuery.getString("SEXO");
            String cpf = resultQuery.getString("CPF");
            String email = resultQuery.getString("EMAIL");
            String telefone = resultQuery.getString("TELEFONE");
            String endereco = resultQuery.getString("ENDERECO");

            users.add(new User(nameUse, sex, cpf, email, telefone, endereco));
          }

          statement.close();
          connection.close();
          return users;
        }
      }
    } catch (SQLException error) {
      throw new RuntimeException(error.getMessage());
    } finally {
      System.out.println("Connection closed.");
    }
  }

  @Override
  public List<ModelUser> getAll() { // Pode implementar a lógica para fazer requisições
    return null;
  }

  @Override
  public void createNewUser(ModelUser user) {

  }

  @Override
  public void deleteUser(ModelUser user) {

  }

  @Override
  public void updateUser(String name) {

  }
}
