//Programa que lee un caracter por teclado y comprueba si es una letra mayúscula
import java.util.Scanner;

public class CondicionalesCaracter{
    public static void main (String [] args){
        char caracter;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el caracter deseado: ");
        caracter = entrada.next().charAt(0);
        if (Character.isUpperCase(caracter)) {
            System.out.println("El caracter ingresado está en mayuscula");
        }
        else{
            System.out.println("El caracter ingresado esta en minuscula");
        }
    }
}