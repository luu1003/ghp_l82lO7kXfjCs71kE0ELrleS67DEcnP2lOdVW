package enClase;

import java.util.Scanner;

public class MayoriaEdad2 {

  public static void main(String[] args) throws Exception {
    int edad, valor;
    Scanner scanner = new Scanner(System.in);

    System.out.println("introduzca su edad");
    edad = Integer.parseInt(scanner.next());

    if (edad < 18) {
      System.out.println("lo siento, no cumple con las condiciones para ingresar");
    } else if (edad >= 18) {
    }

  }
}