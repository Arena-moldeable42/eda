package modelo;
import modelo.*;
public class RegistroCurso {
    private final static int MAX=1000;
    private Curso[] array;
    private int num;
    
    public RegistroCurso(){
        this.array = new Curso[MAX];
        this.num = 0; // Cantidad de personas registradas en el arreglo        
    }
    // Agregar Persona
    public boolean agregar(Curso curso){
        if (num<MAX){
            array[num] = curso;
            num++;
            return true;
        }else{
            return false;
        }
    }
    public int ubicacion(int dni){
        for (int i = 0; i < num; i++) {
            if (array[i].getCodCurso()==dni){
                return i;
            }
        }
        return -1;        
    }
    // eliminar del registro a un Curso
    public boolean eliminar(int codCurso){
        int pos = ubicacion(codCurso);
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
    public Curso[] getLista(){
        Curso[] temp = null;
        if (num>0){
            temp = new Curso[num];
            for (int i = 0; i < num; i++) {
                temp[i] = array[i];
            }
        }
        return temp;
    }
    // recuperar los cursos ordenadas en funcion al nombre
    public Curso[] getListaOrdenadoPorNombres(){
        Curso[] arrayTemp = getLista();
        if (arrayTemp!=null){
            // Ordenar utilizar el metodo burbuja
            for (int i = 0; i < arrayTemp.length; i++) {
                for (int j = arrayTemp.length-1; j >= i; j--) {
                    if (arrayTemp[j].getNombre().compareTo(arrayTemp[j-1].getNombre())<0){
                        // Permutacion o Intercambio Swap
                        Curso temp = arrayTemp[j];
                        arrayTemp[j] = arrayTemp[j-1];
                        arrayTemp[j-1] = temp;
                    }
                }                
            }
        }
        return arrayTemp;
    }
    public Curso iesimo(int pos){
        if (pos>=0 &&  pos<MAX){
            return array[pos];
        }else{
            return null;
        }
    }  
    /*
    * Conocer la cantidad de alumnos en el registro de personas
    */
    
  
    
}
