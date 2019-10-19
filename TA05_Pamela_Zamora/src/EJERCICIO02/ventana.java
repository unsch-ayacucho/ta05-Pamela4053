
package EJERCICIO02;
// SE CREA LA CLASE VENTANA
public class ventana {
    //ATRIBUTOS
    String color;
    String nombre;
    boolean abrir;
    boolean cerrar;
    boolean maximizar;
    boolean minimizar;
    // METODOS
 public void ImprimirDatos(){
     System.out.println("el nombre de la ventana es:"+ nombre);
     System.out.println("el color de la ventana es:"+ color);
 }
 public void operacionesVentana(){
     System.out.println("abrir la ventana: "+abrir);
     System.out.println("cerrar la ventana: "+cerrar);
     System.out.println("maximizar la ventana: "+maximizar);
     System.out.println("minimizar la ventana: "+minimizar);
     
     
 }
}
