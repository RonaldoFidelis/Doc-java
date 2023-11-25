package DAO;

import java.util.List;

public abstract interface ModelDAO {
  List<ModelUser> getByName(String name); // O CORRETO SERIA PEGA PELO ID
  List<ModelUser> getAll();
  void createNewUser(ModelUser user);
  void deleteUser(ModelUser user);
  void updateUser(String name); // CORRETO SERIA PEGA PELO ID
}
