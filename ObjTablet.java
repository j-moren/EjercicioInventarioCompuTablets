
public class ObjTablet {
    private String serial, marca, tamaño, nombreUsuario;
    private double precio;
    private boolean disponible;

    public ObjTablet(String serial, String marca, String tamaño, double precio, String nombreUsuario, boolean disponible) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        this.nombreUsuario = nombreUsuario;
        this.disponible = disponible;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
