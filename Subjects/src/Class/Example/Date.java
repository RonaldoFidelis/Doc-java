package Class.Example;

public class Date {
  int day;
  int month;
  int year;

  // "Arguments optional"
  Date() {
    this.day = 21;
    this.month = 11;
    this.year = 2023;
  }
  Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
}
