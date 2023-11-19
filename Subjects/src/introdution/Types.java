package introdution;

public class Types {
  public static void main(String[] args) {
    /* Tipos primitivos em java
    *  Em java existe 8 tipos, onde 6 sao do tipo numerico e 2 ...
    *
    * 4 sao do tipo inteiro: Oque vai mudar e apenas a capacidade de armazenamento
    * byte -> -128 ate 127
    * short -> -32758 ate 32767
    * int ->  -2.147.483.648 ate 2.147.483.647
    * long ->
    *
    * 2 sao do tipo flutuante: Oque vai mudar e apenas a capacidade de armazenamento
    * float ->
    * double ->
    *
    * 2 sao caracter
    * char ->
    * boolean -> true ou false
    * */

    final double PI = 3.14159265359;
    float pi = (float) 3.14159265359; // poderia declar dessa forma tambem: float pi = 3.14159265359F;
    System.out.println("Com double: " + PI);
    System.out.println("Com float: " + pi);
  }
}
