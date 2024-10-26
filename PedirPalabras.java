import java.util.Scanner;

/**
 * PedirPalabras
 */
public class PedirPalabras {

    public static void main(String[] args) {

        
      var entrada = new Scanner(System.in);
      System.out.println("Ingrese la primera palabra por favor: "); 
      var palabra1 = entrada.nextLine();
      System.out.print("Ingrese la segunda palabra por favor: ");
      var palabra2 = entrada.nextLine();
      System.out.print("Ingrese la tercera palabra por favor: ");
      var palabra3 = entrada.nextLine();
      //imprimir los resultados
      System.out.print(palabra1+" ");
      System.out.print(palabra2+" ");
      System.out.print(palabra3+" ");
      entrada.close();  
    }
}