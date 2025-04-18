public class Rut {
    String rut;
    char digito;
    Boolean valido;

    Rut(String rut){//xxyyyxxx-D
        this.rut = rut;
    }

    public void verRut(){
        System.out.println("Rut: "+this.rut);

    }

    public boolean validar(String rut){
        char digito = rut.charAt(rut.length()-1);
        //Procesar el rut de entrada de Derecha a Izquierda
        int indice = 2;
        int sumaParcial =0;
        int sumaTotal = 0;
        boolean rutCorrecto = true;
        for(int i=rut.length()-1;i>=0;i--){
            //Opción 1: Usar la distancia en el código ASCII
            //sumaParcial = (rutEntrada.charAt(i)-48)*indice;
            //Opción 2: Usar la conversión de String a Número
            sumaParcial = Integer.parseInt(rut.charAt(i)+"")*indice;
            sumaTotal = sumaTotal + sumaParcial;
            //System.out.println(rutEntrada.charAt(i)+"x"+indice+"="+sumaParcial);
            indice++;
            if(indice>7){
                indice=2;
            }
        }
        //Multiplicar cada elemento del rut por un numero de la serie 2 3 4 5 6 7
        //Sumar todas las multiplicaciones parciales
        //System.out.println("La Suma Total: "+sumaTotal);
        //X = Obtener el módulo 11 de la suma anterior
        int x = sumaTotal%11;
        //Restar 11 - X --> Corresponde al dígito verificador...
        int digitoSalida = 11-x;
        char digitoFinal = (char)(digitoSalida+48);
        //Si dígito = 10 -> Se reemplaza por K. Si dígito = 11 -> Se reeemplaza por 0. Si no es 10 y no es 11 -> Se mantiene la cifra obtenida
        if(digitoSalida==10){
            digitoFinal = 'K';
        }else{
            if(digitoSalida==11)
                digitoFinal='0';
        }
        if(digito == digitoFinal){
            return rutCorrecto;
        }else{
            rutCorrecto = false;
            return rutCorrecto;
        }
    

    }



}