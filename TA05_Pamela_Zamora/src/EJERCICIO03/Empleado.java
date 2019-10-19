
package EJERCICIO03;

public class Empleado {
    String codigo;
    String nombre;
    String areaLaboral;
    double sueldoBasico;
    double horasExtras;
    String afiliacion;
  
    
    public double AfiliacionAFP(double sueldoBasico){
     this.sueldoBasico=sueldoBasico;
     double descuentoAFP=(0.11*sueldoBasico);
     return descuentoAFP;
    } 
    
     public double AfiliacionSNP(double sueldoBasico){
     this.sueldoBasico=sueldoBasico;
     double descuentoSNP= (0.13 * sueldoBasico);
     return descuentoSNP;
    }
    public double AfiliacionSALUD(double sueldoBasico){
     this.sueldoBasico=sueldoBasico;
     double descuentoSALUD= (0.03 * sueldoBasico);
     return descuentoSALUD;
    }
    
    public double MontoHorasExtras(double sueldoBasico, double horasExtras){
     this.sueldoBasico=sueldoBasico;
     this.horasExtras= horasExtras;
     double montoHorasExt= (sueldoBasico/240)*horasExtras;
     return montoHorasExt;
    }
    
    public double MontoTotalDescuento(){
       double DescuentoTotal=(AfiliacionSNP(sueldoBasico)+AfiliacionSALUD(sueldoBasico)+ AfiliacionAFP(sueldoBasico));
       return DescuentoTotal;
    }
    public double SueldoTotal(double sueldoBasico){
        this.sueldoBasico=sueldoBasico;
        return sueldoBasico;
    }
        
    public double sueldoNeto(double sueldoBasico){
       this.sueldoBasico=sueldoBasico;
       double sueldoNeto= (sueldoBasico-MontoTotalDescuento());
       return sueldoNeto;  
    }
}   
    
    