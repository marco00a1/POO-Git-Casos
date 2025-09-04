import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private String tipoCuenta;
    private String banco;
    private boolean estado; // activa true, falso = bloqueado
    private double saldo;

 // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, String tipoCuenta, String banco, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.banco = banco;
        this.estado = true; // por defecto activa
        this.saldo = saldoInicial;
    }

    // Depositar
    public void depositar(double monto) {
        if (!estado) {
            System.out.println("La cuenta está bloqueada. No se puede operar.");
            return;
        }
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println(" El monto a depositar debe ser positivo.");
        }
    }

    // Retirar
    public void retirar(double monto) {
        if (!estado) {
            System.out.println("La cuenta está bloqueada. No se puede operar.");
            return;
        }
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Retiro no permitido. Fondos insuficientes o monto inválido.");
        }
    }

 // Mostrar saldo
    public void mostrarSaldo() {
        System.out.println("\n===== CONSULTA DE SALDO =====");
        System.out.println("Titular       : " + titular);
        System.out.println("Número Cuenta : " + numeroCuenta);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Banco         : " + banco);
        System.out.println("Estado        : " + (estado ? "Activa ✅" : "Bloqueada ❌"));
        System.out.println("Saldo actual  : " + saldo);
        System.out.println("=============================\n");
    }

    // Bloquear cuenta
    public void bloquearCuenta() {
        estado = false;
        System.out.println("La cuenta ha sido bloqueada.");
    }

    // Activar cuenta
    public void activarCuenta() {
        estado = true;
        System.out.println("La cuenta ha sido activada.");
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear cuenta bancaria
        System.out.print("Ingrese el nombre del titular: ");
        String titular = sc.nextLine();

        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.print("Ingrese el tipo de cuenta (Ahorros/Corriente): ");
        String tipoCuenta = sc.nextLine();

        System.out.print("Ingrese el banco: ");
        String banco = sc.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(titular, numeroCuenta, tipoCuenta, banco, saldoInicial);

        // Menú interactivo
        int opcion;
        do {
            System.out.println("\n--- MENÚ BANCO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Bloquear cuenta");
            System.out.println("5. Activar cuenta");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> cuenta.mostrarSaldo();
                case 2 -> {
                    System.out.print("Ingrese monto a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                }
                case 3 -> {
                    System.out.print("Ingrese monto a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                }
                case 4 -> cuenta.bloquearCuenta();
                case 5 -> cuenta.activarCuenta();
                case 6 -> System.out.println("Gracias por usar el sistema bancario.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        sc.close();
    }
}