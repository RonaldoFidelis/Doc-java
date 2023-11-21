package Exercise.ModuloClasse;

public class People {
  String name;
  double weight;

  People(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  void eat(String food, double kcal) {
    double beforeWeight = this.weight;
    this.weight += (kcal / 1000);
    System.out.printf("%s eating %s.\nWeight before: %.2f\nWeight after: %.2f",
            this.name, food, beforeWeight, this.weight);
  }

  void desc() {
    System.out.printf("%s has %.2f weight", this.name, this.weight);
  }
}
