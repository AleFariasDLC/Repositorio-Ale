//Programa que lee enteros y dice si es multiplo de 10
import java.util.Scanner;

public class CondicionalesEntero{
    public static void main (String [] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea: ");
        num = entrada.nextInt();
        if ((num%10)==0){
            System.out.println("El numero ingresado es multiplo de 10");
        }
        else{
            System.out.println("El numero ingresado NO es multiplo de 10");
        }

    }
}