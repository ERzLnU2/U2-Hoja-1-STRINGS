package daw120.u2hoja1_srings;
public class U2Hoja1_Srings {
    public static void main(String[] args) {
/**
 * @author DAW120
 
1.- Intenta escribir un programa que inicialice dos cadenas de caracteres, una llamada 
nombre y otra llamada apellido. Los valores iniciales de las cadenas pueden ser 
“Pepito” y “Perez”, respectivamente. El programa debe escribir ambas cadenas y su 
longitud por pantalla.  */

      String nombre="Pepon"; 
      String apellido="Pertez";
      System.out.println("La longitud de la cadena ciclo es: "+nombre.length());
                            // ***** LENGTH metod que cuenta los caracteres de la cadena
      System.out.println("La longitud de la cadena ciclo es: "+apellido.length()); 

/*
2.- Escribe un programa que declare una cadena de caracteres denominada nombre, 
con valor inicial “Pepito”, primerApellido con valor “Perez” y segundoApellido con valor 
“Fernandez”. Después, el programa concatena a nombre el primer apellido, y luego el 
segundo. Por último, el programa imprime el nombre completo y su longitud.
 */
  String nombre2="Pepito"; 
  String apellido2="Perez";
  String segundoApellido2="Fernandez";
      
  // CONCATENA: 
  
 String result1=(nombre2.concat(apellido2));
 System.out.print("\nResultado concatenado:\n");
 //System.out.print(result1=nombre.concat(apellido));
 
 String result2=(result1.concat(segundoApellido2));
 System.out.print(result2=result1.concat(segundoApellido2)); // ***** CONCATena las cadenas
 
 System.out.println("\n");
 System.out.print("\nLongitud nombre:\n");
 //////////////////////////////
 String longitud= new String();
 System.out.println("Longitud de la cadena: "+result2.length());

 
/*
* 3.- Intenta escribir un método que, dado un String, devuelve otro objeto String en el que 
se cambian todas las vocales minúsculas del original por la letra ‘o’.
 */ 
        String vocales = "Las cadenas de caractéres o Strings en Java, se representan con comillas dobles. Si queremos que la propia un carácter en si, y no el final de la cadena, hay que anteponer la secuencia de escape .";
        String newvocales1 = vocales.replace('a', 'o');
       // System.out.println(newvocales1);
        String newvocales2 = newvocales1.replace('e', 'o');
       // System.out.println(newvocales2);
        String newvocales3 = newvocales2.replace('i', 'o');
       // System.out.println(newvocales3);
        String newvocales4 = newvocales3.replace('u', 'o');
        System.out.println("\nCADENA CON VOCALES REEMPLAZADAS CON O:\n");
        System.out.println(newvocales4);


/*
4.- Intenta escribir un método, que dada una cadena de carácteres, devuelve la mitad 
inicial de la cadena. Puedes probar con: “Hola, me llamo Pepito”.
*/
   String Cadena="Hola, me llamo Pepito"; 
   String cadena=Cadena.substring(10); 
   System.out.println("\nLa longitud de la cadena ciclo es: "+cadena.length());


/*
5.- Intenta escribir un método que, dada una cadena de caracteres, sustituya todas las 
ocurrencias del texto “es” por “no por”.

 */
        String noPor = "Las cadenas de caractéres o Strings en Java, es representan con comillas dobles. Si queremos que la es propia un carácter en si, y no el final de la cadena, es hay que anteponer la secuencia de escape .";
        String result = noPor.replace("es", "no por");
        System.out.println(result);      
  
    }
}
