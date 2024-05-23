public class Jefe extends Persona{
    private String departamentoJefe;

    //Constructor
    public Jefe(String nombre, String apellido, String genero, int edad, String departamentoJefe) {
        super(nombre, apellido, genero, edad); // Llama al constructor de la clase Persona
        this.departamentoJefe = departamentoJefe;
    }

    //Constructor vacio
    public Jefe(){
        super();
    }
   //getters y setters
    public String getDepartamentoJefe(){
        return departamentoJefe;
    }
    public void setDepartamentoJefe(String departamentoJefe){
        this.departamentoJefe = departamentoJefe;
    } 
    
    // Implementación del método 
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion()+ "\nDepartamento: "+departamentoJefe;
    }
}
