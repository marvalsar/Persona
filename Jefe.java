public class Jefe extends Persona{
    private String departamentoJefe;

    //Constructor
    public Jefe(String nombre, String apellido, String genero, int edad, String departamentoJefe) {
        super(); // Llama al constructor de la clase Persona
        this.departamentoJefe = departamentoJefe;
    }

    //Constructro vacio
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
    // Implementación del método abstracto
    @Override

    public void jefe() {
        System.out.println("Soy un jefe.");
    }
}
