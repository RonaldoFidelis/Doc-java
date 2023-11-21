package Exercise.ModuloClasse;

public class Action {
  public static void main(String[] args) {
    People people = new People("Unknow",85);
    Food banana = new Food("Banan", 15);
    Food pizza = new Food("Pizza", 830);

    people.eat(banana.name, banana.kcal);
    people.eat(pizza.name, pizza.kcal);
  }
}
