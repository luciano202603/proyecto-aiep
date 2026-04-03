import java.util.Scanner; // Se importa la clase Scanner para poder leer datos desde el teclado

public class Vehiculo { // Se define la clase principal llamada Vehiculo

    public static void main(String[] args) { // Método principal donde comienza la ejecución del programa

        Scanner sc = new Scanner(System.in); // Se crea un objeto Scanner para capturar datos ingresados por el usuario

        // Declaración de variables
        String marca; // Variable que almacenará la marca del vehículo
        String modelo; // Variable que almacenará el modelo del vehículo
        int cilindrada; // Variable que almacenará la cilindrada (número entero)
        String combustible; // Variable que almacenará el tipo de combustible
        int pasajeros; // Variable que almacenará la cantidad de pasajeros

        // Entrada de datos
        System.out.println("Ingrese la marca:"); // Se solicita al usuario ingresar la marca
        marca = sc.nextLine(); // Se captura el texto ingresado y se guarda en la variable marca

        System.out.println("Ingrese el modelo:"); // Se solicita el modelo
        modelo = sc.nextLine(); // Se guarda el modelo ingresado

        System.out.println("Ingrese la cilindrada:"); // Se solicita la cilindrada del vehiculo
        cilindrada = sc.nextInt(); // Se captura un número entero

        sc.nextLine(); // Limpia el buffer (evita errores al leer Strings después de int)

        System.out.println("Ingrese el tipo de combustible:"); // Se solicita el combustible
        combustible = sc.nextLine(); // Se guarda el tipo de combustible

        System.out.println("Ingrese la capacidad de pasajeros:"); // Se solicita cantidad de pasajeros
        pasajeros = sc.nextInt(); // Se captura el número de pasajeros

        // Salida de datos
        System.out.println("La marca que ha ingresado es: " + marca); // Muestra la marca
        System.out.println("El modelo que ha ingresado es: " + modelo); // Muestra el modelo
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); // Muestra la cilindrada
        System.out.println("El tipo de combustible es: " + combustible); // Muestra el combustible
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros."); // Muestra la capacidad

    }
}
