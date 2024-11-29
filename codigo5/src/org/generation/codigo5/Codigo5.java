package org.generation.codigo5;

//Se importa la libreria para el scanner
import java.util.Scanner;

public class Codigo5 {

//Se añade el método main para poder ejecutar el código
 public static void main(String[] args) {
	// Se añade System.in para el funcionamiento correcto del scanner
	    Scanner s = new Scanner(System.in);
	    // Se cambian las comillas ' del final por las comillas "
	    System.out.print("Introduzca un número: ");
	    // Se cambia el tipo de dato a integer y se invierten c y ni para ir acorde al código. 
	    // También se cambia de nextLine a nextInt ya que ahora la variable es de tipo int
	    int c = s.nextInt();
	    int ni = c;
	    //Se cierra el scanner porque ya no se usará
	    s.close();
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		// Se añadé una llave de cierre } para cerrar el else
	      }
		  ni /= 10;
	    }

	    if (afo > noAfo) {
	    // Se añade la t a prinln
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	}
