
import java.util.Scanner;


class Estudiante {
    // Atributos privados
    private String nombre;
    private int edad;
    private String carrera;
    private String correo;
    private String celular;
    private String ciudad;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera, String correo, String celular, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.correo = correo;
        this.celular = celular;
        this.ciudad = ciudad;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    
    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }
    
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    // Método para mostrar información
    public void mostrarDatos() {
        System.out.println("\n📘 Datos del Estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Correo: " + correo);
        System.out.println("Celular: " + celular);
        System.out.println("Ciudad: " + ciudad);
        
    }
}
public class EstudianteInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese la carrera del estudiante: ");
        String carrera = sc.nextLine();
        
        System.out.print("Ingrese el correo del estudiante: ");
        String correo = sc.nextLine();

        System.out.print("Ingrese el celular del estudiante: ");
        String celular = sc.nextLine();
      
        System.out.print("Ingrese la ciudad del estudiante: ");
        String ciudad = sc.nextLine();
        
        // Crear objeto Estudiante
        Estudiante est = new Estudiante(nombre, edad, carrera, correo, celular, ciudad);

        // Mostrar datos
        est.mostrarDatos();

        sc.close();
    }
}