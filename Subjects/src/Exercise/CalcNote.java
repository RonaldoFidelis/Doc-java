package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CalcNote {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double[] notes = null;
    boolean condition = true;

    while (condition) {
      System.out.println("Enter the length of the array: ");
      int lengthArray = scan.nextInt();

      if (lengthArray > 0) {
        notes = new double[lengthArray];
        condition = false;
      } else {
        System.out.println("Please enter a valid positive length.");
      }
    }

    for (int i = 0; i < notes.length; i++) {
      System.out.printf("Enter note #%d: ", i + 1);
      notes[i] = scan.nextDouble();
    }

    double total = 0;
    for (double note : notes) {
      total += note;
    }

    double media = total / notes.length;
    System.out.println("Notes: " + Arrays.toString(notes));
    System.out.printf("Media: %.2f\n", media);

    scan.close();
  }
}
