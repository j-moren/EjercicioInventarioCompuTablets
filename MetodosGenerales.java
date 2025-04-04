import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MetodosGenerales {
    private Queue<ObjComputador> colaComputadores = new LinkedList<>();
    private Queue<ObjTablet> colaTablets = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarComputador() {
        System.out.print("Ingrese Serial: ");
        String serial = scanner.nextLine().trim();
        System.out.print("Ingrese Marca: ");
        String marca = scanner.nextLine().trim();
        System.out.print("Ingrese Memoria RAM: ");
        String memoriaRam = scanner.nextLine().trim();
        System.out.print("Ingrese Disco Duro: ");
        String discoDuro = scanner.nextLine().trim();
        System.out.print("Ingrese Precio: ");
        double precio = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Ingrese Nombre de Usuario: ");
        String nombreUsuario = scanner.nextLine().trim();
        System.out.print("Está Disponible? (si/no): ");
        boolean disponible = scanner.nextLine().trim().equalsIgnoreCase("si");

        colaComputadores.add(new ObjComputador(serial, marca, memoriaRam, discoDuro, precio, nombreUsuario, disponible));
        System.out.println("Computador agregado con éxito!");
    }

    public void agregarTablet() {
        System.out.print("Ingrese Serial: ");
        String serial = scanner.nextLine().trim();
        System.out.print("Ingrese Marca: ");
        String marca = scanner.nextLine().trim();
        System.out.print("Ingrese Tamaño: ");
        String tamaño = scanner.nextLine().trim();
        System.out.print("Ingrese Precio: ");
        double precio = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Ingrese Nombre de Usuario: ");
        String nombreUsuario = scanner.nextLine().trim();
        System.out.print("Está Disponible? (si/no): ");
        boolean disponible = scanner.nextLine().trim().equalsIgnoreCase("si");

        colaTablets.add(new ObjTablet(serial, marca, tamaño, precio, nombreUsuario, disponible));
        System.out.println("Tablet agregada con éxito!");
    }

    public void modificarComputador(String serial) {
        for (ObjComputador c : colaComputadores) {
            if (c.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Modificando Computador con Serial: " + serial);
                System.out.print("Ingrese nueva Marca: ");
                c.setMarca(scanner.nextLine().trim());
                System.out.print("Ingrese nueva Memoria RAM: ");
                c.setMemoriaRam(scanner.nextLine().trim());
                System.out.print("Ingrese nuevo Disco Duro: ");
                c.setDiscoDuro(scanner.nextLine().trim());
                System.out.print("Ingrese nuevo Precio: ");
                c.setPrecio(Double.parseDouble(scanner.nextLine().trim()));
                System.out.print("Ingrese nuevo Nombre de Usuario: ");
                c.setNombreUsuario(scanner.nextLine().trim());
                System.out.print("Está Disponible? (si/no): ");
                c.setDisponible(scanner.nextLine().trim().equalsIgnoreCase("si"));

                System.out.println("Computador modificado con éxito!");
                return;
            }
        }
        System.out.println("Computador no encontrado.");
    }

    public void modificarTablet(String serial) {
        for (ObjTablet t : colaTablets) {
            if (t.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Modificando Tablet con Serial: " + serial);
                System.out.print("Ingrese nueva Marca: ");
                t.setMarca(scanner.nextLine().trim());
                System.out.print("Ingrese nuevo Tamaño: ");
                t.setTamaño(scanner.nextLine().trim());
                System.out.print("Ingrese nuevo Precio: ");
                t.setPrecio(Double.parseDouble(scanner.nextLine().trim()));
                System.out.print("Ingrese nuevo Nombre de Usuario: ");
                t.setNombreUsuario(scanner.nextLine().trim());
                System.out.print("Está Disponible? (si/no): ");
                t.setDisponible(scanner.nextLine().trim().equalsIgnoreCase("si"));

                System.out.println("Tablet modificada con éxito!");
                return;
            }
        }
        System.out.println("Tablet no encontrada.");
    }

    public void devolverComputador() {
        if (!colaComputadores.isEmpty()) {
            ObjComputador c = colaComputadores.poll();
            c.setDisponible(true);
            c.setNombreUsuario("N/A");
            System.out.println("Computador devuelto con éxito!");
        } else {
            System.out.println("No hay computadores en inventario.");
        }
    }

    public void devolverTablet() {
        if (!colaTablets.isEmpty()) {
            ObjTablet t = colaTablets.poll();
            t.setDisponible(true);
            t.setNombreUsuario("N/A");
            System.out.println("Tablet devuelta con éxito!");
        } else {
            System.out.println("No hay tablets en inventario.");
        }
    }

    public void mostrarInventarioComputadores() {
        if (colaComputadores.isEmpty()) {
            System.out.println("No hay computadores en el inventario.");
            return;
        }
        for (ObjComputador c : colaComputadores) {
            System.out.println("Serial: " + c.getSerial() + ", Marca: " + c.getMarca() + ", Disponible: " + c.isDisponible());
        }
    }

    public void mostrarInventarioTablets() {
        if (colaTablets.isEmpty()) {
            System.out.println("No hay tablets en el inventario.");
            return;
        }
        for (ObjTablet t : colaTablets) {
            System.out.println("Serial: " + t.getSerial() + ", Marca: " + t.getMarca() + ", Disponible: " + t.isDisponible());
        }
    }
}
