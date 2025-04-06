import java.util.Scanner;

public class Banlocombia {

    public static void main(String[] args) {

        String clientName = "Bugs Bunny";
        double saldo = 1599.99;
        int option = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Banlocombia, " + clientName + " !");


        while (option != 4){
        System.out.println("\n--- Menú ---");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");

        option = scanner.nextInt();

        switch (option ){
            case 1:
                System.out.printf("Tu saldo actual es de $%.2f\n", saldo);
                break;
            case 2:
                System.out.println("Ingrese el saldo a retirar");
                double retiro = scanner.nextDouble();
                if(retiro > saldo ){
                    System.out.println("Saldos insuficientes");
                } else {
                    saldo = saldo - retiro;
                }
                System.out.println("Nuevo saldo: " + saldo);

                break;
            case 3:
                System.out.println("Cuanto dinero deseas depositar?");
                double deposito = scanner.nextDouble();
                if (deposito > 0) {
                    saldo += deposito;
                    System.out.println("Depósito exitoso.");
                } else {
                    System.out.println("Monto inválido. Debe ser mayor que cero.");
                }
                System.out.println("Nuevo saldo: " + saldo);


                break;
            case 4:
                System.out.println("Gracias por usar nuestros servicios, hasta luego!");
                break;

            default:
                System.out.println("Opcion inválida");
                break;
        }
        }


    }
}
