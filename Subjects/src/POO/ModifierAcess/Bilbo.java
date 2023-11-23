package POO.ModifierAcess;

public class Bilbo extends Human {
  Bilbo(String name, String cpf) {
    super(name, cpf);
  }
  public static void main(String[] args) {
    Human bilbo = new Bilbo("Bilbo", "111.111.111-11");

    System.out.println(bilbo.name);
    System.out.println(bilbo.getCpf());
  }
}
