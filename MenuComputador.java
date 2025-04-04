import java.util.Scanner;

public class MenuComputador {
    private MetodosGenerales metodos = new MetodosGenerales();
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== Menú Computadores ===");
            System.out.println("1. Agregar Computador");
            System.out.println("2. Modificar Computador");
            System.out.println("3. Devolver Computador");
            System.out.println("4. Mostrar Inventario de Computadores");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    metodos.agregarComputador();
                    break;
                case 2:
                    System.out.print("Ingrese el serial del computador a modificar: ");
                    String serialModificar = scanner.nextLine();
                    metodos.modificarComputador(serialModificar);
                    break;
                case 3:
                    metodos.devolverComputador();
                    break;
                case 4:
                    metodos.mostrarInventarioComputadores();
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