package caso1;

import java.util.Scanner;

public class UsuarioSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su ciudad: ");
        sc.nextLine(); // limpiar buffer
        String ciudad = sc.nextLine();

        System.out.println("\n--- Datos del Usuario ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);

        sc.close();
    }
}
