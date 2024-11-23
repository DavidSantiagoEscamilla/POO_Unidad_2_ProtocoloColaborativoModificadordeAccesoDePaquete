package EjercicioUno;

class Producto {
    String nombre; 
    double precio; 
    int stock; 

    //Constructor con acceso de paquete (default)
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre; 
        this.precio = precio; 
        this.stock = stock; 
    }

    //Metodo con acceso de paquete (default) para mostrar detalles del producto
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio); 
        System.out.println("Stock: " + stock); 
    }

    public static void main(String[] args) {
        //Crear un objeto de la clase Producto
        Producto producto = new Producto("Laptop", 2500000, 5);

        //Acceder a las propiedades directamente (acceso de paquete)
        System.out.println("Acceso directo a las propiedades:");
        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: " + producto.precio);
        System.out.println("Stock: " + producto.stock);

        //Llamar al metodo mostrarInfo()
        System.out.println("\nDetalles del producto a traves del metodo:");
        producto.mostrarInfo();
    }
}
