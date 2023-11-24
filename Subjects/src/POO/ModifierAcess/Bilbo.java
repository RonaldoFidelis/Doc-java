package POO.ModifierAcess;

public class Bilbo extends Human {
  Bilbo(String name, String cpf, boolean rich) {
    super(name, cpf, rich);
  }
  public static void main(String[] args) {
    Human bilbo = new Bilbo("Bilbo", "111.111.111-11",true);

    System.out.println(bilbo.name);
    System.out.println(bilbo.rich);
    System.out.println(bilbo.getCpf());
  }
}
