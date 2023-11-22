package Array;

import java.util.Scanner;

public class IntrodutionArray {
  public static void main(String[] args) {
    /*How define array at java*/
    Scanner scan = new Scanner(System.in);
    int[] note = new int[10];
    for(int i=0;i<10;i++){
      System.out.printf("Nota#%d:",i+1);
      note[i] = scan.nextInt();
    }

    scan.close();
  }
}
