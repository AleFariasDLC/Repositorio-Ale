public class Ejecutora{
    public static void main(String[] args) {
        Persona p1 = new Persona("Vicente","Farias", "21478036-4", 21, 934478472, "Pasaje Magnolio 2624");
        System.out.println(p1.verInfoPersona());
        p1.modificarRut("21439612-2");
    }    
}