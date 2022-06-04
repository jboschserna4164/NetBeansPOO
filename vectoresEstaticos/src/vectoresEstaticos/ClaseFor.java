
package vectoresEstaticos;

//manejo de arreglos
public class ClaseFor {
    //arreglo
    int[] numeros = new int[10];

    //constructor
    public ClaseFor(){
        
    }   
    
    //Asignar numeros aleatorios de 1 al 100 en cada posicion de la lista numeros
    public void elfor(){
        for(int index=0; index<10; index++){
            numeros[index] = (int)(Math.random()*100+1);
        }
    }
    
    //mostrar cada posicion de la lista con su resultado correspondiente
    public void imprimirArreglo(){
        for(int i = 0; i < 10; i++){
            System.out.println("numeros [" + i + "] = " + numeros[i]);
        }
    }

}