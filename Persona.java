

package com.mycompany.persona;

/**
 *
 * @author Maynor Javier Coello
 */
public abstract class Persona {

    public static void main(String[] args) {
        
        
        
        //Maynor Javier Coello Lopez Subclase Deportista y Doctor
        
        Persona deportista = new Persona() {
            @Override
            String obtenerinformacion() {
                return "obtener informacion deportista";
            }
        };
        Persona doctor = new Persona() {
            @Override
            String obtenerinformacion() {
                return "obtener informacion doctor";
            }
        };
        
      class deportista extends Persona{

            @Override
            String obtenerinformacion() {
                return "Informacion de la clase deportista";
            }
    }
     deportista.setNombre("Cristiano Ronaldo");
     deportista.setEdad(37 );
     deportista.setEquipoactual("Manchester United");
     deportista.SetEstatura(1.87);
     deportista.SetSalario(26.8);
     deportista.SetPais("Portugal");
     
       System.out.println("Deportista");
       System.out.println("Nombre: " + deportista.getNombre());
       System.out.println("Equipo actual: " + deportista.getEquipoactual());
       System.out.println("Edad: " + deportista.getEdad());
       System.out.println("Estatura: " + deportista.GetEstatura() + " metros");
       System.out.println("Salario anual: " + deportista.GetSalario() + " millones");
       System.out.println("Su país de origen es: " + deportista.GetPais());
    
     class doctor extends Persona{

            @Override
            String obtenerinformacion() {
                return "informacion de la clase doctor";
            }
                     
    }
     
     doctor.setNombreDoctor("Mario Rivera");
     doctor.setEdadDoctor(47 );
     doctor.setHospital("Hospital Del caribe");
     doctor.SetEstaturaDoctor(1.70);
     doctor.SetSalarioDoctor(800);
     doctor.SetPaisHospital("Hondurras");
     
        System.out.println("\nDoctor");
        System.out.println("Nombre: " + doctor.GetNombreDoctor());
       System.out.println("Hospital en que trabaja: " + doctor.GetHospital());
       System.out.println("Edad: " + doctor.GetEdadDoctor());
       System.out.println("Estatura: " + doctor.GetEstaturaDoctor() + " metros");
       System.out.println("Salario mensual: " + doctor.GetSalarioDoctor() + " dolares");
       System.out.println("País en que está el hospital: " + doctor.GetPaisHospital());
    
    }
    protected String nombre;
    protected int edad;
    protected String equipoactual; 
    protected double estatura;
    protected double salario;
    protected String pais;
    protected String nombredoctor;
    protected int edaddoctor;
    protected String hospital; 
    protected double estaturadoctor;
    protected int salariodoctor;
    protected String paishospital;

    
    //Marco Tulio Nuñez Díaz
    
    private String nacionalidad;
    private String tipoSangre;
    private String profesion;
    
    
    //Maynor Javier Coello Lopez
         public String getNombre(){
        return nombre;
    }
    public String getEquipoactual(){
        return equipoactual;
    }
    public int getEdad(){
        return edad;
    }
    public double GetEstatura(){
    return estatura;
}
    public double GetSalario(){
        return salario;
    }
    public String GetPais (){
        return pais;
    }
    
     public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEquipoactual(String equipoactual){
        this.equipoactual = equipoactual;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void SetEstatura( double estatura){
    this.estatura = estatura;
}
    public void SetSalario(double salario){
        this.salario = salario;
    }
    public void SetPais (String pais){
        this.pais = pais;
    }
    
    //Doctor
         public String GetNombreDoctor(){
        return nombredoctor;
    }
    public String GetHospital(){
        return hospital;
    }
    public int GetEdadDoctor(){
        return edaddoctor;
    }
    public double GetEstaturaDoctor(){
    return estaturadoctor;
}
    public double GetSalarioDoctor(){
        return salariodoctor;
    }
    public String GetPaisHospital (){
        return paishospital;
    }
    
     public void setNombreDoctor(String nombre){
        this.nombredoctor = nombre;
    }
    public void setHospital(String hospital){
        this.hospital = hospital;
    }
    public void setEdadDoctor(int edad){
        this.edaddoctor = edad;
    }
    public void SetEstaturaDoctor( double estatura){
    this.estaturadoctor = estatura;
}
    public void SetSalarioDoctor(int salariod){
        this.salariodoctor = salariod;
    }
    public void SetPaisHospital (String pais){
        this.paishospital = pais;
    }
    
    //Marco Tulio Nuñez Díaz
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
    
      abstract String obtenerinformacion();
}

