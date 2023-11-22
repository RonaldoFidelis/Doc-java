package Collections;

public class User {
  String name;
  User(String name){
    this.name = name;
  }
  void greeting(){
    System.out.printf("%s is saying hi!\n", this.name);
  }
}
