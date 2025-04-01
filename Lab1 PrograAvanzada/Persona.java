public class Persona{
    String nombre, apellido,direccion;
    Rut rut;
    int edad, telefono;

    Persona(String nombre, String apellido, Rut rut, int edad, int telefono, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public void modificarRut(String rut){
        //this.rut = rut;

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
    public void verInfoPersona(){
        return "Nombre: "+this.nombre+", Apellido: "+this.apellido+", Rut: "+this.rut+", Edad: "+this.edad+", Teléfono: "+this.telefono+", Dirección: "+this.direccion;
    }

}