package EjercicioTres;

public class Main {
    public static void main(String[] args) {
        //Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan Perez", 30);

        //Acceso al atributo edad directamente (acceso de paquete)
        System.out.println("Edad (acceso directo): " + persona.edad);

        //Intento de acceso directo al atributo nombre (privado)
        //System.out.println("Nombre: " + persona.nombre); //Esto genera un error de compilacion

        //Acceso al atributo nombre a traves de los metodos get y set
        System.out.println("Nombre (a traves de get): " + persona.getNombre());
        persona.setNombre("Carlos Gomez");
        System.out.println("Nombre actualizado (a traves de set): " + persona.getNombre());
    }
}
