
public class ObjComputador {
    private String serial, marca, memoriaRam, discoDuro, nombreUsuario;
    private double precio;
    private boolean disponible;

    public ObjComputador(String serial, String marca, String memoriaRam, String discoDuro, double precio, String nombreUsuario, boolean disponible) {
        this.serial = serial;
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.discoDuro = discoDuro;
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

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
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

