import java.util.Random;
import java.util.Scanner;

public class Desafio_03_Controlandoelflujodelaaplicacion {

    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);
        int intentosMaximos = 5;
        System.out.println(numeroAleatorio);
        System.out.println("Bienvenido al juego de adivinanzas");
        System.out.println("Adivina el número entre 0 y 100. Tienes " + intentosMaximos + " intentos.");
        

        
        Scanner teclado = new Scanner(System.in);

        for (int intentos = 4; intentos >= 0 ; intentos--) {
            System.out.println("Ingresa el que crees es el numero secreto");
            int numeroUsuario = teclado.nextInt();

            if(numeroUsuario > numeroAleatorio){
                System.out.println("El número ingresado es mayor que el número aleatorio tienes " + intentos + " Intentos restantes ");
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número ingresado es menor que el número aleatorio tienes " + intentos + " Intentos restantes");
            } else{
                System.out.println("Felicidades acertaste el número secreto :)");
                break;
            }
            if(intentos == 0){
                System.out.println("Lo siento, se acabaron los intentos.");
                System.out.println("El número secreto era: " + numeroAleatorio);
            }

        }


    }
}
