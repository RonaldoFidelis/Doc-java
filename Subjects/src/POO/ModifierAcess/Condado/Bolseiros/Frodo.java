package POO.ModifierAcess.Condado.Bolseiros;

public class Frodo {

  private String secret = "I know bilbo has the ring";
  String inHome = "And useful";
  protected String about = "Boring";
  public String myFamily = "Bolseiro";

  void iKnow(){
    Bilbo tio = new Bilbo();

    System.out.println(tio.tellSecretBilbo());
    System.out.println(tio.familyName);
    System.out.println(tio.frodoKnow);
    System.out.println(tio.qualitity);

  }

}
