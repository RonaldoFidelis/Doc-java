package Error;

import java.util.Scanner;

public class Tratment {
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);

      System.out.println("Typing a number... ");
      int number = scan.nextInt();

      scan.close();
    } catch (Error e){
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Finished");
    }
  }
}
