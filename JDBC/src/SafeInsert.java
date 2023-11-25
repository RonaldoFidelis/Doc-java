import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SafeInsert {
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      System.out.println("Wich is name the user: ");
      String insertUser = scan.nextLine();

      String commandSQL = "INSERT INTO CLIENTE VALUES(?,'M',55533322270,755755896,'66748895','ROMERO CURY - BAD RETIRO - COOL DE MINAS - MT');";
      Connection connection = FactoryConnection.connection();
      PreparedStatement statement = connection.prepareStatement(commandSQL);
      statement.setString(1,insertUser);

      System.out.println("User added with sucess");

      statement.execute();
      scan.close();
      statement.close();
      connection.close();
    } catch (SQLException error) {
      throw new RuntimeException(error);
    } finally {
      System.out.println("Connection closed.");
    }
  }
}
