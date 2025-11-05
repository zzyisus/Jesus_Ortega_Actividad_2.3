public class Producto {
    private String nombre;
    private int stock;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public void agregarStock(int cantidad) {
        stock += cantidad;
    }

    public boolean restarStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre + " | Stock: " + stock);
    }
}
