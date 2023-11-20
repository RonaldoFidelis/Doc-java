package introduction;

public class Switch {
  public static void main(String[] args) {
    String dayOfWeek = "Quarta";

    switch (dayOfWeek) {
      case "Segunda":
        System.out.println("Primeiro dia útil da semana");
        break;
      case "Terça":
      case "Quarta":
      case "Quinta":
      case "Sexta":
        System.out.println("Dia útil da semana");
        break;
      case "Sábado":
      case "Domingo":
        System.out.println("Fim de semana");
        break;
      default:
        System.out.println("Dia desconhecido");
    }
  }
}
