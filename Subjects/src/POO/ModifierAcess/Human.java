package POO.ModifierAcess;

public class Human {
  private final String cpf;
  public String name;
  protected boolean rich;
  Human(String name, String cpf, boolean rich) {
    this.name = name;
    this.cpf = cpf;
    this.rich = rich;
  }
  protected String getCpf() {
    return this.cpf;
  }
  public String getName() {
    return this.name;
  }

}
