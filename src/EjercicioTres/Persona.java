package EjercicioTres;

class Persona {
    private String nombre; 
    int edad; 

    //Constructor con acceso de paquete (default)
    Persona(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad; 
    }

    //Metodo publico para obtener el valor de nombre
    public String getNombre() {
        return nombre; 
    }

    //Metodo publico para establecer el valor de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        //Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan Perez", 30);

        //Acceso al atributo edad directamente (acceso de paquete)
        System.out.println("Edad (acceso directo): " + persona.edad);

        //Intento de acceso directo al atributo nombre (privado)
        System.out.println("Nombre: " + persona.nombre); //Esto genera un error de compilacion

        //Acceso al atributo nombre a traves de los metodos get y set
        System.out.println("Nombre (a traves de get): " + persona.getNombre());
        persona.setNombre("Carlos Gomez");
        System.out.println("Nombre actualizado (a traves de set): " + persona.getNombre());
    }
}
