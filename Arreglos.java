
public class Arreglos{
    public static void main(String [] args){
        int [] numeros = {4,5,6};
        for(int i=0;i<3;i++){
            System.out.println(numeros[i]);
        }

        System.out.println("---------");
        
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        
         for(int i=0;i<3;i++){
            System.out.println(numeros[i]);
            System.out.println(numeros[i]);
        }
    }
}