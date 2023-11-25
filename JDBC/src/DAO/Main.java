package DAO;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    ModelDAO useDAO = new UseDAO();

    List<ModelUser> results = useDAO.getByName("Gandalf");

    if(!results.isEmpty()) {
      for (ModelUser res : results){
        System.out.println(res.name + "\nCPF: " + res.getCpf());
      }
    } else {
      System.out.println("User not found.");
    }
  }
}
