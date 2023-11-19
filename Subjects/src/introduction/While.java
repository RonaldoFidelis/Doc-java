package introduction;

import java.util.Scanner;

public class While {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int condition = 0;
    boolean exit = false;

    while (condition <= 2) {
      System.out.println("Condition is still smaller than 2");
      condition++;
    }
    System.out.println("Condition is now greater than 2");

    while (!exit) {
      System.out.print("Exit? Y(yes) N(no): ");
      String option = input.next().toLowerCase();

      if (option.equals("y") || option.equals("yes")) {
        exit = true;
      } else  {
        System.out.println("Reloading...");
      }

    }

    input.close();
  }
}
