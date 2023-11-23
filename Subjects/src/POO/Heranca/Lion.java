package POO.Heranca;

public class Lion extends Animal{
  Lion(String name, String noise, String actionsNoise) {
    super(name, noise, actionsNoise);
  }

  public static void main(String[] args) {
    Animal lion = new Lion("Lion","ARRGGGHH", "Rugido");

    lion.noise();
    lion.eating();
  }
}
