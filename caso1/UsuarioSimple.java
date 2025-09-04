import java.util.Scanner;

public class UsuariosSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese su nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese su edad: ");
            String edadTexto = sc.nextLine();
            int edad = Integer.parseInt(edadTexto);

            System.out.print("Ingrese su género: ");
            String genero = sc.nextLine();

            System.out.println("\nDatos ingresados:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Género: " + genero);

        } catch (NumberFormatException e) {
            System.out.println("Error: La edad debe ser un número entero válido.");
        }

        sc.close();
    }
}

