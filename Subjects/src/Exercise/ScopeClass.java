package Exercise;

public class ScopeClass {
  int a = 10;
  public static void main(String[] args) {
    ScopeClass scope = new ScopeClass();
    System.out.println(scope.a);
  }
}
