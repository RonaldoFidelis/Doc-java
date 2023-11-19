package introduction;

import java.util.Scanner;

public class If {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Write the note: ");
    double note = input.nextDouble();

    if (note < 6) {
      System.out.println("Student reproved");
    } else {
      System.out.println("Student approved");
    }

    input.close();
  }
}
