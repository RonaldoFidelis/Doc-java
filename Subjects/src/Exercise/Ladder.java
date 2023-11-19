package Exercise;

public class Ladder {
  public static void main(String[] args) {
    String current = "#";
    String finale = "#######";

    for (;!current.equals(finale);){
      System.out.println(current);
      current += "#";
    }

    for (String i = "#"; !i.equals("#######"); i += "#"){
      System.out.println(i);
    }
  }
}
