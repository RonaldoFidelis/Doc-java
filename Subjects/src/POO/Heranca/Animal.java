package POO.Heranca;

public class Animal {
  protected String name;
  protected String noise;
  protected String actionNoise;

  Animal(String name, String noise, String actionNoise) {
    this.name = name;
    this.noise = noise;
    this.actionNoise = actionNoise;
  }

  void noise() {
    System.out.printf("%s!!!(%s)\n", this.noise, this.actionNoise);
  }

  void eating() {
    System.out.printf("%s esta comendo\n", this.name);
  }
}
