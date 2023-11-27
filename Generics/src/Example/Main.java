package Example;

public class Main<T> implements InterfaceGeneric<T> {
  public static void main(String[] args) {
    WithoutGenerics box = new WithoutGenerics();
    WithGenerics<Number> boxGenerics = new WithGenerics<>(); // A classe se adpta ao tipo de dado
    Heritage<String> boxHeritage = new Heritage<>();
    Main<String> interfaceGeneric = new Main<>();

    int number = 10;
    String[] listNumber = {"10","20","50","76","33","54"};

    // box.setBox(number); -> vai da error porque o metodo espera uma String
    String convergeNumber = String.valueOf(number);

    box.setBox(convergeNumber);// Classe sem o tipo generico
    System.out.println(box.getBox());

    boxGenerics.setBox(number);// Classe generica
    System.out.println(boxGenerics.getBox());

    boxHeritage.setBox(convergeNumber);// Herdada
    System.out.println(boxHeritage.getBox());

    interfaceGeneric.greeting("You can!!");
    System.out.println(interfaceGeneric.takeThing(number));
    interfaceGeneric.print(listNumber);

  }

  @Override
  public void greeting(Object greet) {
    System.out.println("Hi! " + greet);
  }

  @Override
  public Object takeThing(Object thing) {
    return thing;
  }

  @Override
  public void print(Object[] thing) {
    for (Object i : thing){
      System.out.print(i + " ");
    }
  }
}
