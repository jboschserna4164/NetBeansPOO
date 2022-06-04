
package Registros;


public class main {

    public static void main(String[] args) {
        
        //Construir objeto
        InterfazGrafica window = new InterfazGrafica();
        
        //Asignar titulo a la ventana
        window.setTitle("Registros");
        
        //Hacer visible la ventana
        window.setVisible(true);
        
        //Colocar la ventana en el centro de la pantalla
        window.setLocationRelativeTo(null);
    }
    
}
