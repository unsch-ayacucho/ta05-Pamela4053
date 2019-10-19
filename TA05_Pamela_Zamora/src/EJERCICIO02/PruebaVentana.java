
package EJERCICIO02;

public class PruebaVentana {
    // SE CREA UN OBJETO DE LA CLASE VENTANA
    public static void main(String[] args) {
       ventana ventana1= new ventana();
       ventana1.nombre="GOOGLE";
       ventana1.color="blanco";
       ventana1.cerrar= false;
       ventana1.abrir=true;
       ventana1.maximizar=false;
       ventana1.minimizar=true;
       // SE HACE USO DE LOS METODOS
       ventana1.ImprimirDatos();
       ventana1.operacionesVentana();
    }
    
}
