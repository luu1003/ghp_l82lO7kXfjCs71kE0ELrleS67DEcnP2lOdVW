package enClase;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Calculadora {
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner (System.in);
      String respuesta;

      do{
        System.out.println ("¿desea hacer una operación?:");
        respuesta=scanner.next();    
      }while(!respuesta.equals("si"));
      System.out.println ("ok, muchas gracias");

      int valor1,valor2;
      System.out.println ("Introduzca el primer valor:");
      valor1=scanner.nextInt();
      System.out.println ("Introduzca el segundo valor:");
      valor2=scanner.nextInt();

      int suma=(valor1+valor2);
      int resta=(valor1-valor2);
      int multiplicacion=(valor1*valor2);
      int división=(valor1/valor2);
          
      System.out.println ("Suma:" + suma);
      System.out.println ("Resta:" + resta );
      System.out.println ("Multiplicacion:" + multiplicacion );
      System.out.println ("Division:" + división );
      scanner.close();
    }
  }

