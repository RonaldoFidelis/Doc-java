package Exercise;

public class BubbleSort {
  public static void main(String[] args) {
    int[] numbers = {2,3,5,6,12,5,23};
    int temp = 0;
    for (int i = 0; i <= numbers.length -1; i++){ // O(n)
      for (int y = 0; y < numbers.length -1 -i; y++){ // O(n)
        if (numbers[y] > numbers[y+1]){
          temp = numbers[y];
          numbers[y] = numbers[y + 1];
          numbers[y + 1] = temp;
        }
      }
    }

    for (int values : numbers){
      System.out.print(values + " < ");
    }
  }
}
