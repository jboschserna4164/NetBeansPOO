
package promedio;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class promedioDatos {
    
    ArrayList<Double> datos = new ArrayList(); //lista dinamica
    
    //constructor
    public promedioDatos() {
    }
    
   //metodo para agregar datos a la lista
    public void agregarDato(double variable){        
        datos.add(variable);  //añadir dato a la lista                      
        JOptionPane.showMessageDialog(null, "Dato agregado con exito"); //mostrar mensaje en una ventana emergente         
    }
    
    //metodo para borrar todos los datos de la lista
    public void borrarMemoria(){
        datos.clear(); //limpiar la lista
        JOptionPane.showMessageDialog(null, "Se han borrado los datos exitosamente");
    }
    
    //metodo para calcular el promedio
    public void calcularPromedio(){
        double sumatoria = 0.0; //inicializar la variable
        
        //sumar todos los datos de la lista
        for (int i = 0; i < datos.size(); i++) {
            sumatoria = sumatoria+datos.get(i);
        }
        
        double promedio = sumatoria/datos.size(); //sacar el promedio
        JOptionPane.showMessageDialog(null, "El promedio es = " + promedio); //imprimir el promedio en una ventana emergente
    }

}
