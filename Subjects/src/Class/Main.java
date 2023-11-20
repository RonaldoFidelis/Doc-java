package Class;

public class Main {
  public static void main(String[] args) {
    Product mouse = new Product("Mouse", 59.90, 35);
    double priceBeforeDiscount = mouse.discountCalculator(mouse.price, mouse.discount);

    System.out.printf("R$ %.2f",priceBeforeDiscount);
  }
}
