public class Establecimiento {

    protected String nombreEstablecimiento;
    protected int valorStock;
    protected int totalProductos;

    public Establecimiento(String nombreEstablecimiento, int valorStock, int totalProductos) {
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.valorStock = valorStock;
        this.totalProductos = totalProductos;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public int getValorStock() {
        return valorStock;
    }

    public void setValorStock(int valorStock) {
        this.valorStock = valorStock;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }
}