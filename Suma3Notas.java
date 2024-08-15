import java.util.Scanner;

public class Suma3Notas{
    public static void main(String [] args){

       //Programa que suma 3 notas
       float nota1, nota2, nota3, suma;
       Scanner entrada = new Scanner (System.in);
       System.out.println("Ingrese las 3 notas: ");
       nota1 = entrada.nextFloat();
       nota2 = entrada.nextFloat();
       nota3 = entrada.nextFloat();
       suma = nota1+nota2+nota3;
       System.out.println("La suma de las 3 notas es: "+suma);
    }
}