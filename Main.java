import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        //creamos las variables para el promdio de las edades
        int totalEdades = 0;
        int cantidadPersonas = 5;

        // Contador para género masculino y femenino
        int contadorMasculino = 0;
        int contadorFemenino = 0;

        //Arreglo para almacenar los datos de los empleados
        String[] nombreEmpleado = new String[4];
        String[] apellidoEmpleado = new String[4];
        String[] generoEmpleado = new String[4];
        String[] edadEmpleado = new String[4];
        int[] edad = new int[4];
        String[] cargoEmpleado = new String[4];

        //Utilizamos un bucle for para solicitar al usuario que ingrese los datos de los empleados
        for(int i = 0; i < 4; i++){
            //Cada dato ingresado se almacena en una posición del arreglo
            nombreEmpleado[i] = JOptionPane.showInputDialog("Ingresa el nombre del empleado"+(i+1)+":");
            apellidoEmpleado[i] = JOptionPane.showInputDialog("Ingresa el apellidodel empleado"+(i+1)+":");
            generoEmpleado[i] = JOptionPane.showInputDialog("Ingresa el género del empleado"+(i+1)+":F/M");
            
            if (generoEmpleado[i].equalsIgnoreCase("M")) {
                contadorMasculino++;
            }else if (generoEmpleado[i].equalsIgnoreCase("F")) {
                contadorFemenino++;
            }

            edadEmpleado[i] = JOptionPane.showInputDialog("Ingresa la edad del empleado"+(i+1)+":"); 
            edad[i] = Integer.parseInt(edadEmpleado[i]);

            totalEdades += edad[i]; //sumar la edad del empleado al total

            cargoEmpleado[i] = JOptionPane.showInputDialog("Ingresa el cargo del empleado"+(i+1)+":");
        }

        //Arreglo para almacenar los datos del jefe
        String[] nombreJefe = new String[1];
        String[] apellidoJefe = new String[1];
        String[] generoJefe = new String[1];
        String[] edadJefe = new String[1];
        int[] edadJ = new int[1];
        String[] departamentoJefe = new String[1];

        for(int i = 0; i < 1; i++){
            //Cada dato ingresado se almacena en una posición del arreglo
            nombreJefe[i] = JOptionPane.showInputDialog("Ingresa el nombre del jefe"+(i+1)+":");
            apellidoJefe[i] = JOptionPane.showInputDialog("Ingresa el apellido del jefe"+(i+1)+":");
            generoJefe[i] = JOptionPane.showInputDialog("Ingresa el género del jefe"+(i+1)+":F/M");
            
            if (generoJefe[i].equalsIgnoreCase("M")) {
                contadorMasculino++;
            }else if (generoJefe[i].equalsIgnoreCase("F")) {
                contadorFemenino++;
            }

            edadJefe[i] = JOptionPane.showInputDialog("Ingresa la edad del jefe"+(i+1)+":");
            edadJ[i] = Integer.parseInt(edadEmpleado[i]);

            totalEdades += edadJ[i]; //sumar la edad del jefe al total
            
            departamentoJefe[i] = JOptionPane.showInputDialog("Ingrese el departamento del jefe"+(i+1)+":");
        }

        //mostramos los datos ingresados
        for(String nombre: nombreEmpleado){
            JOptionPane.showMessageDialog(null, "\nLos empleados son: "+nombre);
        }
        for(String nombre: nombreJefe){
            JOptionPane.showMessageDialog(null, "\nEl jefe es: "+nombre);
        }

        for(String genero: generoEmpleado){
            JOptionPane.showMessageDialog(null, "\nGeneros empleados: "+genero);
        }
        for(String genero: generoJefe){
            JOptionPane.showMessageDialog(null, "\nGenero jefe: "+genero);
        }

        //Mostramos el promedio de las edades
        double promedio = (double) totalEdades / cantidadPersonas;
        JOptionPane.showMessageDialog(null,"El promedio de las edades es: " + promedio);

        //Mostramos cuantas personas del genero masculino y femenino hay
        JOptionPane.showMessageDialog(null,"Cantidad de personas con género masculino: " + contadorMasculino);
        JOptionPane.showMessageDialog(null,"Cantidad de personas con género femenino: " + contadorFemenino);
    
    }

}
