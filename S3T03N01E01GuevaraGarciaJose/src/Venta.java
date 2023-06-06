public class Venta extends Producto {

    protected int numeroVenta;
    public Venta(int numeroVenta, String tipoProducto, String colorPlanta, String material, int tamañoPlanta, int precio, int stock) {
        super(tipoProducto, colorPlanta, material, tamañoPlanta, precio, stock);
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
}
