public class Persona{
    String nombre, apellido,direccion;
    String rut;
    int edad, telefono;

    Persona(String nombre, String apellido, String rut, int edad, int telefono, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public void modificarRut(String rut){

        //boolean valido = Rut.validar(rut);

        if(valido == true){
            this.rut = rut;
            System.out.println("La modificación ha sido exitosa");
        }
        else{
            System.out.println("El rut ingresado es inválido, no se han hecho modificaciones");
        }

    }
    public void modificarEdad(int edad){
        this.edad = edad;

    }
    public void modificarNombre(String nombre){
        this.nombre = nombre;

    }
    public void modificarApellido(String apellido){
        this.apellido = apellido;

    }
    public String verInfoPersona(){
        return "Nombre: "+this.nombre+"\n"+
        "Apellido: "+this.apellido+"\n"+
        "Rut: "+this.rut+"\n"+
        "Edad: "+this.edad+"\n"+
        "Teléfono: "+this.telefono+"\n"+
        "Dirección: "+this.direccion;
    }
    
}