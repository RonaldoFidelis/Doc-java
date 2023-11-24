package POO.ModifierAcess.Condado.Gamgee;

import POO.ModifierAcess.Condado.Bolseiros.Bilbo;
import POO.ModifierAcess.Condado.Bolseiros.Frodo;

public class Sam {
  Frodo friend = new Frodo();
  Bilbo grandFatherFriend = new Bilbo();

  void iKnow() {
    System.out.println(friend.myFamily);
    System.out.println(grandFatherFriend.familyName);
  }
}
