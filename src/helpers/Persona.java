
package helpers;


public abstract class Persona {
    
    //Atributos
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String tipoSangre;
    private String profesion;
    
    //constructor
    
    public Persona(){
        
    }
    
    //Métodos establecer y obtener
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getnombre(){
        return this.nombre;
    }
    
    public void setedad(int edad){
        this.edad = edad;
    }
    public int getedad(){
        return this.edad;
    }
    
    public void setnacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    
    public String getnacionalidad(){
        return this.nacionalidad;
    }
    
    public void settipoSangre(String tipoSangre){
        this.tipoSangre = tipoSangre;
    }
    
    public String gettipoSangre(){
        return this.tipoSangre;
    }
    
    public void setprofesion(String profesion){
        this.profesion = profesion;
    }
    
    public String getprofesion(){
        return this.profesion;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Tipo de Sangre: " + tipoSangre);
        System.out.println("Profesion: " + profesion);
    }
    
    abstract String obtenerInformacion();
}
