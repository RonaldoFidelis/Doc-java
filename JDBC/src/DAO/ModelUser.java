package DAO;

public abstract class ModelUser {
  public String name;
  protected String sex;
  private final String cpf;
  protected String email;
  protected String telefone;
  protected String endereco;

  ModelUser(String name, String sex, String cpf, String email, String telefone, String endereco) {
    this.name = name;
    this.sex = sex;
    this.cpf = cpf;
    this.email = email;
    this.telefone = telefone;
    this.endereco = endereco;
  }

  String getCpf() {
    return this.cpf;
  }

  String[] getContact() {
    String[] contact = new String[3];
    contact[0] = this.telefone;
    contact[1] = this.email;
    contact[2] = this.endereco;
    return contact;
  }
}

