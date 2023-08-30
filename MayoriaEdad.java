package enClase;

import java.util.Scanner;

public class MayoriaEdad {

  public static void main(String[] args) {

    int edad, valor;
    Scanner scanner = new Scanner(System.in);

    System.out.println("introduzca su edad");
    edad = Integer.parseInt(scanner.next());

    if (edad < 18) {
      System.out.println("lo siento, no cumple con las condiciones para ingresar");
    } else {
      System.out.println("intoduzca un número entre 0 y 100");
      valor = Integer.parseInt(scanner.next());
      if ((0 < valor) && (valor <= 40)) {
        System.out.println("su número representa un valor malo");
      } else if ((40 < valor) && (valor <= 60)) {
        System.out.println("su número representa un valor medio");
      } else if ((60 < valor) && (valor <= 100)) {
        System.out.println("su número representa un buen valor");
      } else {
        System.out.println("su número no cumple con las condiciones");

      }
    }
  }
}
