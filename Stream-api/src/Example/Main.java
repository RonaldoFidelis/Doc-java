package Example;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>();

    number.add(10);
    number.add(177);
    number.add(16);
    number.add(15);
    number.add(13);

    System.out.println("Valores dobrados: ");
    number.stream().map(x -> x * 2).forEach(System.out::println);

    System.out.println("Soma de tudo: ");
    int amount = number.stream().map(x -> x * 2).reduce(0, Integer::sum);
    System.out.println(amount);

    System.out.println("Valor par: ");
    number.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

  }
}
