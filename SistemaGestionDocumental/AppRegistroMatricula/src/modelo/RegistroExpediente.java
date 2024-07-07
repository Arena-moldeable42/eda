package modelo;
import modelo.*;
public class RegistroExpediente {
    private final static int MAX=1000;
    private Expediente[] array;
    private int num;
    
    public RegistroExpediente(){
        this.array = new Expediente[MAX];
        this.num = 0; // Cantidad de personas registradas en el arreglo        
    }
    // Agregar Persona
    public boolean agregar(Expediente expediente){
        if (num<MAX){
            array[num] = expediente;
            num++;
            return true;
        }else{
            return false;
        }
    }
    public int ubicacion(int numero){
        for (int i = 0; i < num; i++) {
            if (array[i].getIdExpediente()==numero){
                return i;
            }
        }
        return -1;        
    }
    // eliminar del registro a una Persona
    public boolean eliminar(int numero){
        int pos = ubicacion(numero);
        if (pos>=0){
            for (int i = pos; i < num-1; i++) {
                array[i] = array[i+1];                
            }
            num--;
            return true;
        }else{
            return false;            
        }        
    }
    // recuperar la lista de personas registradas
    public Expediente[] getLista(){
        Expediente[] temp = null;
        if (num>0){
            temp = new Expediente[num];
            for (int i = 0; i < num; i++) {
                temp[i] = array[i];
            }
        }
        return temp;
    }

    public Expediente iesimo(int pos){
        if (pos>=0 &&  pos<MAX){
            return array[pos];
        }else{
            return null;
        }
    }  

    
   
}
