
package Registros;

import javax.swing.JOptionPane;

public class Datos {
    String nombre[] = new String[5];
    int[] edad = new int[5];
    float[] altura = new float[5];
    int posicion = 0;
    
    public Datos() {
    }
  
    public void capturarDatos(){
        if (posicion < 5) {
            nombre[posicion] = InterfazGrafica.nombre.getText();
            //Convertir la cadena introducida por el usuario en un entero
            edad[posicion] = Integer. parseInt(InterfazGrafica.edad.getText());
            //Convertir la cadena introducida por el usuario en un float
            altura[posicion] = Float.parseFloat(InterfazGrafica.altura.getText());
            posicion++; 
            InterfazGrafica.registro.setText(String.valueOf(posicion));
        } else {
            JOptionPane.showMessageDialog(null, "Se ha llegado al limite de registros", "Error al añadir registro", JOptionPane.PLAIN_MESSAGE);
        }

    }
    
    public void imprimirDatos(){
        for(int i = 0; i < posicion; i++){
            //Mostrar los datos en una ventana, (null - informacion - tituloVentana - JOptionPane.PLAIN_MESSAGE)
            JOptionPane.showMessageDialog(null,
                                       "El nombre es: " + nombre[i] + 
                                       "\nLa edad es: " + edad[i] +
                                       "\nLa altura es: " + altura[i], 
                                       "Mensaje", 
                                       JOptionPane.PLAIN_MESSAGE);
        }       
    }
    

}
