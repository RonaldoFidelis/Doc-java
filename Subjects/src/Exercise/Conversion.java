package Exercise;

import java.util.Scanner;

public class Conversion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Write the first wage: ");
    String firstInput = input.next().replace(",", ".");
    double firstWage = Double.parseDouble(firstInput);

    System.out.print("Write the second wage: ");
    String secondInput = input.next().replace(",", ".");
    double secondWage = Double.parseDouble(secondInput);

    System.out.print("Write the third wage: ");
    String thirdInput = input.next().replace(",", ".");
    double thirdWage = Double.parseDouble(thirdInput);

    double media = (firstWage + secondWage + thirdWage) / 3;
    System.out.print(media);

    input.close();
  }
}
