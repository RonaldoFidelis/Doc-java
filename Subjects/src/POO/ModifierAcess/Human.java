package POO.ModifierAcess;

public class Human {
  private final String cpf;
  protected String name;
  Human(String name, String cpf) {
    this.name = name;
    this.cpf = cpf;
  }
  protected String getCpf() {
    return this.cpf;
  }
  public String getName() {
    return this.name;
  }

}
