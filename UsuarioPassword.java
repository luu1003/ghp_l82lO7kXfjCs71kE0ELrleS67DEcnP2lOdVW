package enClase;
import java.util.Scanner;
public class UsuarioPassword {
    public static void main(String[] args) {
        final String pasword= "1234";
        final String user= "usuario1";
         String userPasword, user1;
         Scanner scanner = new Scanner (System.in);
    do{
        
        System.out.println ("Introduzca su contraseña:");
        userPasword=scanner.next();    
        System.out.println ("Introduzca su usuario:");
        user1=scanner.next();    
    }while(!userPasword.equals(pasword) && !user1.equals(user));
    System.out.println ("su contraseña y usuario son correctos");
    scanner.close();

   }
}
