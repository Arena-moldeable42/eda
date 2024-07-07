package modelo;
import modelo.*;
public class RegistroPersona {
    private final static int MAX=1000;
    private Persona[] array;
    private int num;
    
    public RegistroPersona(){
        this.array = new Persona[MAX];
        this.num = 0; // Cantidad de personas registradas en el arreglo        
    }
    // Agregar Persona
    public boolean agregar(Persona persona){
        if (num<MAX){
            array[num] = persona;
            num++;
            return true;
        }else{
            return false;
        }
    }
    public int ubicacion(int dni){
        for (int i = 0; i < num; i++) {
            if (array[i].getDni()==dni){
                return i;
            }
        }
        return -1;        
    }
    // eliminar del registro a una Persona
    public boolean eliminar(int dni){
        int pos = ubicacion(dni);
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
    public Persona[] getLista(){
        Persona[] temp = null;
        if (num>0){
            temp = new Persona[num];
            for (int i = 0; i < num; i++) {
                temp[i] = array[i];
            }
        }
        return temp;
    }
    // recuperar las personas ordenadas en funcion al nombre
    public Persona[] getListaOrdenadoPorNombres(){
        Persona[] arrayTemp = getLista();
        if (arrayTemp!=null){
            // Ordenar utilizar el metodo burbuja
            for (int i = 0; i < arrayTemp.length; i++) {
                for (int j = arrayTemp.length-1; j >= i; j--) {
                    if (arrayTemp[j].getNombres().compareTo(arrayTemp[j-1].getNombres())<0){
                        // Permutacion o Intercambio Swap
                        Persona temp = arrayTemp[j];
                        arrayTemp[j] = arrayTemp[j-1];
                        arrayTemp[j-1] = temp;
                    }
                }                
            }
        }
        return arrayTemp;
    }
    public Persona iesimo(int pos){
        if (pos>=0 &&  pos<MAX){
            return array[pos];
        }else{
            return null;
        }
    }  
    /*
    * Conocer la cantidad de alumnos en el registro de personas
    */
    
    public int getNumAlumnos(){
        int numAlumnos = 0;
        for (int i = 0; i < num; i++) {
            Persona objPersona = array[i];
            if (objPersona instanceof Alumno){
                numAlumnos++;
            }
        }
        return numAlumnos;
    }
    
    
    /*
    * Metodo para recuperar la lista de Alumnos
    */
    public Persona[] getListaAlumnos(){
        int numAlumnos = getNumAlumnos();
        Persona[] listaAlumnos = new Persona[numAlumnos];
        int j = 0;
        for (int i = 0; i < num; i++) {
            if (array[i] instanceof Alumno){
                listaAlumnos[j] = array[i];
                j++;
            }
        }
        return listaAlumnos;        
    }
    
    
    
    public int getNumDocentes(){
        int numDocentes = 0;
        for (int i = 0; i < num; i++) {
            Persona objPersona = array[i];
            if (objPersona instanceof Docente){
                numDocentes++;
            }
        }
        return numDocentes;
    }
    
    
     public Persona[] getListaDocentes(){
        int numDocentes = getNumDocentes();
        Persona[] listaDocentes = new Persona[numDocentes];
        int j = 0;
        for (int i = 0; i < num; i++) {
            if (array[i] instanceof Docente){
                listaDocentes[j] = array[i];
                j++;
            }
        }
        return listaDocentes;        
    }
     
    public int getNumAdministrativos(){
        int numAdministrativos = 0;
        for (int i = 0; i < num; i++) {
            Persona objPersona = array[i];
            if (objPersona instanceof Administrativo){
                numAdministrativos++;
            }
        }
        return numAdministrativos;
    }
    
    public Persona[] getListaAdministrativos(){
        int numAdministrativos = getNumAdministrativos();
        Persona[] listaAdministrativos = new Persona[numAdministrativos];
        int j = 0;
        for (int i = 0; i < num; i++) {
            if (array[i] instanceof Administrativo){
                listaAdministrativos[j] = array[i];
                j++;
            }
        }
        return listaAdministrativos;        
    }
    
}
