
import java.util.Scanner;

/**
 *
 * @author ArnauGarcia-AlumnoCE
 */
public class Tapa {

    private String nombre;
    private String[] ingredientes = new String[8];
    private int numIngredientes;
    private double precio;

    // ----------------- Constructor por defecto -------------------- //
    public Tapa() {
    }

    // ----------------- Metodos -------------------- //
    // Metodo añadir ingrediente
    public void añadirIngrediente(String nuevo) {
        if (this.numIngredientes < this.ingredientes.length) {
            this.ingredientes[this.numIngredientes] = nuevo;
            this.numIngredientes++;
        } else {
            System.out.println("No se pueden añadir mas ingredientes");
        }
    }

    // Metodo quitar ingrediente
    public void quitarIngrediente(int num) {
        for (int i = 1; i < this.ingredientes.length; i++) {
            if (i == num) {
                this.ingredientes[i] = "";
            }
        }
    }

    // Metodo mostrar ingrediente
    public String[] mostrarIngredientes() {
        for (int i = 0; i < this.ingredientes.length; i++) {
            System.out.println("El ingrediente numero " + (i + 1) + " es " + this.ingredientes[i]);
        }
        return this.ingredientes;
    }

    //Metodo modificar precio
    public double modificarPrecio(double precio) {
        this.precio = precio;
        return this.precio;
    }

    // Metodo mostrar precio
    public void mostrarPrecio() {
        System.out.println("El precio de la tapa es: " + this.precio);
    }

    // Metodo leer
    public void leer() {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        System.out.println("Introduce el nombre de la tapa:");
        this.nombre = sc.nextLine();
        
        System.out.println("Introduce los ingredientes de la tapa: ");
        añadirIngrediente(sc.next());

        System.out.println("Introduce el precio de la tapa:");
        this.precio = sc.nextDouble();
    }

    // Metodo mostrar tapa
    public void mostrarTapa() {
        System.out.println("La tapa con nombre: " + this.nombre);
        System.out.println("Tiene como ingredientes :");
        mostrarIngredientes();
        System.out.println("Y un precio de: " + this.precio + "€.");
    }
}
