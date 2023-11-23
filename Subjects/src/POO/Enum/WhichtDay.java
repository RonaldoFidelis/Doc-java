package POO.Enum;

import java.util.Scanner;

public class WhichtDay {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DaysWeek[] daysWeek = DaysWeek.values();

    System.out.println("Which day is today? ");
    String inputDay = scan.nextLine();
    DaysWeek whichDay = DaysWeek.valueOf(inputDay.toUpperCase());

    System.out.println("Days that match: ");
    for (DaysWeek value : daysWeek) {
      if (whichDay.equals(value)) {
        System.out.println(value);
        return;
      }
    }

    scan.close();
  }
}
