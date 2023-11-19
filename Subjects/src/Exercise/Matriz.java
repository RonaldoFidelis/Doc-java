package Exercise;

public class Matriz {
  public static void main(String[] args) {
    int[][] number = new int[4][5];

    for (int l = 0; l < number.length; l++) {
      for (int c = 0; c < number[l].length; c++) {
        System.out.print(number[l][c] + " ");
      }
      System.out.println();
    }
  }
}