import java.util.Scanner;

public class MenuTablet {
    private MetodosGenerales metodos = new MetodosGenerales();
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== Menú Tablets ===");
            System.out.println("1. Agregar Tablet");
            System.out.println("2. Modificar Tablet");
            System.out.println("3. Devolver Tablet");
            System.out.println("4. Mostrar Inventario de Tablets");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    metodos.agregarTablet();
                    break;
                case 2:
                    System.out.print("Ingrese el serial de la tablet a modificar: ");
                    String serialModificar = scanner.nextLine();
                    metodos.modificarTablet(serialModificar);
                    break;
                case 3:
                    metodos.devolverTablet();
                    break;
                case 4:
                    metodos.mostrarInventarioTablets();
                    break;
                case 5:
                    System.out.println("Regresando al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }
}