
package EJERCICIO01;
public class Estudiante {
   
    // atributos
    private String codigo;
    private String apellidos;
    private String especialidad;
    private int nota1;
    private int nota2;      
    private int nota3;
    private int nota4;
    
    Estudiante( String codigo,String apellidos, String especialidad, int nota1,int nota2,int nota3, int nota4){
        this.codigo=codigo;
        this.apellidos= apellidos;
        this.especialidad=especialidad;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        this.nota4=nota4;
    }
    // se imprimen los datos
    public void ImprimirDatos(){
        System.out.println("el codigo del estudiante es: "+ codigo);
        System.out.println("el codigo del estudiante es: "+ apellidos);
        System.out.println("el codigo del estudiante es: "+ especialidad);
    }
    // aqui se calcula el promedio de 3 notas
    public void calcularnota(){
        double promedio=0;
        int menor= nota1;
        if (nota1<= nota2 && nota1<=nota3 && nota1<= nota4){
            promedio=(nota2+nota3+nota4)/3;
        }
        else if (nota2<= nota1 && nota2<=nota3 && nota2<= nota4){
            promedio=(nota1+nota3+nota4)/3;
        }
        else if (nota3<= nota2 && nota3<=nota1 && nota3<= nota4){
            promedio=(nota2+nota1+nota4)/3;
        }
        else if (nota4<= nota1 && nota4<=nota2 && nota4<= nota3){
            promedio=(nota1+nota2+nota3)/3;
        }
         System.out.println("el promedio de tus notas es: "+ promedio); 
    }
    
} 
    
    

    
   

    
  
        
        
    

    
   
    
        
    


        
        




