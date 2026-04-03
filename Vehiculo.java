import java.util.Scanner;

public class Vehiculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String marca;
        String modelo;
        int cilindrada;
        String combustible;
        int pasajeros;

        System.out.print("Ingrese la marca: ");
        marca = sc.nextLine();

        System.out.print("Ingrese el modelo: ");
        modelo = sc.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        cilindrada = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el tipo de combustible: ");
        combustible = sc.nextLine();

        System.out.print("Ingrese la capacidad de pasajeros: ");
        pasajeros = sc.nextInt();

        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros.");

        sc.close();
    }
}