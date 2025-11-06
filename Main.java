import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bodega bodega = new Bodega();
        int opcion;

        do {
            System.out.println("\n=== MENÚ BODEGA ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Aumentar stock");
            System.out.println("4. Disminuir stock");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Stock inicial: ");
                    int stock = sc.nextInt();
                    bodega.agregarProducto(new Producto(nombre, stock));
                    System.out.println("Producto agregado correctamente.");
                    break;
                case 2:
                    bodega.listarProductos();
                    break;
                case 3:
                    System.out.print("Nombre del producto: ");
                    nombre = sc.nextLine();
                    Producto p = bodega.buscarProducto(nombre);
                    if (p != null) {
                        System.out.print("Cantidad a aumentar: ");
                        int cant = sc.nextInt();
                        p.agregarStock(cant);
                        System.out.println("Stock actualizado.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Nombre del producto: ");
                    nombre = sc.nextLine();
                    p = bodega.buscarProducto(nombre);
                    if (p != null) {
                        System.out.print("Cantidad a disminuir: ");
                        int cant = sc.nextInt();
                        if (p.restarStock(cant)) {
                            System.out.println("Stock actualizado.");
                        } else {
                            System.out.println("Stock insuficiente.");
                        }
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
