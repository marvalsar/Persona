import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        int[] edadEmpleado = new int[4];
        String[] cargoEmpleado = new String[4];

        //Utilizamos un bucle for para solicitar al usuario que ingrese los datos de los empleados
        for(int i = 0; i < 4; i++){
            //Cada dato ingresado se almacena en una posición del arreglo
            System.out.println("Ingresa el nombre del empleado"+(i+1)+":");
            nombreEmpleado[i] = scanner.nextLine();
            System.out.println("Ingresa el apellidodel empleado"+(i+1)+":");
            apellidoEmpleado[i] = scanner.nextLine();
            System.out.println("Ingresa el género del empleado"+(i+1)+":F/M");
            generoEmpleado[i] = scanner.nextLine();
            if (generoEmpleado[i].equalsIgnoreCase("M")) {
                contadorMasculino++;
            }else if (generoEmpleado[i].equalsIgnoreCase("F")) {
                contadorFemenino++;
            }

            System.out.println("Ingresa la edad del empleado"+(i+1)+":");
            edadEmpleado[i] = scanner.nextInt();
            scanner.nextLine();
            
            
            System.out.println("Ingrese el cargo del empleado"+(i+1)+":");
            cargoEmpleado[i] = scanner.nextLine();
        }

        //Arreglo para almacenar los datos del jefe
        String[] nombreJefe = new String[1];
        String[] apellidoJefe = new String[1];
        String[] generoJefe = new String[1];
        int[] edadJefe = new int[1];
        String[] departamentoJefe = new String[1];

        for(int i = 0; i < 1; i++){
            //Cada dato ingresado se almacena en una posición del arreglo
            System.out.println("Ingresa el nombre del jefe"+(i+1)+":");
            nombreJefe[i] = scanner.nextLine();
            System.out.println("Ingresa el apellido del jefe"+(i+1)+":");
            apellidoJefe[i] = scanner.nextLine();
            System.out.println("Ingresa el género del jefe"+(i+1)+":F/M");
            generoJefe[i] = scanner.nextLine();
            if (generoJefe[i].equalsIgnoreCase("M")) {
                contadorMasculino++;
            }else if (generoJefe[i].equalsIgnoreCase("F")) {
                contadorFemenino++;
            }

            System.out.println("Ingresa la edad del jefe"+(i+1)+":");
            edadJefe[i] = scanner.nextInt();
            scanner.nextLine();
            totalEdades += edadJefe[i]; //sumar la edad del jefe al total
            
            System.out.println("Ingrese el departamento del jefe"+(i+1)+":");
            departamentoJefe[i] = scanner.nextLine();
        }

        //mostramos los datos ingresados
        System.out.println("\nLos nombres ingresados son: ");
        for(String nombre: nombreEmpleado){
            System.out.println(nombre);
        }
        for(String nombre: nombreJefe){
            System.out.println(nombre);
        }

        System.out.println("\nLos géneros ingresados son: ");
        for(String genero: generoEmpleado){
            System.out.println(genero);
        }
        for(String genero: generoJefe){
            System.out.println(genero);
        }

        //Mostramos el promedio de las edades
        double promedio = (double) totalEdades / cantidadPersonas;
        System.out.println("El promedio de las edades es: " + promedio);

        //Mostramos cuantas personas del genero masculino y femenino hay
        System.out.println("Cantidad de personas con género masculino: " + contadorMasculino);
        System.out.println("Cantidad de personas con género femenino: " + contadorFemenino);
    
    scanner.close();
    }

}
