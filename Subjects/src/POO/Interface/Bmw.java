package POO.Interface;

public class Bmw implements Car {
  boolean on = false;
  String model;

  Bmw(String model) {
    this.model = model;
  }
  @Override
  public void startEngine() {
    if (!this.on) {
      this.on = true;
      System.out.printf("%s funcionando!", this.model);
    }
  }
  @Override
  public void powerOfEngine() {
    if(this.on) {
      this.on = false;
      System.out.printf("%s desligado!", this.model);
    }
  }

  public static void main(String[] args) {
    Car bmw = new Bmw("Bmw 320i");

    bmw.startEngine();

  }
}
