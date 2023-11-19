package introduction;

public class For {
  public static void main(String[] args) {
    int[] number = new int[10];
    int increment = 0;

    for (int i = 0; i <= number.length -1; i++){
      number[i] = increment;
      increment++;
    }
    for (int i : number){ // Equals a for of -> getting values from array
      System.out.println(i);
    }
  }
}
