
package EJERCICIO03;


public class PruebaEmpleado {

    public static void main(String[] args) {
       Empleado empleado1= new Empleado();
       empleado1.codigo= "24512";
       empleado1.nombre="maick";
       empleado1.sueldoBasico=1200;
       empleado1.areaLaboral="administrador";
       empleado1.horasExtras=5;
       empleado1.afiliacion= "si";
       
       empleado1.AfiliacionAFP(empleado1.sueldoBasico);
       empleado1.AfiliacionSALUD(empleado1.sueldoBasico);
       empleado1.AfiliacionSNP(empleado1.sueldoBasico);
       empleado1.MontoHorasExtras(empleado1.sueldoBasico, empleado1.horasExtras);
       empleado1.MontoTotalDescuento();
       empleado1.SueldoTotal(empleado1.sueldoBasico);
    }
    
}
