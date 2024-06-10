package Example;

import java.util.*;

public class Collections {
  public static void main(String[] args) {
    int[] array = new int[10];

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    Vector<Integer> vector = new Vector<>();

    HashSet<Integer> hashSet = new HashSet<>();
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    HashMap<Integer, String> map = new HashMap<>();

    array[0] = 10;

    // Lista, first-in-first-out
    arrayList.add(10);
    linkedList.add(10);
    vector.add(10);

    // Set, nao aceite valor duplicado
    hashSet.add(10);
    //hashSet.add(10); // error
    linkedHashSet.add(10);
    //linkedHashSet.add(10); // error
    treeSet.add(10);
    //treeSet.add(10); // error

    // Map, armazena chave e valor
    map.put(1, "Egg");
    System.out.println(map.get(1)); // pegando pelo id

  }
}
