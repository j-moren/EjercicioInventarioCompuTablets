// Parcial Inventario Equipos Tecnologicos en Colas (Computadores-Tablets): Johnatan Moreno
import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner = new Scanner(System.in);
    private MenuComputador menuComputador = new MenuComputador();
    private MenuTablet menuTablet = new MenuTablet();

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Administrar Computadores");
            System.out.println("2. Administrar Tablets");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    menuComputador.mostrarMenu();
                    break;
                case 2:
                    menuTablet.mostrarMenu();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.mostrarMenu();
    }
}
