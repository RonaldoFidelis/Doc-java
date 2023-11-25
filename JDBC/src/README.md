**Java Database Connectivity (JDBC): Uma Visão Geral**

JDBC é uma API (Interface de Programação de Aplicações) Java que permite que programas Java interajam com bancos de
dados relacionais. Essa interface fornece métodos para se conectar a um banco de dados, enviar consultas SQL e atualizar
dados. A JDBC permite que desenvolvedores Java escrevam aplicativos que podem se comunicar com qualquer banco de dados
relacional que ofereça um driver JDBC.

**Componentes Principais da JDBC:**

1. **`DriverManager`:** Esta classe gerencia uma lista de drivers de banco de dados. Ele pode ser usado para obter uma
   conexão com um banco de dados.

2. **`Connection`:** A interface `Connection` representa uma sessão com o banco de dados. Uma conexão pode ser obtida
   usando o `DriverManager.getConnection()`.

3. **`Statement`:** A interface `Statement` é usada para executar consultas SQL no banco de dados. Há várias
   subinterfaces, como `PreparedStatement` e `CallableStatement`, que são usadas para consultas parametrizadas e
   chamadas de procedimentos armazenados, respectivamente.

4. **`ResultSet`:** A interface `ResultSet` representa o conjunto de resultados de uma consulta SQL. Permite iterar
   sobre os resultados e obter os dados.

**Exemplo de Uso do JDBC:**

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExemploJDBC {
  public static void main(String[] args) {
    try {
      // Carregar o driver JDBC
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Estabelecer a conexão com o banco de dados
      String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
      String user = "seu_usuario";
      String password = "sua_senha";
      Connection connection = DriverManager.getConnection(url, user, password);

      // Criar uma tabela chamada "exemplo"
      Statement statement = connection.createStatement();
      String createTableSQL = "CREATE TABLE exemplo (id INT, nome VARCHAR(255))";
      statement.executeUpdate(createTableSQL);

      // Inserir dados na tabela
      String insertDataSQL = "INSERT INTO exemplo VALUES (1, 'Item1'), (2, 'Item2')";
      statement.executeUpdate(insertDataSQL);

      // Executar uma consulta SQL
      String selectDataSQL = "SELECT * FROM exemplo";
      ResultSet resultSet = statement.executeQuery(selectDataSQL);

      // Iterar sobre os resultados
      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String nome = resultSet.getString("nome");
        System.out.println("ID: " + id + ", Nome: " + nome);
      }

      // Fechar recursos
      resultSet.close();
      statement.close();
      connection.close();

    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
```

Este é um exemplo básico. Em projetos do mundo real, práticas como o uso de `try-with-resources`, manipulação de
exceções de maneira apropriada e o uso de pools de conexão são recomendadas para melhorar a eficiência e a
confiabilidade do código JDBC.