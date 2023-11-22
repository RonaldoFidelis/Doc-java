package Matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
  public static void main(String[] args) {
    double[][] mediaClass = null;
    Scanner scan = new Scanner(System.in);

    System.out.println("Which is quantity the students: ");
    int quantityStudent = scan.nextInt();
    System.out.println("Notes per students: ");
    int quantityNotes = scan.nextInt();

    mediaClass = new double[quantityStudent][quantityNotes];

    for (int student=0;student<mediaClass.length;student++){
      for (int notes=0;notes<mediaClass[student].length;notes++){
        System.out.printf("Student#%d note#%d: ", student + 1,notes+1);
        mediaClass[student][notes] = scan.nextDouble();
      }
    }
    int i = 1;
    for(double[] notes : mediaClass){
      System.out.printf("Student#%d: " + Arrays.toString(notes) + "\n",i );
      i++;
    }
    scan.close();
  }
}
