
package vectoresdinamicos;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class arrayList {

    ArrayList vector = new ArrayList();
    
    public arrayList() {
    }
    
    public void Agregar(/*Integer entero*/){
            int number = (int)(Math.random()*10+1);
            vector.add(number);
        //vector.add(entero);      
    }
    
    public void MostrarLista(){
        for(int i = 0; i < vector.size(); i++){
            JOptionPane.showMessageDialog(null, "Posicion " + i + " es = " + vector.get(i));
        }
    }
    
    
}
