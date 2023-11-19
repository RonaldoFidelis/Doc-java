package introduction;

import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean condition = false;

    do { /* mesmo que a condição for falsa ele executa uma vez */
      System.out.print("Exit? Y(yes) N(no): ");
      String option = scan.next().toLowerCase();

      if (option.equals("y") || option.equals("yes")) {
        condition = true;
      } else  {
        System.out.println("Reloading...");
      }
    } while (!condition);

    scan.close();
  }
}
