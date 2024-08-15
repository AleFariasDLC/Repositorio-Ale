//Programa qur calcula el dinero de 3 personas

import java.util.Scanner;

public class DineroGuillermo{
    public static void main(String [] args ){
        float dGuillermo, dLuis, dJuan, total;
        System.out.println("Ingrese la cantidad de dinero que tiene Guillermo: ");
        Scanner entrada = new Scanner (System.in);
        dGuillermo = entrada.nextFloat();
        dLuis = dGuillermo/2;
        dJuan = (dGuillermo+dLuis)/2;
        total = dGuillermo+dLuis+dJuan;
        System.out.println("Guillermo tiene: "+dGuillermo+"$");
        System.out.println("Luis tiene: "+dLuis+"$");
        System.out.println("Juan tiene: "+dJuan+"$");
        System.out.println("El total es: "+total+"$");
    }
}