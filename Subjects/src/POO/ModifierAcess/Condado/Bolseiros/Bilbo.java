package POO.ModifierAcess.Condado.Bolseiros;

public class Bilbo {
  private final String secret = "I have ring"; // So bilbo sabe
  String frodoKnow = "I have a magic sword"; // Quem mora(mesmo pacote) com bilbo sabe
  protected String qualitity = "Brave"; // Se bilbo contar, ou se herda sabe
  public String familyName = "Bolseiro"; // Todos sabem

  String tellSecretBilbo() {
    return this.secret;
  }

  void iKnow() {
    Frodo nephew = new Frodo();

    System.out.println(nephew.myFamily);
    System.out.println(nephew.about);
    System.out.println(nephew.inHome);
  }
}
