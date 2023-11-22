package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection {
  public static void main(String[] args) {
    ArrayList<User> task = new ArrayList<>();

    task.add(new User("Bilbo"));
    task.add(new User("Gandalf"));
    task.add(new User("Radagast"));

    for (User user : task){
      user.greeting();
    }
  }
}
