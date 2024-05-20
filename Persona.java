public abstract class Persona{
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    //Constructor
    public Persona(){
    }

    //getters y setters para acceder a las propiedades
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    // Método abstracto que debe implementarse en las clases hijas
    public abstract void jefe();

}