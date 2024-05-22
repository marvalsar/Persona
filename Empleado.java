public class Empleado extends Persona {
    private String cargo;

    //Constructor con parámetros
    public Empleado(String nombre, String apellido, String genero, int edad, String cargo){
        super(nombre,apellido, genero,edad);
        this.cargo = cargo;
    }

    // Getter y Setter para cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método específico para capacitación de empleados
    public void capacitación() {
        System.out.println("Capacitación específica para empleados");
    }

    // Implementación del método jefe()
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion()+ "\nCargo: "+cargo;
    }
    

}
