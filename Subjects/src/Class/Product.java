package Class;

public class Product {
  String product;
  double price;
  double discount;

  Product(String product, double price, double discount){
    this.product = product;
    this.price = price;
    this.discount = discount;
  }

  double discountCalculator(double price, double discount) {
    return price - (price * (discount / 100));
  }
}
